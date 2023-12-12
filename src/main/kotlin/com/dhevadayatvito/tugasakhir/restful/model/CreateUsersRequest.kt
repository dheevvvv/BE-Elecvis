package com.dhevadayatvito.tugasakhir.restful.model



data class CreateUsersRequest(
    val id: Long? = null,
    val name:String,
    val username: String,
    val email: String,
    val password: String,
    val phoneNumber: String,

    ) {
}