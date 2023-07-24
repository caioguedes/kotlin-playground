package com.caioguedes.repository

import com.caioguedes.model.User
import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository

@MongoRepository
interface UserRepository: CrudRepository<User, String> {
    fun findByName(name: String): List<User>
}