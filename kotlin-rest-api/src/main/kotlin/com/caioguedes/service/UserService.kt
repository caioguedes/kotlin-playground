package com.caioguedes.service

import com.caioguedes.model.User
import com.caioguedes.repository.UserRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class UserService(
    private val repository: UserRepository
) {

    fun create(user: User): User = repository.save(user)
    fun findAll(): List<User> = repository.findAll().toList()
    fun findById(id: String): Optional<User> = repository.findById(id)
    fun update(id: String, user: User): Optional<User> =
        findById(id).map { found -> repository.update(user.copy(id = found.id)) }
}