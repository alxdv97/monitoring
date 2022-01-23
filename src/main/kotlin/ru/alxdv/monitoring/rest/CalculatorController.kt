package ru.alxdv.monitoring.rest

import org.slf4j.Logger
import org.slf4j.LoggerFactory
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

    companion object {
        val log: Logger = LoggerFactory.getLogger(CalculatorController::class.simpleName)
    }

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
        log.debug("division request for a = $a and b = $b")
        log.info("division request for a = $a and b = $b")
        log.warn("division request for a = $a and b = $b")
        log.error("division request for a = $a and b = $b")
        return calculator.divide(a, b)
    }
}