package com.dhevadayatvito.tugasakhir.restful.service.impl

import com.dhevadayatvito.tugasakhir.restful.entity.PowerUsage
import com.dhevadayatvito.tugasakhir.restful.repository.PowerUsageRepository
import com.dhevadayatvito.tugasakhir.restful.service.PowerUsageService

class PowerUsageImpl(val powerUsageRepository: PowerUsageRepository): PowerUsageService {
    override fun getAllPowerUsage(): List<PowerUsage> {
        return powerUsageRepository.findAll().toList()
    }
}