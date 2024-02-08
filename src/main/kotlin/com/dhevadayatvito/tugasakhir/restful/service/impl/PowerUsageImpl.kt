package com.dhevadayatvito.tugasakhir.restful.service.impl

import com.dhevadayatvito.tugasakhir.restful.entity.PowerUsage
import com.dhevadayatvito.tugasakhir.restful.entity.Users
import com.dhevadayatvito.tugasakhir.restful.model.PowerUsageRequest
import com.dhevadayatvito.tugasakhir.restful.model.PowerUsageResponse
import com.dhevadayatvito.tugasakhir.restful.model.UsersResponse
import com.dhevadayatvito.tugasakhir.restful.repository.PowerUsageRepository
import com.dhevadayatvito.tugasakhir.restful.service.PowerUsageService
import org.springframework.stereotype.Service
import java.util.*

@Service
class PowerUsageImpl(val powerUsageRepository: PowerUsageRepository): PowerUsageService {

    override fun getPowerUsageByRangeDate(powerUsageRequest: PowerUsageRequest): List<PowerUsageResponse> {

        val userId:Int = powerUsageRequest.userId

        val startDate:String = powerUsageRequest.startDate
        val endDate:String = powerUsageRequest.endDate

        // Mengambil data dari repository berdasarkan user id dan rentang tanggal
        val powerUsages: List<PowerUsage> = powerUsageRepository.findAllByUserIdAndDateBetween(userId,startDate, endDate)

        // Mengonversi entitas PowerUsage menjadi DTO atau Response yang sesuai
        return powerUsages.map { powerUsageResponse(it) }
    }


    private fun powerUsageResponse(powerUsage: PowerUsage): PowerUsageResponse {
        return PowerUsageResponse(
            id = powerUsage.id,
            date = powerUsage.date,
            time = powerUsage.time,
            globalActivePower = powerUsage.globalActivePower,
            globalReactivePower = powerUsage.globalReactivePower,
            voltage = powerUsage.voltage,
            globalIntensity = powerUsage.globalIntensity,
            subMetering1 = powerUsage.subMetering1,
            subMetering2 = powerUsage.subMetering2,
            subMetering3 = powerUsage.subMetering3,
            user_id = powerUsage.userId
        )
    }
}