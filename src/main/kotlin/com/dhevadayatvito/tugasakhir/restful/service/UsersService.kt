package com.dhevadayatvito.tugasakhir.restful.service

import com.dhevadayatvito.tugasakhir.restful.entity.Users
import com.dhevadayatvito.tugasakhir.restful.model.*
import org.springframework.http.ResponseEntity

interface UsersService {

    fun createUsers(createUsersRequest: CreateUsersRequest): UsersResponse

    fun getUsers(user_id:Long): UsersResponse

    fun updateUsers(user_id: Long, updateUsersRequest: UpdateUsersRequest): UsersResponse

    fun getListUsers(listUsersRequest: ListUsersRequest):List<UsersResponse>

    fun userLogin(userLoginRequest: UserLoginRequest): ResponseEntity<String>

    fun getUserByEmail(email: String): Users?
}