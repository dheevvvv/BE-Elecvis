package com.dhevadayatvito.tugasakhir.restful.model

import jakarta.persistence.Column
import java.time.LocalDateTime
import java.util.Date

data class UsersResponse(
    val id: String,
    val name:String,
    val username: String,
    val email: String,
    val phoneNumber:String,
    val createdAt:Date,
    val updatedAt:Date

) {
}