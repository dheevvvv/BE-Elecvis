package com.dhevadayatvito.tugasakhir.restful.service


import com.dhevadayatvito.tugasakhir.restful.model.PowerUsageRequest
import com.dhevadayatvito.tugasakhir.restful.model.PowerUsageResponse

interface PowerUsageService {
    fun getPowerUsageByRangeDate(powerUsageRequest: PowerUsageRequest): List<PowerUsageResponse>
}