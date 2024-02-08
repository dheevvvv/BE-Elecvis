package com.dhevadayatvito.tugasakhir.restful.repository

import com.dhevadayatvito.tugasakhir.restful.entity.PowerUsage
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface PowerUsageRepository:JpaRepository<PowerUsage, String> {

    @Query("SELECT p FROM PowerUsage p WHERE p.userId = :userId AND p.date BETWEEN :startDate AND :endDate")
    fun findAllByUserIdAndDateBetween(@Param("userId") userId:Int, @Param("startDate") startDate: String, @Param("endDate") endDate: String): List<PowerUsage>
}