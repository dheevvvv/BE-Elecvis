package com.dhevadayatvito.tugasakhir.restful.repository

import com.dhevadayatvito.tugasakhir.restful.entity.PowerUsage
import org.springframework.data.jpa.repository.JpaRepository

interface PowerUsageRepository:JpaRepository<PowerUsage, String> {
}