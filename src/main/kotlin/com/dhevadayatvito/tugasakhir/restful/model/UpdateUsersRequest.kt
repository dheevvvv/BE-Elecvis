package com.dhevadayatvito.tugasakhir.restful.model

import jakarta.validation.constraints.NotBlank

data class UpdateUsersRequest(
    @field:NotBlank
    var name:String,

    @field:NotBlank
    var username: String,

    @field:NotBlank
    var email: String,

    @field:NotBlank
    var password: String,

    @field:NotBlank
    var phoneNumber: String
) {
}