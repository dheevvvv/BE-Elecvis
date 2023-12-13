package com.dhevadayatvito.tugasakhir.restful.service

import com.dhevadayatvito.tugasakhir.restful.model.CreateUsersRequest
import com.dhevadayatvito.tugasakhir.restful.model.UpdateUsersRequest
import com.dhevadayatvito.tugasakhir.restful.model.UsersResponse

interface UsersService {

    fun createUsers(createUsersRequest: CreateUsersRequest): UsersResponse

    fun getUsers(id:Long): UsersResponse

    fun updateUsers(id: Long, updateUsersRequest: UpdateUsersRequest): UsersResponse
}