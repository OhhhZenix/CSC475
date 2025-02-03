package com.ohhhzenix.csc475.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class TemperatureConversionTests {

    // Test Celsius to Fahrenheit
    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, celsiusToFahrenheit(0.0), 0.01)
        assertEquals(212.0, celsiusToFahrenheit(100.0), 0.01)
        assertEquals(-40.0, celsiusToFahrenheit(-40.0), 0.01)
    }

    // Test Celsius to Kelvin
    @Test
    fun testCelsiusToKelvin() {
        assertEquals(273.15, celsiusToKelvin(0.0), 0.01)
        assertEquals(373.15, celsiusToKelvin(100.0), 0.01)
        assertEquals(233.15, celsiusToKelvin(-40.0), 0.01)
    }

    // Test Fahrenheit to Celsius
    @Test
    fun testFahrenheitToCelsius() {
        assertEquals(0.0, fahrenheitToCelsius(32.0), 0.01)
        assertEquals(100.0, fahrenheitToCelsius(212.0), 0.01)
        assertEquals(-40.0, fahrenheitToCelsius(-40.0), 0.01)
    }

    // Test Fahrenheit to Kelvin
    @Test
    fun testFahrenheitToKelvin() {
        assertEquals(273.15, fahrenheitToKelvin(32.0), 0.01)
        assertEquals(373.15, fahrenheitToKelvin(212.0), 0.01)
        assertEquals(233.15, fahrenheitToKelvin(-40.0), 0.01)
    }

    // Test Kelvin to Celsius
    @Test
    fun testKelvinToCelsius() {
        assertEquals(0.0, kelvinToCelsius(273.15), 0.01)
        assertEquals(100.0, kelvinToCelsius(373.15), 0.01)
        assertEquals(-40.0, kelvinToCelsius(233.15), 0.01)
    }

    // Test Kelvin to Fahrenheit
    @Test
    fun testKelvinToFahrenheit() {
        assertEquals(32.0, kelvinToFahrenheit(273.15), 0.01)
        assertEquals(212.0, kelvinToFahrenheit(373.15), 0.01)
        assertEquals(-40.0, kelvinToFahrenheit(233.15), 0.01)
    }
}