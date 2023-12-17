package com.dhevadayatvito.tugasakhir.restful.service

import com.dhevadayatvito.tugasakhir.restful.entity.PowerUsage

interface PowerUsageService {
    fun getAllPowerUsage(): List<PowerUsage>

}