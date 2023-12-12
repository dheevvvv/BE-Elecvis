package com.dhevadayatvito.tugasakhir.restful.model

data class GenericResponse<T>(
    val code:Int,
    val status:String,
    val data:T
) {
}