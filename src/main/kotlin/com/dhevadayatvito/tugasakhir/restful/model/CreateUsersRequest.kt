package com.dhevadayatvito.tugasakhir.restful.model

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull


data class CreateUsersRequest(

    @field:NotBlank
    val id:String,

    @field:NotBlank
    val name:String,

    @field:NotBlank
    val username: String,

    @field:NotBlank
    val email: String,

    @field:NotBlank
    val password: String,

    @field:NotBlank
    val phoneNumber: String,

    ) {
}