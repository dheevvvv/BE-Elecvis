package com.dhevadayatvito.tugasakhir.restful.config

import com.dhevadayatvito.tugasakhir.restful.entity.ApiKeys
import com.dhevadayatvito.tugasakhir.restful.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apiKeyRepository: ApiKeyRepository):ApplicationRunner {

    val apiKey = "DHEVA"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apiKey)){
            val entity = ApiKeys(id = apiKey)
            apiKeyRepository.save(entity)
        }
    }
}