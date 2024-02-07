package com.dhevadayatvito.tugasakhir.restful.entity

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.*

@Entity
@Table(name = "power_usage")
data class PowerUsage(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "date")
    var date:String,

    @Column(name = "time")
    var time: String,

    @Column(name = "global_active_power")
    var globalActivePower: BigDecimal,

    @Column(name = "global_reactive_power")
    var globalReactivePower: BigDecimal,

    @Column(name = "voltage")
    var voltage: BigDecimal,

    @Column(name = "global_intensity")
    var globalIntensity: BigDecimal,

    @Column(name = "sub_metering_1")
    var subMetering1: BigDecimal,

    @Column(name = "sub_metering_2")
    var subMetering2: BigDecimal,

    @Column(name = "sub_metering_3")
    var subMetering3: BigDecimal,

    @Column(name = "user_id")
    var user_id: Int
)
