package com.ohhhzenix.csc475.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class ConversionTests {

    private val delta = 1e-6 // Tolerance for floating-point comparison

    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, celsiusToFahrenheit(0.0), delta)
        assertEquals(212.0, celsiusToFahrenheit(100.0), delta)
    }

    @Test
    fun testCelsiusToKelvin() {
        assertEquals(273.15, celsiusToKelvin(0.0), delta)
        assertEquals(373.15, celsiusToKelvin(100.0), delta)
    }

    @Test
    fun testFahrenheitToCelsius() {
        assertEquals(0.0, fahrenheitToCelsius(32.0), delta)
        assertEquals(100.0, fahrenheitToCelsius(212.0), delta)
    }

    @Test
    fun testFahrenheitToKelvin() {
        assertEquals(273.15, fahrenheitToKelvin(32.0), delta)
        assertEquals(373.15, fahrenheitToKelvin(212.0), delta)
    }

    @Test
    fun testKelvinToCelsius() {
        assertEquals(0.0, kelvinToCelsius(273.15), delta)
        assertEquals(100.0, kelvinToCelsius(373.15), delta)
    }

    @Test
    fun testKelvinToFahrenheit() {
        assertEquals(32.0, kelvinToFahrenheit(273.15), delta)
        assertEquals(212.0, kelvinToFahrenheit(373.15), delta)
    }

    @Test
    fun testKilometerToMeter() {
        assertEquals(1000.0, kilometerToMeter(1.0), delta)
    }

    @Test
    fun testKilometerToCentimeter() {
        assertEquals(100000.0, kilometerToCentimeter(1.0), delta)
    }

    @Test
    fun testKilometerToMillimeter() {
        assertEquals(1000000.0, kilometerToMillimeter(1.0), delta)
    }

    @Test
    fun testKilometerToMicrometer() {
        assertEquals(1_000_000_000.0, kilometerToMicrometer(1.0), delta)
    }

    @Test
    fun testKilometerToNanometer() {
        assertEquals(1_000_000_000_000.0, kilometerToNanometer(1.0), delta)
    }

    @Test
    fun testKilometerToMile() {
        assertEquals(1.0 / 1.60934, kilometerToMile(1.0), delta)
    }

    @Test
    fun testKilometerToYard() {
        assertEquals(1093.61, kilometerToYard(1.0), delta)
    }

    @Test
    fun testKilometerToFoot() {
        assertEquals(3280.84, kilometerToFoot(1.0), delta)
    }

    @Test
    fun testKilometerToInch() {
        assertEquals(39370.1, kilometerToInch(1.0), delta)
    }

    @Test
    fun testKilometerToNauticalMile() {
        assertEquals(1.0 / 1.852, kilometerToNauticalMile(1.0), delta)
    }
}