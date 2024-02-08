package com.dhevadayatvito.tugasakhir.restful.repository

import com.dhevadayatvito.tugasakhir.restful.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UsersRepository: JpaRepository<Users, String> {

    fun findByEmail(email: String): Users
}
