package com.dhevadayatvito.tugasakhir.restful.repository

import com.dhevadayatvito.tugasakhir.restful.entity.ApiKeys
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository:JpaRepository<ApiKeys, String> {
}