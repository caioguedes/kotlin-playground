package com.caioguedes.controller

import com.caioguedes.model.Address
import com.caioguedes.model.User
import com.caioguedes.request.UserRequest
import com.caioguedes.service.UserService
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import io.micronaut.http.exceptions.HttpStatusException
import java.util.*

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
    @Status(HttpStatus.OK)
    fun findById(id: String) = service.findById(id).orThrowNotFoundException(id)

    @Put("/{id}")
    @Status(HttpStatus.OK)
    fun update(id: String, request: UserRequest) = service.update(id, request.toModel()).orThrowNotFoundException(id)

    @Status(HttpStatus.NO_CONTENT)
    @Delete("/{id}")
    fun delete(id: String) = service.delete(id).orThrowNotFoundException(id)

    private fun Optional<User>.orThrowNotFoundException(id: String) =
        this.orElseThrow { HttpStatusException(HttpStatus.NOT_FOUND, "User with ID `$id` was not found.") }
}

// New! Extension Function
// Note! Some articles suggest not to use `to` prefix for extension functions (`asUser` or `mapToUser)
private fun UserRequest.toModel(): User = User(
    name = this.name,
    email = this.email,
    address = Address(street = this.street, city = this.city, code = this.code)
)