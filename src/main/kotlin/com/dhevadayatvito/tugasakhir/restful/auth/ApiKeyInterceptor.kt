package com.dhevadayatvito.tugasakhir.restful.auth

import com.dhevadayatvito.tugasakhir.restful.error.UnauthorizedException
import com.dhevadayatvito.tugasakhir.restful.repository.ApiKeyRepository
import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor
import java.lang.Exception

@Component
class ApiKeyInterceptor(val apiKeyRepository: ApiKeyRepository): WebRequestInterceptor {
    override fun preHandle(request: WebRequest) {
        val apiKey = request.getHeader("x-api-key")
        if (apiKey == null){
            throw UnauthorizedException()
        }

        if (!apiKeyRepository.existsById(apiKey)){
            throw UnauthorizedException()
        }

        // Valid
    }

    override fun postHandle(request: WebRequest, model: ModelMap?) {
        //
    }

    override fun afterCompletion(request: WebRequest, ex: Exception?) {
        //
    }
}