package com.dhevadayatvito.tugasakhir.restful.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "api_keys")
data class ApiKeys(
    @Id
    val id:String
) {
}