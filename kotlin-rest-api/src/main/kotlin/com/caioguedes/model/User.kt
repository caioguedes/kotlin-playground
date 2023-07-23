package com.caioguedes.model

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
data class User(

    @field:Id
    @field:GeneratedValue
    val id: String? = null,

    val name: String,
    val email: String,
    val address: Address
)