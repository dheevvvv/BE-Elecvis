package com.dhevadayatvito.tugasakhir.restful.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Columns
import java.time.LocalDateTime
import java.util.Date


@Entity
@Table(name = "users")
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long? = null,

    @Column(name = "name")
    var name:String,

    @Column(name = "username", unique = true)
    var username: String,

    @Column(name = "email", unique = true)
    var email: String,

    @Column(name = "password")
    var password: String,

    @Column(name = "phone_number", unique = true)
    var phoneNumber: String,

    @Column(name = "created_at")
    var createdAt:Date,

    @Column(name = "updated_at")
    var updatedAt:Date?,

    @Column(name = "role")
    var role:String? = "user"

)
