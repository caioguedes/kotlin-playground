package com.caioguedes.request

import com.caioguedes.model.Address
import com.caioguedes.model.User

data class UserRequest(
    val name: String,
    val email: String,
    val street: String,
    val city: String,
    val code: Int
)
