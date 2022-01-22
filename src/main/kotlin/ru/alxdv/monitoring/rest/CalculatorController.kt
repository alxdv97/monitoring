package ru.alxdv.monitoring.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.alxdv.monitoring.service.Calculator

@RestController
@RequestMapping("calculator")
class CalculatorController(
    private val calculator: Calculator
) {

    @GetMapping("addition")
    fun addition(
        @RequestParam(required = false) a: Int = 0,
        @RequestParam(required = false) b: Int = 0
    ): Int {
        return calculator.addition(a, b)
    }

    @GetMapping("subtract")
    fun subtract(
        @RequestParam(required = false) a: Int = 0,
        @RequestParam(required = false) b: Int = 0
    ): Int {
        return calculator.subtract(a, b)
    }

    @GetMapping("multiply")
    fun multiply(
        @RequestParam(required = false) a: Int = 0,
        @RequestParam(required = false) b: Int = 0
    ): Int {
        return calculator.multiply(a, b)
    }

    @GetMapping("divide")
    fun divide(
        @RequestParam(required = false) a: Int = 0,
        @RequestParam(required = false) b: Int = 0
    ): Int {
        return calculator.divide(a, b)
    }
}