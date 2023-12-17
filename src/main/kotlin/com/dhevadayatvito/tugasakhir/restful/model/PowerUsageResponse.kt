package com.dhevadayatvito.tugasakhir.restful.model

import jakarta.persistence.Column

data class PowerUsageResponse(

    var Date:String,

    val time: String,

    val globalActivePower: Double,

    val globalReactivePower: Double,

    val voltage: Double,

    val globalIntensity: Double,

    val subMetering1: Double,

    val subMetering2: Double,

    val subMetering3: Double
)
