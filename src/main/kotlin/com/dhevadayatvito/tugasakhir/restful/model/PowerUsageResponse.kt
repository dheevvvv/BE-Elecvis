package com.dhevadayatvito.tugasakhir.restful.model

import jakarta.persistence.Column
import java.math.BigDecimal

data class PowerUsageResponse(
    val id:Long?,

    var date:String,

    var time: String,

    var globalActivePower: BigDecimal,

    var globalReactivePower: BigDecimal,

    var voltage: BigDecimal,

    var globalIntensity: BigDecimal,

    var subMetering1: BigDecimal,

    var subMetering2: BigDecimal,

    var subMetering3: BigDecimal,

    var user_id: Int
)
