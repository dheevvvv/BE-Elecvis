package com.dhevadayatvito.tugasakhir.restful.service.impl

import com.dhevadayatvito.tugasakhir.restful.entity.Users
import com.dhevadayatvito.tugasakhir.restful.model.*
import com.dhevadayatvito.tugasakhir.restful.repository.UsersRepository
import com.dhevadayatvito.tugasakhir.restful.service.UsersService
import com.dhevadayatvito.tugasakhir.restful.validation.ValidationUtil
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*
import java.util.stream.Collectors

@Service
class UserServiceImpl(val usersRepository: UsersRepository, val validationUtil: ValidationUtil): UsersService {
    override fun createUsers(createUsersRequest: CreateUsersRequest): UsersResponse {
        validationUtil.validate(createUsersRequest)

        val users = Users(
            name = createUsersRequest.name,
            email = createUsersRequest.email,
            username = createUsersRequest.username,
            password = createUsersRequest.password,
            phoneNumber = createUsersRequest.phoneNumber,
            createdAt = Date(),
            updatedAt = null

        )
        usersRepository.save(users)

        return usersResponse(users)
    }

    override fun getUsers(id: Long): UsersResponse {
        val users = usersRepository.findByIdOrNull(id.toString())
        if (users==null){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
        } else{
            return usersResponse(users)
        }
    }

    override fun updateUsers(id: Long, updateUsersRequest: UpdateUsersRequest): UsersResponse {
        val users = usersRepository.findByIdOrNull(id.toString())
        if (users==null){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
        } else{
            users.apply {
                name = updateUsersRequest.name
                username = updateUsersRequest.username
                email = updateUsersRequest.email
                password = updateUsersRequest.password
                phoneNumber = updateUsersRequest.phoneNumber
                updatedAt = Date()
            }
            usersRepository.save(users)
            return usersResponse(users)
        }
    }

    override fun getListUsers(listUsersRequest: ListUsersRequest): List<UsersResponse> {
        val page = usersRepository.findAll(PageRequest.of(listUsersRequest.page, listUsersRequest.size))
        val users: List<Users> = page.get().collect(Collectors.toList())
        return users.map { usersResponse(it) }
    }

    override fun userLogin(userLoginRequest: UserLoginRequest): ResponseEntity<String> {
        // Validasi input
        if (userLoginRequest.email.isBlank() || userLoginRequest.password.isBlank()) {
            return ResponseEntity("Email dan password harus diisi", HttpStatus.BAD_REQUEST)
        }

        // Panggil metode untuk melakukan proses login
        return processLogin(userLoginRequest)

    }

    override fun getUserByEmail(email: String): Users? {
        return usersRepository.findByEmail(email)
    }

    private fun processLogin(userLoginRequest: UserLoginRequest): ResponseEntity<String> {
        // Memeriksa kecocokan email dan password
        val user = usersRepository.findByEmail(userLoginRequest.email)
        if (user != null && user.password == userLoginRequest.password) {
            // Email dan password cocok, login berhasil
            return ResponseEntity("Login berhasil", HttpStatus.OK)
        } else {
            // Email atau password salah, login gagal
            return ResponseEntity("Email atau password salah", HttpStatus.UNAUTHORIZED)
        }
    }

    private fun usersResponse(users: Users):UsersResponse{
        return UsersResponse(
            user_id = users.userId,
            name = users.name,
            email = users.email,
            username = users.username,
            phoneNumber = users.phoneNumber,
            createdAt = Date(),
            updatedAt = Date(),
            role = users.role

        )
    }
}