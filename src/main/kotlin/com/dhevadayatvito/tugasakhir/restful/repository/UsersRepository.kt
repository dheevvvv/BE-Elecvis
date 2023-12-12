package com.dhevadayatvito.tugasakhir.restful.repository

import com.dhevadayatvito.tugasakhir.restful.entity.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository: JpaRepository<Users, String> {
}