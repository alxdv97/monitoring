package ru.alxdv.monitoring.service

import org.springframework.stereotype.Service

@Service
class Calculator {

    fun addition(a: Int, b: Int) = a + b

    fun subtract(a: Int, b: Int) = a - b

    fun multiply(a: Int, b: Int) = a * b

    fun divide(a: Int, b: Int) = a / b
}