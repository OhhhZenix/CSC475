package com.ohhhzenix.csc475.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class LengthConversionTests {

    // Test Kilometer to Meter
    @Test
    fun testKilometerToMeter() {
        assertEquals(1000.0, kilometerToMeter(1.0), 0.01)
        assertEquals(5000.0, kilometerToMeter(5.0), 0.01)
        assertEquals(10000.0, kilometerToMeter(10.0), 0.01)
    }

    // Test Kilometer to Centimeter
    @Test
    fun testKilometerToCentimeter() {
        assertEquals(100000.0, kilometerToCentimeter(1.0), 0.01)
        assertEquals(500000.0, kilometerToCentimeter(5.0), 0.01)
        assertEquals(1000000.0, kilometerToCentimeter(10.0), 0.01)
    }

    // Test Kilometer to Millimeter
    @Test
    fun testKilometerToMillimeter() {
        assertEquals(1000000.0, kilometerToMillimeter(1.0), 0.01)
        assertEquals(5000000.0, kilometerToMillimeter(5.0), 0.01)
        assertEquals(10000000.0, kilometerToMillimeter(10.0), 0.01)
    }

    // Test Kilometer to Micrometer
    @Test
    fun testKilometerToMicrometer() {
        assertEquals(1_000_000_000.0, kilometerToMicrometer(1.0), 0.01)
        assertEquals(5_000_000_000.0, kilometerToMicrometer(5.0), 0.01)
        assertEquals(10_000_000_000.0, kilometerToMicrometer(10.0), 0.01)
    }

    // Test Kilometer to Nanometer
    @Test
    fun testKilometerToNanometer() {
        assertEquals(1_000_000_000_000.0, kilometerToNanometer(1.0), 0.01)
        assertEquals(5_000_000_000_000.0, kilometerToNanometer(5.0), 0.01)
        assertEquals(10_000_000_000_000.0, kilometerToNanometer(10.0), 0.01)
    }

    // Test Kilometer to Mile
    @Test
    fun testKilometerToMile() {
        assertEquals(0.621371, kilometerToMile(1.0), 0.01)
        assertEquals(3.106855, kilometerToMile(5.0), 0.01)
        assertEquals(6.21371, kilometerToMile(10.0), 0.01)
    }

    // Test Kilometer to Yard
    @Test
    fun testKilometerToYard() {
        assertEquals(1093.61, kilometerToYard(1.0), 0.01)
        assertEquals(5468.05, kilometerToYard(5.0), 0.01)
        assertEquals(10936.1, kilometerToYard(10.0), 0.01)
    }

    // Test Kilometer to Foot
    @Test
    fun testKilometerToFoot() {
        assertEquals(3280.84, kilometerToFoot(1.0), 0.01)
        assertEquals(16404.2, kilometerToFoot(5.0), 0.01)
        assertEquals(32808.4, kilometerToFoot(10.0), 0.01)
    }

    // Test Kilometer to Inch
    @Test
    fun testKilometerToInch() {
        assertEquals(39370.1, kilometerToInch(1.0), 0.01)
        assertEquals(196850.5, kilometerToInch(5.0), 0.01)
        assertEquals(393701.0, kilometerToInch(10.0), 0.01)
    }

    // Test Kilometer to Nautical Mile
    @Test
    fun testKilometerToNauticalMile() {
        assertEquals(0.539957, kilometerToNauticalMile(1.0), 0.01)
        assertEquals(2.699785, kilometerToNauticalMile(5.0), 0.01)
        assertEquals(5.39957, kilometerToNauticalMile(10.0), 0.01)
    }

    // Test Meter to Kilometer
    @Test
    fun testMeterToKilometer() {
        assertEquals(1.0, meterToKilometer(1000.0), 0.01)
        assertEquals(5.0, meterToKilometer(5000.0), 0.01)
        assertEquals(10.0, meterToKilometer(10000.0), 0.01)
    }

    // Test Meter to Centimeter
    @Test
    fun testMeterToCentimeter() {
        assertEquals(100.0, meterToCentimeter(1.0), 0.01)
        assertEquals(500.0, meterToCentimeter(5.0), 0.01)
        assertEquals(1000.0, meterToCentimeter(10.0), 0.01)
    }

    // Test Meter to Millimeter
    @Test
    fun testMeterToMillimeter() {
        assertEquals(1000.0, meterToMillimeter(1.0), 0.01)
        assertEquals(5000.0, meterToMillimeter(5.0), 0.01)
        assertEquals(10000.0, meterToMillimeter(10.0), 0.01)
    }

    // Test Meter to Micrometer
    @Test
    fun testMeterToMicrometer() {
        assertEquals(1_000_000.0, meterToMicrometer(1.0), 0.01)
        assertEquals(5_000_000.0, meterToMicrometer(5.0), 0.01)
        assertEquals(10_000_000.0, meterToMicrometer(10.0), 0.01)
    }

    // Test Meter to Nanometer
    @Test
    fun testMeterToNanometer() {
        assertEquals(1_000_000_000.0, meterToNanometer(1.0), 0.01)
        assertEquals(5_000_000_000.0, meterToNanometer(5.0), 0.01)
        assertEquals(10_000_000_000.0, meterToNanometer(10.0), 0.01)
    }

    // Test Meter to Mile
    @Test
    fun testMeterToMile() {
        assertEquals(0.000621371, meterToMile(1.0), 0.01)
        assertEquals(0.003106855, meterToMile(5.0), 0.01)
        assertEquals(0.00621371, meterToMile(10.0), 0.01)
    }

    // Test Meter to Yard
    @Test
    fun testMeterToYard() {
        assertEquals(1.09361, meterToYard(1.0), 0.01)
        assertEquals(5.46805, meterToYard(5.0), 0.01)
        assertEquals(10.9361, meterToYard(10.0), 0.01)
    }

    // Test Meter to Foot
    @Test
    fun testMeterToFoot() {
        assertEquals(3.28084, meterToFoot(1.0), 0.01)
        assertEquals(16.4042, meterToFoot(5.0), 0.01)
        assertEquals(32.8084, meterToFoot(10.0), 0.01)
    }

    // Test Meter to Inch
    @Test
    fun testMeterToInch() {
        assertEquals(39.3701, meterToInch(1.0), 0.01)
        assertEquals(196.8505, meterToInch(5.0), 0.01)
        assertEquals(393.701, meterToInch(10.0), 0.01)
    }

    // Test Meter to Nautical Mile
    @Test
    fun testMeterToNauticalMile() {
        assertEquals(0.000539957, meterToNauticalMile(1.0), 0.01)
        assertEquals(0.002699785, meterToNauticalMile(5.0), 0.01)
        assertEquals(0.00539957, meterToNauticalMile(10.0), 0.01)
    }

    // Test Centimeter to Kilometer
    @Test
    fun testCentimeterToKilometer() {
        assertEquals(0.01, centimeterToKilometer(1000.0), 0.0001)
        assertEquals(0.05, centimeterToKilometer(5000.0), 0.0001)
        assertEquals(0.1, centimeterToKilometer(10000.0), 0.0001)
    }

    // Test Centimeter to Meter
    @Test
    fun testCentimeterToMeter() {
        assertEquals(10.0, centimeterToMeter(1000.0), 0.01)
        assertEquals(50.0, centimeterToMeter(5000.0), 0.01)
        assertEquals(100.0, centimeterToMeter(10000.0), 0.01)
    }

    // Test Centimeter to Millimeter
    @Test
    fun testCentimeterToMillimeter() {
        assertEquals(100.0, centimeterToMillimeter(10.0), 0.01)
        assertEquals(500.0, centimeterToMillimeter(50.0), 0.01)
        assertEquals(1000.0, centimeterToMillimeter(100.0), 0.01)
    }

    // Test Centimeter to Micrometer
    @Test
    fun testCentimeterToMicrometer() {
        assertEquals(10_000.0, centimeterToMicrometer(1.0), 0.01)
        assertEquals(50_000.0, centimeterToMicrometer(5.0), 0.01)
        assertEquals(100_000.0, centimeterToMicrometer(10.0), 0.01)
    }

    // Test Centimeter to Nanometer
    @Test
    fun testCentimeterToNanometer() {
        assertEquals(10_000_000.0, centimeterToNanometer(1.0), 0.01)
        assertEquals(50_000_000.0, centimeterToNanometer(5.0), 0.01)
        assertEquals(100_000_000.0, centimeterToNanometer(10.0), 0.01)
    }

    // Test Centimeter to Mile
    @Test
    fun testCentimeterToMile() {
        assertEquals(0.000621371, centimeterToMile(100.0), 0.000001)
        assertEquals(0.003106855, centimeterToMile(500.0), 0.000001)
        assertEquals(0.00621371, centimeterToMile(1000.0), 0.000001)
    }

    // Test Centimeter to Yard
    @Test
    fun testCentimeterToYard() {
        assertEquals(0.109361, centimeterToYard(10.0), 0.000001)
        assertEquals(0.546806, centimeterToYard(50.0), 0.000001)
        assertEquals(1.093613, centimeterToYard(100.0), 0.000001)
    }

    // Test Centimeter to Foot
    @Test
    fun testCentimeterToFoot() {
        assertEquals(0.328084, centimeterToFoot(10.0), 0.000001)
        assertEquals(1.64042, centimeterToFoot(50.0), 0.000001)
        assertEquals(3.28084, centimeterToFoot(100.0), 0.000001)
    }

    // Test Centimeter to Inch
    @Test
    fun testCentimeterToInch() {
        assertEquals(3.93701, centimeterToInch(10.0), 0.00001)
        assertEquals(19.68503, centimeterToInch(50.0), 0.00001)
        assertEquals(39.37007, centimeterToInch(100.0), 0.00001)
    }

    // Test Centimeter to Nautical Mile
    @Test
    fun testCentimeterToNauticalMile() {
        assertEquals(0.000539957, centimeterToNauticalMile(100.0), 0.00000001)
        assertEquals(0.002699785, centimeterToNauticalMile(500.0), 0.00000001)
        assertEquals(0.00539957, centimeterToNauticalMile(1000.0), 0.00000001)
    }
}