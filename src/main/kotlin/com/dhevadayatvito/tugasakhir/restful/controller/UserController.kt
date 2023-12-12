package com.dhevadayatvito.tugasakhir.restful.controller

import com.dhevadayatvito.tugasakhir.restful.model.CreateUsersRequest
import com.dhevadayatvito.tugasakhir.restful.model.GenericResponse
import com.dhevadayatvito.tugasakhir.restful.model.UsersResponse
import com.dhevadayatvito.tugasakhir.restful.service.UsersService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(val usersService: UsersService) {

    @PostMapping(
        value = ["/api/users"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createUsers(@RequestBody createUsersRequest: CreateUsersRequest): GenericResponse<UsersResponse> {
        val usersResponse = usersService.createUsers(createUsersRequest)
        return GenericResponse(
            code = 200,
            status = "OK",
            data = usersResponse
        )
    }

}