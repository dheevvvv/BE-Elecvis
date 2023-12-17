package com.dhevadayatvito.tugasakhir.restful.controller

import com.dhevadayatvito.tugasakhir.restful.model.GenericResponse
import com.dhevadayatvito.tugasakhir.restful.model.PowerUsageRequest
import com.dhevadayatvito.tugasakhir.restful.model.PowerUsageResponse
import com.dhevadayatvito.tugasakhir.restful.service.PowerUsageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class PowerUsageController(val powerUsageService: PowerUsageService) {


    @GetMapping(
        value = ["/api/power-usage-by-range-date"],
        produces = ["application/json"]
    )
    fun getPowerUsageByDateRange(
        @RequestParam(value = "startDate", defaultValue = "startDate") startDate: String,
        @RequestParam(value = "endDate", defaultValue = "startDate") endDate: String
    ): GenericResponse<List<PowerUsageResponse>> {
        val request = PowerUsageRequest(startDate, startDate, endDate)
        val data = powerUsageService.getPowerUsageByRangeDate(request)
        return GenericResponse(
            code = 200,
            status = "OK",
            data = data
        )
    }

}