package com.caioguedes.model

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Address(
    val street: String,
    val city: String,
    val code: Int
)
