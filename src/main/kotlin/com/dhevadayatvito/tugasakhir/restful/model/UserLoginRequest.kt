package com.dhevadayatvito.tugasakhir.restful.model

import jakarta.validation.constraints.NotBlank

data class UserLoginRequest(
    @field:NotBlank
    var email: String,

    @field:NotBlank
    var password: String,
)
