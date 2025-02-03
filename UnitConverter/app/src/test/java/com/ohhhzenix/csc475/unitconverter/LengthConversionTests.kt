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

    // Test Millimeter to Kilometer
    @Test
    fun testMillimeterToKilometer() {
        assertEquals(0.000001, millimeterToKilometer(1.0), 0.000000001)
        assertEquals(0.005, millimeterToKilometer(5000.0), 0.000000001)
        assertEquals(0.01, millimeterToKilometer(10000.0), 0.000000001)
    }

    // Test Millimeter to Meter
    @Test
    fun testMillimeterToMeter() {
        assertEquals(0.001, millimeterToMeter(1.0), 0.0000001)
        assertEquals(5.0, millimeterToMeter(5000.0), 0.0000001)
        assertEquals(10.0, millimeterToMeter(10000.0), 0.0000001)
    }

    // Test Millimeter to Centimeter
    @Test
    fun testMillimeterToCentimeter() {
        assertEquals(0.1, millimeterToCentimeter(1.0), 0.0001)
        assertEquals(5.0, millimeterToCentimeter(50.0), 0.0001)
        assertEquals(10.0, millimeterToCentimeter(100.0), 0.0001)
    }

    // Test Millimeter to Micrometer
    @Test
    fun testMillimeterToMicrometer() {
        assertEquals(1000.0, millimeterToMicrometer(1.0), 0.01)
        assertEquals(5000.0, millimeterToMicrometer(5.0), 0.01)
        assertEquals(10000.0, millimeterToMicrometer(10.0), 0.01)
    }

    // Test Millimeter to Nanometer
    @Test
    fun testMillimeterToNanometer() {
        assertEquals(1_000_000.0, millimeterToNanometer(1.0), 0.01)
        assertEquals(5_000_000.0, millimeterToNanometer(5.0), 0.01)
        assertEquals(10_000_000.0, millimeterToNanometer(10.0), 0.01)
    }

    // Test Millimeter to Mile
    @Test
    fun testMillimeterToMile() {
        assertEquals(6.2137e-7, millimeterToMile(1.0), 1e-9)
        assertEquals(3.10685e-6, millimeterToMile(5.0), 1e-9)
        assertEquals(6.2137e-6, millimeterToMile(10.0), 1e-9)
    }

    // Test Millimeter to Yard
    @Test
    fun testMillimeterToYard() {
        assertEquals(0.00109361, millimeterToYard(1.0), 0.0000001)
        assertEquals(0.00546805, millimeterToYard(5.0), 0.0000001)
        assertEquals(0.0109361, millimeterToYard(10.0), 0.0000001)
    }

    // Test Millimeter to Foot
    @Test
    fun testMillimeterToFoot() {
        assertEquals(0.00328084, millimeterToFoot(1.0), 0.0000001)
        assertEquals(0.0164042, millimeterToFoot(5.0), 0.0000001)
        assertEquals(0.0328084, millimeterToFoot(10.0), 0.0000001)
    }

    // Test Millimeter to Inch
    @Test
    fun testMillimeterToInch() {
        assertEquals(0.0393701, millimeterToInch(1.0), 0.0000001)
        assertEquals(0.1968503, millimeterToInch(5.0), 0.0000001)
        assertEquals(0.3937007, millimeterToInch(10.0), 0.0000001)
    }

    // Test Millimeter to Nautical Mile
    @Test
    fun testMillimeterToNauticalMile() {
        assertEquals(5.398e-7, millimeterToNauticalMile(1.0), 1e-9)
        assertEquals(2.699e-6, millimeterToNauticalMile(5.0), 1e-9)
        assertEquals(5.399e-6, millimeterToNauticalMile(10.0), 1e-9)
    }

    // Test Micrometer to Kilometer
    @Test
    fun testMicrometerToKilometer() {
        assertEquals(1e-9, micrometerToKilometer(1.0), 1e-12)
        assertEquals(5e-9, micrometerToKilometer(5.0), 1e-12)
        assertEquals(1e-8, micrometerToKilometer(10.0), 1e-12)
    }

    // Test Micrometer to Meter
    @Test
    fun testMicrometerToMeter() {
        assertEquals(1e-6, micrometerToMeter(1.0), 1e-9)
        assertEquals(5e-6, micrometerToMeter(5.0), 1e-9)
        assertEquals(1e-5, micrometerToMeter(10.0), 1e-9)
    }

    // Test Micrometer to Centimeter
    @Test
    fun testMicrometerToCentimeter() {
        assertEquals(1e-4, micrometerToCentimeter(1.0), 1e-7)
        assertEquals(5e-4, micrometerToCentimeter(5.0), 1e-7)
        assertEquals(1e-3, micrometerToCentimeter(10.0), 1e-7)
    }

    // Test Micrometer to Millimeter
    @Test
    fun testMicrometerToMillimeter() {
        assertEquals(0.001, micrometerToMillimeter(1.0), 1e-6)
        assertEquals(0.005, micrometerToMillimeter(5.0), 1e-6)
        assertEquals(0.01, micrometerToMillimeter(10.0), 1e-6)
    }

    // Test Micrometer to Nanometer
    @Test
    fun testMicrometerToNanometer() {
        assertEquals(1000.0, micrometerToNanometer(1.0), 1e-1)
        assertEquals(5000.0, micrometerToNanometer(5.0), 1e-1)
        assertEquals(10000.0, micrometerToNanometer(10.0), 1e-1)
    }

    // Test Micrometer to Mile
    @Test
    fun testMicrometerToMile() {
        assertEquals(6.21371e-10, micrometerToMile(1.0), 1e-15)
        assertEquals(3.106855e-9, micrometerToMile(5.0), 1e-15)
        assertEquals(6.213711e-9, micrometerToMile(10.0), 1e-15)
    }

    // Test Micrometer to Yard
    @Test
    fun testMicrometerToYard() {
        assertEquals(1.09361e-6, micrometerToYard(1.0), 1e-9)
        assertEquals(5.46805e-6, micrometerToYard(5.0), 1e-9)
        assertEquals(1.09361e-5, micrometerToYard(10.0), 1e-9)
    }

    // Test Micrometer to Foot
    @Test
    fun testMicrometerToFoot() {
        assertEquals(3.28084e-6, micrometerToFoot(1.0), 1e-9)
        assertEquals(1.64042e-5, micrometerToFoot(5.0), 1e-9)
        assertEquals(3.28084e-5, micrometerToFoot(10.0), 1e-9)
    }

    // Test Micrometer to Inch
    @Test
    fun testMicrometerToInch() {
        assertEquals(3.93701e-5, micrometerToInch(1.0), 1e-8)
        assertEquals(1.9685e-4, micrometerToInch(5.0), 1e-8)
        assertEquals(3.93701e-4, micrometerToInch(10.0), 1e-8)
    }

    // Test Micrometer to Nautical Mile
    @Test
    fun testMicrometerToNauticalMile() {
        assertEquals(5.398e-10, micrometerToNauticalMile(1.0), 1e-12)
        assertEquals(2.699e-9, micrometerToNauticalMile(5.0), 1e-12)
        assertEquals(5.399e-9, micrometerToNauticalMile(10.0), 1e-12)
    }

    // Test Nanometer to Kilometer
    @Test
    fun testNanometerToKilometer() {
        assertEquals(1e-12, nanometerToKilometer(1.0), 1e-15)
        assertEquals(5e-12, nanometerToKilometer(5.0), 1e-15)
        assertEquals(1e-11, nanometerToKilometer(10.0), 1e-15)
    }

    // Test Nanometer to Meter
    @Test
    fun testNanometerToMeter() {
        assertEquals(1e-9, nanometerToMeter(1.0), 1e-12)
        assertEquals(5e-9, nanometerToMeter(5.0), 1e-12)
        assertEquals(1e-8, nanometerToMeter(10.0), 1e-12)
    }

    // Test Nanometer to Centimeter
    @Test
    fun testNanometerToCentimeter() {
        assertEquals(1e-7, nanometerToCentimeter(1.0), 1e-10)
        assertEquals(5e-7, nanometerToCentimeter(5.0), 1e-10)
        assertEquals(1e-6, nanometerToCentimeter(10.0), 1e-10)
    }

    // Test Nanometer to Millimeter
    @Test
    fun testNanometerToMillimeter() {
        assertEquals(1e-6, nanometerToMillimeter(1.0), 1e-9)
        assertEquals(5e-6, nanometerToMillimeter(5.0), 1e-9)
        assertEquals(1e-5, nanometerToMillimeter(10.0), 1e-9)
    }

    // Test Nanometer to Micrometer
    @Test
    fun testNanometerToMicrometer() {
        assertEquals(1e-3, nanometerToMicrometer(1.0), 1e-6)
        assertEquals(5e-3, nanometerToMicrometer(5.0), 1e-6)
        assertEquals(1e-2, nanometerToMicrometer(10.0), 1e-6)
    }

    // Test Nanometer to Mile
    @Test
    fun testNanometerToMile() {
        assertEquals(6.213711e-13, nanometerToMile(1.0), 1e-18)
        assertEquals(3.106855e-12, nanometerToMile(5.0), 1e-18)
        assertEquals(6.213711e-12, nanometerToMile(10.0), 1e-18)
    }

    // Test Nanometer to Yard
    @Test
    fun testNanometerToYard() {
        assertEquals(1.09361e-9, nanometerToYard(1.0), 1e-12)
        assertEquals(5.46805e-9, nanometerToYard(5.0), 1e-12)
        assertEquals(1.09361e-8, nanometerToYard(10.0), 1e-12)
    }

    // Test Nanometer to Foot
    @Test
    fun testNanometerToFoot() {
        assertEquals(3.28084e-9, nanometerToFoot(1.0), 1e-12)
        assertEquals(1.64042e-8, nanometerToFoot(5.0), 1e-12)
        assertEquals(3.28084e-8, nanometerToFoot(10.0), 1e-12)
    }

    // Test Nanometer to Inch
    @Test
    fun testNanometerToInch() {
        assertEquals(3.93701e-8, nanometerToInch(1.0), 1e-11)
        assertEquals(1.9685e-7, nanometerToInch(5.0), 1e-11)
        assertEquals(3.93701e-7, nanometerToInch(10.0), 1e-11)
    }

    // Test Nanometer to Nautical Mile
    @Test
    fun testNanometerToNauticalMile() {
        assertEquals(5.398e-13, nanometerToNauticalMile(1.0), 1e-15)
        assertEquals(2.699e-12, nanometerToNauticalMile(5.0), 1e-15)
        assertEquals(5.399e-12, nanometerToNauticalMile(10.0), 1e-15)
    }

    // Test Mile to Kilometer
    @Test
    fun testMileToKilometer() {
        assertEquals(1.60934, mileToKilometer(1.0), 1e-5)
        assertEquals(8.0467, mileToKilometer(5.0), 1e-5)
        assertEquals(16.0934, mileToKilometer(10.0), 1e-5)
    }

    // Test Mile to Meter
    @Test
    fun testMileToMeter() {
        assertEquals(1609.34, mileToMeter(1.0), 1e-2)
        assertEquals(8046.7, mileToMeter(5.0), 1e-2)
        assertEquals(16093.4, mileToMeter(10.0), 1e-2)
    }

    // Test Mile to Centimeter
    @Test
    fun testMileToCentimeter() {
        assertEquals(160934.0, mileToCentimeter(1.0), 1e-1)
        assertEquals(804670.0, mileToCentimeter(5.0), 1e-1)
        assertEquals(1609340.0, mileToCentimeter(10.0), 1e-1)
    }

    // Test Mile to Millimeter
    @Test
    fun testMileToMillimeter() {
        assertEquals(1_609_344.0, mileToMillimeter(1.0), 1e-3)
        assertEquals(8_046_720.0, mileToMillimeter(5.0), 1e-3)
        assertEquals(16_093_440.0, mileToMillimeter(10.0), 1e-3)
    }

    // Test Mile to Micrometer
    @Test
    fun testMileToMicrometer() {
        assertEquals(1_609_344_000.0, mileToMicrometer(1.0), 1e-6)
        assertEquals(8_046_720_000.0, mileToMicrometer(5.0), 1e-6)
        assertEquals(16_093_440_000.0, mileToMicrometer(10.0), 1e-6)
    }

    // Test Mile to Nanometer
    @Test
    fun testMileToNanometer() {
        assertEquals(1_609_344_000_000.0, mileToNanometer(1.0), 1e-9)
        assertEquals(8_046_720_000_000.0, mileToNanometer(5.0), 1e-9)
        assertEquals(16_093_440_000_000.0, mileToNanometer(10.0), 1e-9)
    }

    // Test Mile to Yard
    @Test
    fun testMileToYard() {
        assertEquals(1760.0, mileToYard(1.0), 1e-1)
        assertEquals(8800.0, mileToYard(5.0), 1e-1)
        assertEquals(17600.0, mileToYard(10.0), 1e-1)
    }

    // Test Mile to Foot
    @Test
    fun testMileToFoot() {
        assertEquals(5280.0, mileToFoot(1.0), 1e-1)
        assertEquals(26_400.0, mileToFoot(5.0), 1e-1)
        assertEquals(52_800.0, mileToFoot(10.0), 1e-1)
    }

    // Test Mile to Inch
    @Test
    fun testMileToInch() {
        assertEquals(63_360.0, mileToInch(1.0), 1e-2)
        assertEquals(316_800.0, mileToInch(5.0), 1e-2)
        assertEquals(633_600.0, mileToInch(10.0), 1e-2)
    }

    // Test Mile to Nautical Mile
    @Test
    fun testMileToNauticalMile() {
        assertEquals(0.869, mileToNauticalMile(1.0), 1e-3)
        assertEquals(4.345, mileToNauticalMile(5.0), 1e-3)
        assertEquals(8.690, mileToNauticalMile(10.0), 1e-3)
    }

    // Test Yard to Kilometer
    @Test
    fun testYardToKilometer() {
        assertEquals(0.0009144, yardToKilometer(1.0), 1e-7)
        assertEquals(0.004572, yardToKilometer(5.0), 1e-7)
        assertEquals(0.009144, yardToKilometer(10.0), 1e-7)
    }

    // Test Yard to Meter
    @Test
    fun testYardToMeter() {
        assertEquals(0.9144, yardToMeter(1.0), 1e-4)
        assertEquals(4.572, yardToMeter(5.0), 1e-4)
        assertEquals(9.144, yardToMeter(10.0), 1e-4)
    }

    // Test Yard to Centimeter
    @Test
    fun testYardToCentimeter() {
        assertEquals(91.44, yardToCentimeter(1.0), 1e-2)
        assertEquals(457.2, yardToCentimeter(5.0), 1e-2)
        assertEquals(914.4, yardToCentimeter(10.0), 1e-2)
    }

    // Test Yard to Millimeter
    @Test
    fun testYardToMillimeter() {
        assertEquals(914.4, yardToMillimeter(1.0), 1e-2)
        assertEquals(4572.0, yardToMillimeter(5.0), 1e-2)
        assertEquals(9144.0, yardToMillimeter(10.0), 1e-2)
    }

    // Test Yard to Micrometer
    @Test
    fun testYardToMicrometer() {
        assertEquals(914400.0, yardToMicrometer(1.0), 1e-3)
        assertEquals(4572000.0, yardToMicrometer(5.0), 1e-3)
        assertEquals(9144000.0, yardToMicrometer(10.0), 1e-3)
    }

    // Test Yard to Nanometer
    @Test
    fun testYardToNanometer() {
        assertEquals(914400000.0, yardToNanometer(1.0), 1e-6)
        assertEquals(4572000000.0, yardToNanometer(5.0), 1e-6)
        assertEquals(9144000000.0, yardToNanometer(10.0), 1e-6)
    }

    // Test Yard to Mile
    @Test
    fun testYardToMile() {
        assertEquals(0.0005681818, yardToMile(1.0), 1e-7)
        assertEquals(0.0028409091, yardToMile(5.0), 1e-7)
        assertEquals(0.0056818182, yardToMile(10.0), 1e-7)
    }

    // Test Yard to Foot
    @Test
    fun testYardToFoot() {
        assertEquals(3.0, yardToFoot(1.0), 1e-1)
        assertEquals(15.0, yardToFoot(5.0), 1e-1)
        assertEquals(30.0, yardToFoot(10.0), 1e-1)
    }

    // Test Yard to Inch
    @Test
    fun testYardToInch() {
        assertEquals(36.0, yardToInch(1.0), 1e-1)
        assertEquals(180.0, yardToInch(5.0), 1e-1)
        assertEquals(360.0, yardToInch(10.0), 1e-1)
    }

    // Test Yard to Nautical Mile
    @Test
    fun testYardToNauticalMile() {
        assertEquals(0.00049373694, yardToNauticalMile(1.0), 1e-10)
        assertEquals(0.0024686847, yardToNauticalMile(5.0), 1e-10)
        assertEquals(0.0049373694, yardToNauticalMile(10.0), 1e-10)
    }

    // Test Foot to Kilometer
    @Test
    fun testFootToKilometer() {
        assertEquals(0.0003048, footToKilometer(1.0), 1e-7)
        assertEquals(0.001524, footToKilometer(5.0), 1e-7)
        assertEquals(0.003048, footToKilometer(10.0), 1e-7)
    }

    // Test Foot to Meter
    @Test
    fun testFootToMeter() {
        assertEquals(0.3048, footToMeter(1.0), 1e-4)
        assertEquals(1.524, footToMeter(5.0), 1e-4)
        assertEquals(3.048, footToMeter(10.0), 1e-4)
    }

    // Test Foot to Centimeter
    @Test
    fun testFootToCentimeter() {
        assertEquals(30.48, footToCentimeter(1.0), 1e-2)
        assertEquals(152.4, footToCentimeter(5.0), 1e-2)
        assertEquals(304.8, footToCentimeter(10.0), 1e-2)
    }

    // Test Foot to Millimeter
    @Test
    fun testFootToMillimeter() {
        assertEquals(304.8, footToMillimeter(1.0), 1e-2)
        assertEquals(1524.0, footToMillimeter(5.0), 1e-2)
        assertEquals(3048.0, footToMillimeter(10.0), 1e-2)
    }

    // Test Foot to Micrometer
    @Test
    fun testFootToMicrometer() {
        assertEquals(304800.0, footToMicrometer(1.0), 1e-3)
        assertEquals(1524000.0, footToMicrometer(5.0), 1e-3)
        assertEquals(3048000.0, footToMicrometer(10.0), 1e-3)
    }

    // Test Foot to Nanometer
    @Test
    fun testFootToNanometer() {
        assertEquals(304800000.0, footToNanometer(1.0), 1e-6)
        assertEquals(1524000000.0, footToNanometer(5.0), 1e-6)
        assertEquals(3048000000.0, footToNanometer(10.0), 1e-6)
    }

    // Test Foot to Mile
    @Test
    fun testFootToMile() {
        assertEquals(0.0001893939, footToMile(1.0), 1e-10)
        assertEquals(0.0009469696, footToMile(5.0), 1e-10)
        assertEquals(0.0018939393, footToMile(10.0), 1e-10)
    }

    // Test Foot to Yard
    @Test
    fun testFootToYard() {
        assertEquals(0.3333333333, footToYard(1.0), 1e-10)
        assertEquals(1.6666666666, footToYard(5.0), 1e-10)
        assertEquals(3.3333333333, footToYard(10.0), 1e-10)
    }

    // Test Foot to Inch
    @Test
    fun testFootToInch() {
        assertEquals(12.0, footToInch(1.0), 1e-1)
        assertEquals(60.0, footToInch(5.0), 1e-1)
        assertEquals(120.0, footToInch(10.0), 1e-1)
    }

    // Test Foot to Nautical Mile
    @Test
    fun testFootToNauticalMile() {
        assertEquals(0.0001645787, footToNauticalMile(1.0), 1e-10)
        assertEquals(0.0008228935, footToNauticalMile(5.0), 1e-10)
        assertEquals(0.0016457871, footToNauticalMile(10.0), 1e-10)
    }

    // Test Inch to Kilometer
    @Test
    fun testInchToKilometer() {
        assertEquals(0.0000254, inchToKilometer(1.0), 1e-8)
        assertEquals(0.000127, inchToKilometer(5.0), 1e-8)
        assertEquals(0.000254, inchToKilometer(10.0), 1e-8)
    }

    // Test Inch to Meter
    @Test
    fun testInchToMeter() {
        assertEquals(0.0254, inchToMeter(1.0), 1e-4)
        assertEquals(0.127, inchToMeter(5.0), 1e-4)
        assertEquals(0.254, inchToMeter(10.0), 1e-4)
    }

    // Test Inch to Centimeter
    @Test
    fun testInchToCentimeter() {
        assertEquals(2.54, inchToCentimeter(1.0), 1e-2)
        assertEquals(12.7, inchToCentimeter(5.0), 1e-2)
        assertEquals(25.4, inchToCentimeter(10.0), 1e-2)
    }

    // Test Inch to Millimeter
    @Test
    fun testInchToMillimeter() {
        assertEquals(25.4, inchToMillimeter(1.0), 1e-2)
        assertEquals(127.0, inchToMillimeter(5.0), 1e-2)
        assertEquals(254.0, inchToMillimeter(10.0), 1e-2)
    }

    // Test Inch to Micrometer
    @Test
    fun testInchToMicrometer() {
        assertEquals(25400.0, inchToMicrometer(1.0), 1e-1)
        assertEquals(127000.0, inchToMicrometer(5.0), 1e-1)
        assertEquals(254000.0, inchToMicrometer(10.0), 1e-1)
    }

    // Test Inch to Nanometer
    @Test
    fun testInchToNanometer() {
        assertEquals(25_400_000.0, inchToNanometer(1.0), 1e-3)
        assertEquals(127_000_000.0, inchToNanometer(5.0), 1e-3)
        assertEquals(254_000_000.0, inchToNanometer(10.0), 1e-3)
    }

    // Test Inch to Mile
    @Test
    fun testInchToMile() {
        assertEquals(1.57828e-5, inchToMile(1.0), 1e-10)
        assertEquals(7.89141e-5, inchToMile(5.0), 1e-10)
        assertEquals(0.0001578282, inchToMile(10.0), 1e-10)
    }

    // Test Inch to Yard
    @Test
    fun testInchToYard() {
        assertEquals(0.0277777778, inchToYard(1.0), 1e-10)
        assertEquals(0.1388888889, inchToYard(5.0), 1e-10)
        assertEquals(0.2777777778, inchToYard(10.0), 1e-10)
    }

    // Test Inch to Foot
    @Test
    fun testInchToFoot() {
        assertEquals(0.0833333333, inchToFoot(1.0), 1e-10)
        assertEquals(0.4166666667, inchToFoot(5.0), 1e-10)
        assertEquals(0.8333333333, inchToFoot(10.0), 1e-10)
    }

    // Test Inch to Nautical Mile
    @Test
    fun testInchToNauticalMile() {
        assertEquals(1.37149e-5, inchToNauticalMile(1.0), 1e-10)
        assertEquals(6.85745e-5, inchToNauticalMile(5.0), 1e-10)
        assertEquals(0.000137149, inchToNauticalMile(10.0), 1e-10)
    }

    // Test Nautical Mile to Kilometer
    @Test
    fun testNauticalMileToKilometer() {
        assertEquals(1.852, nauticalMileToKilometer(1.0), 1e-4)
        assertEquals(9.26, nauticalMileToKilometer(5.0), 1e-4)
        assertEquals(18.52, nauticalMileToKilometer(10.0), 1e-4)
    }

    // Test Nautical Mile to Meter
    @Test
    fun testNauticalMileToMeter() {
        assertEquals(1852.0, nauticalMileToMeter(1.0), 1e-2)
        assertEquals(9260.0, nauticalMileToMeter(5.0), 1e-2)
        assertEquals(18520.0, nauticalMileToMeter(10.0), 1e-2)
    }

    // Test Nautical Mile to Centimeter
    @Test
    fun testNauticalMileToCentimeter() {
        assertEquals(185200.0, nauticalMileToCentimeter(1.0), 1e-1)
        assertEquals(926000.0, nauticalMileToCentimeter(5.0), 1e-1)
        assertEquals(1852000.0, nauticalMileToCentimeter(10.0), 1e-1)
    }

    // Test Nautical Mile to Millimeter
    @Test
    fun testNauticalMileToMillimeter() {
        assertEquals(1_852_000.0, nauticalMileToMillimeter(1.0), 1e-3)
        assertEquals(9_260_000.0, nauticalMileToMillimeter(5.0), 1e-3)
        assertEquals(18_520_000.0, nauticalMileToMillimeter(10.0), 1e-3)
    }

    // Test Nautical Mile to Micrometer
    @Test
    fun testNauticalMileToMicrometer() {
        assertEquals(1_852_000_000.0, nauticalMileToMicrometer(1.0), 1e-6)
        assertEquals(9_260_000_000.0, nauticalMileToMicrometer(5.0), 1e-6)
        assertEquals(18_520_000_000.0, nauticalMileToMicrometer(10.0), 1e-6)
    }

    // Test Nautical Mile to Nanometer
    @Test
    fun testNauticalMileToNanometer() {
        assertEquals(1_852_000_000_000.0, nauticalMileToNanometer(1.0), 1e-9)
        assertEquals(9_260_000_000_000.0, nauticalMileToNanometer(5.0), 1e-9)
        assertEquals(18_520_000_000_000.0, nauticalMileToNanometer(10.0), 1e-9)
    }

    // Test Nautical Mile to Mile
    @Test
    fun testNauticalMileToMile() {
        assertEquals(1.15078, nauticalMileToMile(1.0), 1e-5)
        assertEquals(5.7539, nauticalMileToMile(5.0), 1e-5)
        assertEquals(11.5078, nauticalMileToMile(10.0), 1e-5)
    }

    // Test Nautical Mile to Yard
    @Test
    fun testNauticalMileToYard() {
        assertEquals(2025.37, nauticalMileToYard(1.0), 1e-2)
        assertEquals(10126.85, nauticalMileToYard(5.0), 1e-2)
        assertEquals(20253.7, nauticalMileToYard(10.0), 1e-2)
    }

    // Test Nautical Mile to Foot
    @Test
    fun testNauticalMileToFoot() {
        assertEquals(6076.12, nauticalMileToFoot(1.0), 1e-2)
        assertEquals(30_380.6, nauticalMileToFoot(5.0), 1e-2)
        assertEquals(60_761.2, nauticalMileToFoot(10.0), 1e-2)
    }

    // Test Nautical Mile to Inch
    @Test
    fun testNauticalMileToInch() {
        assertEquals(72_913.4, nauticalMileToInch(1.0), 1e-2)
        assertEquals(364_567.0, nauticalMileToInch(5.0), 1e-2)
        assertEquals(729_134.0, nauticalMileToInch(10.0), 1e-2)
    }
}