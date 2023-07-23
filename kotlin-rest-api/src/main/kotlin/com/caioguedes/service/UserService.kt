package com.caioguedes.service

import com.caioguedes.model.User
import com.caioguedes.repository.UserRepository
import com.caioguedes.request.UserRequest
import jakarta.inject.Singleton

@Singleton
class UserService(
    private val repository: UserRepository
) {

    fun create(user: User): User = repository.save(user)
    fun findAll(): List<User> = repository.findAll().toList()
    fun findById(id: String) = repository.findById(id)
}