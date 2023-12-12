package com.dhevadayatvito.tugasakhir.restful.service.impl

import com.dhevadayatvito.tugasakhir.restful.entity.Users
import com.dhevadayatvito.tugasakhir.restful.model.CreateUsersRequest
import com.dhevadayatvito.tugasakhir.restful.model.UsersResponse
import com.dhevadayatvito.tugasakhir.restful.repository.UsersRepository
import com.dhevadayatvito.tugasakhir.restful.service.UsersService
import com.dhevadayatvito.tugasakhir.restful.validation.ValidationUtil
import org.springframework.stereotype.Service
import java.sql.Timestamp
import java.time.LocalDateTime

@Service
class UserServiceImpl(val usersRepository: UsersRepository, val validationUtil: ValidationUtil): UsersService {
    override fun createUsers(createUsersRequest: CreateUsersRequest): UsersResponse {
        validationUtil.validate(createUsersRequest)
        val currentTime = LocalDateTime.now()
        val users = Users(
            id = createUsersRequest.id,
            name = createUsersRequest.name,
            email = createUsersRequest.email,
            username = createUsersRequest.username,
            password = createUsersRequest.password,
            phoneNumber = createUsersRequest.password,
            createdAt = currentTime,
            updatedAt = null
        )
        usersRepository.save(users)

        return UsersResponse(
            id = users.id,
            name = users.name,
            email = users.email,
            username = users.username,
            createdAt = users.createdAt,
            updatedAt = users.updatedAt
        )
    }
}