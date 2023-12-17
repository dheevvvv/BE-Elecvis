package com.dhevadayatvito.tugasakhir.restful.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "power_usage")
data class PowerUsage(
    @Column(name = "Date")
    var Date:String,

    @Column(name = "Time")
    val time: String,

    @Column(name = "Global_active_power")
    val globalActivePower: Double,

    @Column(name = "Global_reactive_power")
    val globalReactivePower: Double,

    @Column(name = "Voltage")
    val voltage: Double,

    @Column(name = "Global_intensity")
    val globalIntensity: Double,

    @Column(name = "Sub_metering_1")
    val subMetering1: Double,

    @Column(name = "Sub_metering_2")
    val subMetering2: Double,

    @Column(name = "Sub_metering_3")
    val subMetering3: Double
)
