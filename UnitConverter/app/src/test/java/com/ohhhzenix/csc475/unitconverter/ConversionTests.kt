package com.ohhhzenix.csc475.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class ConversionTests {

    // Celsius to other units
    @Test
    fun celsiusToFahrenheitTest() {
        assertEquals(32.0, celsiusToFahrenheit(0.0), 0.001)
        assertEquals(212.0, celsiusToFahrenheit(100.0), 0.001)
    }

    @Test
    fun celsiusToKelvinTest() {
        assertEquals(273.15, celsiusToKelvin(0.0), 0.001)
        assertEquals(373.15, celsiusToKelvin(100.0), 0.001)
    }

    // Fahrenheit to other units
    @Test
    fun fahrenheitToCelsiusTest() {
        assertEquals(0.0, fahrenheitToCelsius(32.0), 0.001)
        assertEquals(100.0, fahrenheitToCelsius(212.0), 0.001)
    }

    @Test
    fun fahrenheitToKelvinTest() {
        assertEquals(273.15, fahrenheitToKelvin(32.0), 0.001)
        assertEquals(373.15, fahrenheitToKelvin(212.0), 0.001)
    }

    // Kelvin to other units
    @Test
    fun kelvinToCelsiusTest() {
        assertEquals(0.0, kelvinToCelsius(273.15), 0.001)
        assertEquals(100.0, kelvinToCelsius(373.15), 0.001)
    }

    @Test
    fun kelvinToFahrenheitTest() {
        assertEquals(32.0, kelvinToFahrenheit(273.15), 0.001)
        assertEquals(212.0, kelvinToFahrenheit(373.15), 0.001)
    }

    // Kilometer to other units
    @Test
    fun kilometerToMeterTest() {
        assertEquals(1000.0, kilometerToMeter(1.0), 0.001)
    }

    @Test
    fun kilometerToCentimeterTest() {
        assertEquals(100000.0, kilometerToCentimeter(1.0), 0.001)
    }

    @Test
    fun kilometerToMillimeterTest() {
        assertEquals(1000000.0, kilometerToMillimeter(1.0), 0.001)
    }

    @Test
    fun kilometerToMicrometerTest() {
        assertEquals(1_000_000_000.0, kilometerToMicrometer(1.0), 0.001)
    }

    @Test
    fun kilometerToNanometerTest() {
        assertEquals(1_000_000_000_000.0, kilometerToNanometer(1.0), 0.001)
    }

    @Test
    fun kilometerToMileTest() {
        assertEquals(0.621371, kilometerToMile(1.0), 0.001)
    }

    @Test
    fun kilometerToYardTest() {
        assertEquals(1093.61, kilometerToYard(1.0), 0.001)
    }

    @Test
    fun kilometerToFootTest() {
        assertEquals(3280.84, kilometerToFoot(1.0), 0.001)
    }

    @Test
    fun kilometerToInchTest() {
        assertEquals(39370.1, kilometerToInch(1.0), 0.001)
    }

    @Test
    fun kilometerToNauticalMileTest() {
        assertEquals(0.539957, kilometerToNauticalMile(1.0), 0.001)
    }

    // Meter to other units
    @Test
    fun meterToKilometerTest() {
        assertEquals(0.001, meterToKilometer(1.0), 0.001)
    }

    @Test
    fun meterToCentimeterTest() {
        assertEquals(100.0, meterToCentimeter(1.0), 0.001)
    }

    @Test
    fun meterToMillimeterTest() {
        assertEquals(1000.0, meterToMillimeter(1.0), 0.001)
    }

    @Test
    fun meterToMicrometerTest() {
        assertEquals(1_000_000.0, meterToMicrometer(1.0), 0.001)
    }

    @Test
    fun meterToNanometerTest() {
        assertEquals(1_000_000_000.0, meterToNanometer(1.0), 0.001)
    }

    @Test
    fun meterToMileTest() {
        assertEquals(0.000621371, meterToMile(1.0), 0.001)
    }

    @Test
    fun meterToYardTest() {
        assertEquals(1.09361, meterToYard(1.0), 0.001)
    }

    @Test
    fun meterToFootTest() {
        assertEquals(3.28084, meterToFoot(1.0), 0.001)
    }

    @Test
    fun meterToInchTest() {
        assertEquals(39.3701, meterToInch(1.0), 0.001)
    }

    @Test
    fun meterToNauticalMileTest() {
        assertEquals(0.000539957, meterToNauticalMile(1.0), 0.001)
    }

    // Centimeter to other units
    @Test
    fun centimeterToKilometerTest() {
        assertEquals(0.00001, centimeterToKilometer(1.0), 0.001)
    }

    @Test
    fun centimeterToMeterTest() {
        assertEquals(0.01, centimeterToMeter(1.0), 0.001)
    }

    @Test
    fun centimeterToMillimeterTest() {
        assertEquals(10.0, centimeterToMillimeter(1.0), 0.001)
    }

    @Test
    fun centimeterToMicrometerTest() {
        assertEquals(10_000.0, centimeterToMicrometer(1.0), 0.001)
    }

    @Test
    fun centimeterToNanometerTest() {
        assertEquals(10_000_000.0, centimeterToNanometer(1.0), 0.001)
    }

    @Test
    fun centimeterToMileTest() {
        assertEquals(6.2137e-6, centimeterToMile(1.0), 0.001)
    }

    @Test
    fun centimeterToYardTest() {
        assertEquals(0.0109361, centimeterToYard(1.0), 0.001)
    }

    @Test
    fun centimeterToFootTest() {
        assertEquals(0.0328084, centimeterToFoot(1.0), 0.001)
    }

    @Test
    fun centimeterToInchTest() {
        assertEquals(0.393701, centimeterToInch(1.0), 0.001)
    }

    @Test
    fun centimeterToNauticalMileTest() {
        assertEquals(5.3996e-6, centimeterToNauticalMile(1.0), 0.001)
    }

    // Millimeter to other units
    @Test
    fun millimeterToKilometerTest() {
        assertEquals(1e-6, millimeterToKilometer(1.0), 0.001)
    }

    @Test
    fun millimeterToMeterTest() {
        assertEquals(0.001, millimeterToMeter(1.0), 0.001)
    }

    @Test
    fun millimeterToCentimeterTest() {
        assertEquals(0.1, millimeterToCentimeter(1.0), 0.001)
    }

    @Test
    fun millimeterToMicrometerTest() {
        assertEquals(1000.0, millimeterToMicrometer(1.0), 0.001)
    }

    @Test
    fun millimeterToNanometerTest() {
        assertEquals(1_000_000.0, millimeterToNanometer(1.0), 0.001)
    }

    @Test
    fun millimeterToMileTest() {
        assertEquals(6.2137e-7, millimeterToMile(1.0), 0.001)
    }

    @Test
    fun millimeterToYardTest() {
        assertEquals(0.00109361, millimeterToYard(1.0), 0.001)
    }

    @Test
    fun millimeterToFootTest() {
        assertEquals(0.00328084, millimeterToFoot(1.0), 0.001)
    }

    @Test
    fun millimeterToInchTest() {
        assertEquals(0.0393701, millimeterToInch(1.0), 0.001)
    }

    @Test
    fun millimeterToNauticalMileTest() {
        assertEquals(5.3996e-7, millimeterToNauticalMile(1.0), 0.001)
    }

    // Micrometer to other units
    @Test
    fun micrometerToKilometerTest() {
        assertEquals(1e-9, micrometerToKilometer(1.0), 0.001)
    }

    @Test
    fun micrometerToMeterTest() {
        assertEquals(1e-6, micrometerToMeter(1.0), 0.001)
    }

    @Test
    fun micrometerToCentimeterTest() {
        assertEquals(1e-4, micrometerToCentimeter(1.0), 0.001)
    }

    @Test
    fun micrometerToMillimeterTest() {
        assertEquals(0.001, micrometerToMillimeter(1.0), 0.001)
    }

    @Test
    fun micrometerToNanometerTest() {
        assertEquals(1000.0, micrometerToNanometer(1.0), 0.001)
    }

    @Test
    fun micrometerToMileTest() {
        assertEquals(6.2137e-10, micrometerToMile(1.0), 0.001)
    }

    @Test
    fun micrometerToYardTest() {
        assertEquals(1.0936e-6, micrometerToYard(1.0), 0.001)
    }

    @Test
    fun micrometerToFootTest() {
        assertEquals(3.2808e-6, micrometerToFoot(1.0), 0.001)
    }

    @Test
    fun micrometerToInchTest() {
        assertEquals(3.937e-5, micrometerToInch(1.0), 0.001)
    }

    @Test
    fun micrometerToNauticalMileTest() {
        assertEquals(5.3996e-10, micrometerToNauticalMile(1.0), 0.001)
    }

    // Nanometer to other units
    @Test
    fun nanometerToKilometerTest() {
        assertEquals(1e-12, nanometerToKilometer(1.0), 0.001)
    }

    @Test
    fun nanometerToMeterTest() {
        assertEquals(1e-9, nanometerToMeter(1.0), 0.001)
    }

    @Test
    fun nanometerToCentimeterTest() {
        assertEquals(1e-7, nanometerToCentimeter(1.0), 0.001)
    }

    @Test
    fun nanometerToMillimeterTest() {
        assertEquals(1e-6, nanometerToMillimeter(1.0), 0.001)
    }

    @Test
    fun nanometerToMicrometerTest() {
        assertEquals(0.001, nanometerToMicrometer(1.0), 0.001)
    }

    @Test
    fun nanometerToMileTest() {
        assertEquals(6.2137e-13, nanometerToMile(1.0), 0.001)
    }

    @Test
    fun nanometerToYardTest() {
        assertEquals(1.0936e-9, nanometerToYard(1.0), 0.001)
    }

    @Test
    fun nanometerToFootTest() {
        assertEquals(3.2808e-9, nanometerToFoot(1.0), 0.001)
    }

    @Test
    fun nanometerToInchTest() {
        assertEquals(3.937e-8, nanometerToInch(1.0), 0.001)
    }

    @Test
    fun nanometerToNauticalMileTest() {
        assertEquals(5.3996e-13, nanometerToNauticalMile(1.0), 0.001)
    }

    // Mile to other units
    @Test
    fun mileToKilometerTest() {
        assertEquals(1.60934, mileToKilometer(1.0), 0.001)
    }

    @Test
    fun mileToMeterTest() {
        assertEquals(1609.34, mileToMeter(1.0), 0.001)
    }

    @Test
    fun mileToCentimeterTest() {
        assertEquals(160934.0, mileToCentimeter(1.0), 0.001)
    }

    @Test
    fun mileToMillimeterTest() {
        assertEquals(1_609_344.0, mileToMillimeter(1.0), 0.001)
    }

    @Test
    fun mileToMicrometerTest() {
        assertEquals(1_609_344_000.0, mileToMicrometer(1.0), 0.001)
    }

    @Test
    fun mileToNanometerTest() {
        assertEquals(1_609_344_000_000.0, mileToNanometer(1.0), 0.001)
    }

    @Test
    fun mileToYardTest() {
        assertEquals(1760.0, mileToYard(1.0), 0.001)
    }

    @Test
    fun mileToFootTest() {
        assertEquals(5280.0, mileToFoot(1.0), 0.001)
    }

    @Test
    fun mileToInchTest() {
        assertEquals(63_360.0, mileToInch(1.0), 0.001)
    }

    @Test
    fun mileToNauticalMileTest() {
        assertEquals(0.868976, mileToNauticalMile(1.0), 0.001)
    }

    // Yard to other units
    @Test
    fun yardToKilometerTest() {
        assertEquals(0.0009144, yardToKilometer(1.0), 0.001)
    }

    @Test
    fun yardToMeterTest() {
        assertEquals(0.9144, yardToMeter(1.0), 0.001)
    }

    @Test
    fun yardToCentimeterTest() {
        assertEquals(91.44, yardToCentimeter(1.0), 0.001)
    }

    @Test
    fun yardToMillimeterTest() {
        assertEquals(914.4, yardToMillimeter(1.0), 0.001)
    }

    @Test
    fun yardToMicrometerTest() {
        assertEquals(914400.0, yardToMicrometer(1.0), 0.001)
    }

    @Test
    fun yardToNanometerTest() {
        assertEquals(914400000.0, yardToNanometer(1.0), 0.001)
    }

    @Test
    fun yardToMileTest() {
        assertEquals(0.000568182, yardToMile(1.0), 0.001)
    }

    @Test
    fun yardToFootTest() {
        assertEquals(3.0, yardToFoot(1.0), 0.001)
    }

    @Test
    fun yardToInchTest() {
        assertEquals(36.0, yardToInch(1.0), 0.001)
    }

    @Test
    fun yardToNauticalMileTest() {
        assertEquals(0.000493737, yardToNauticalMile(1.0), 0.001)
    }

    // Foot to other units
    @Test
    fun footToKilometerTest() {
        assertEquals(0.0003048, footToKilometer(1.0), 0.001)
    }

    @Test
    fun footToMeterTest() {
        assertEquals(0.3048, footToMeter(1.0), 0.001)
    }

    @Test
    fun footToCentimeterTest() {
        assertEquals(30.48, footToCentimeter(1.0), 0.001)
    }

    @Test
    fun footToMillimeterTest() {
        assertEquals(304.8, footToMillimeter(1.0), 0.001)
    }

    @Test
    fun footToMicrometerTest() {
        assertEquals(304800.0, footToMicrometer(1.0), 0.001)
    }

    @Test
    fun footToNanometerTest() {
        assertEquals(304800000.0, footToNanometer(1.0), 0.001)
    }

    @Test
    fun footToMileTest() {
        assertEquals(0.000189394, footToMile(1.0), 0.001)
    }

    @Test
    fun footToYardTest() {
        assertEquals(0.333333, footToYard(1.0), 0.001)
    }

    @Test
    fun footToInchTest() {
        assertEquals(12.0, footToInch(1.0), 0.001)
    }

    @Test
    fun footToNauticalMileTest() {
        assertEquals(0.000164579, footToNauticalMile(1.0), 0.001)
    }

    // Inch to other units
    @Test
    fun inchToKilometerTest() {
        assertEquals(2.54e-5, inchToKilometer(1.0), 0.001)
    }

    @Test
    fun inchToMeterTest() {
        assertEquals(0.0254, inchToMeter(1.0), 0.001)
    }

    @Test
    fun inchToCentimeterTest() {
        assertEquals(2.54, inchToCentimeter(1.0), 0.001)
    }

    @Test
    fun inchToMillimeterTest() {
        assertEquals(25.4, inchToMillimeter(1.0), 0.001)
    }
}