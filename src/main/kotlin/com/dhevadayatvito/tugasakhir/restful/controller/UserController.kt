package com.dhevadayatvito.tugasakhir.restful.controller

import com.dhevadayatvito.tugasakhir.restful.model.*
import com.dhevadayatvito.tugasakhir.restful.service.UsersService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
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

    @GetMapping(
        value = ["/api/users/{id}"],
        produces = ["application/json"]
    )
    fun getUsers(@PathVariable("id") id:Long):GenericResponse<UsersResponse>{
        val userResponse = usersService.getUsers(id)
        return GenericResponse(
            code = 200,
            status = "OK",
            data = userResponse
        )
    }


    @PutMapping(
        value = ["/api/users/{id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateUsers(@PathVariable("id") id: Long, @RequestBody updateUsersRequest: UpdateUsersRequest):GenericResponse<UsersResponse>{
        val usersResponse = usersService.updateUsers(id, updateUsersRequest)
        return GenericResponse(
            code = 200,
            status = "OK",
            data = usersResponse
        )
    }


    @GetMapping(
        value = ["/api/users"],
        produces = ["application/json"]
    )
    fun listUser(@RequestParam(value = "size", defaultValue = "5") size:Int, @RequestParam(value = "page", defaultValue = "0") page:Int):GenericResponse<List<UsersResponse>>{
        val request = ListUsersRequest(page = page, size = size)
        val response = usersService.getListUsers(request)
        return GenericResponse(
            code = 200,
            status = "OK",
            data = response
        )
    }

}