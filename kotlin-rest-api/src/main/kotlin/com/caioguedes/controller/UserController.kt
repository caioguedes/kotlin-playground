package com.caioguedes.controller

import com.caioguedes.model.Address
import com.caioguedes.model.User
import com.caioguedes.request.UserRequest
import com.caioguedes.service.UserService
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import io.micronaut.http.annotation.Status
import io.micronaut.http.exceptions.HttpStatusException

@Controller("/users")
class UserController(
    private val service: UserService
) {
    @Post
    @Status(HttpStatus.CREATED)
    fun create(request: UserRequest) = service.create(request.toModel())

    @Get
    @Status(HttpStatus.OK)
    fun findAll() = service.findAll()

    @Get("/{id}")
    fun findById(id: String) = service.findById(id)
        // Awesome! Handy Exception provided by Micronaut
        .orElseThrow { HttpStatusException(HttpStatus.NOT_FOUND, "User with id $id was not found.") }

    @Put("/{id}")
    fun update(id: String, request: UserRequest) =
        service.update(id, request.toModel())

    // New! Extension Function
    // Note! Some articles suggest not to use `to` prefix for extension functions (`asUser` or `mapToUser)
    private fun UserRequest.toModel(): User = User(
        name = this.name,
        email = this.email,
        address = Address(street = this.street, city = this.city, code = this.code)
    )
}