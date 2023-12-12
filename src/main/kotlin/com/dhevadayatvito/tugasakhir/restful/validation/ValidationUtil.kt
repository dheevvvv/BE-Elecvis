package com.dhevadayatvito.tugasakhir.restful.validation

import jakarta.validation.ConstraintViolationException
import org.springframework.stereotype.Component
import javax.xml.transform.Source
import javax.xml.validation.Validator

@Component
class ValidationUtil(val validator: jakarta.validation.Validator) {

    fun validate(any: Any){
        val result = validator.validate(any)
        if (result.size!=0){
            throw ConstraintViolationException(result)
        }
    }

}