package com.dhevadayatvito.tugasakhir.restful.model

import jakarta.persistence.Column
import java.time.LocalDateTime

data class UsersResponse(
    val id: Long? = null,
    val name:String,
    val username: String,
    val email: String,
    var createdAt: LocalDateTime? = null,
    var updatedAt: LocalDateTime? = null
) {
}