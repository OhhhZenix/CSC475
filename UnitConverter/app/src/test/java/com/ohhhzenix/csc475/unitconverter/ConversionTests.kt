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

    @Test
    fun inchToMicrometerTest() {
        assertEquals(25_400.0, inchToMicrometer(1.0), 0.001)
    }

    @Test
    fun inchToNanometerTest() {
        assertEquals(25_400_000.0, inchToNanometer(1.0), 0.001)
    }

    @Test
    fun inchToMileTest() {
        assertEquals(1.5783e-5, inchToMile(1.0), 0.001)
    }

    @Test
    fun inchToYardTest() {
        assertEquals(0.0277778, inchToYard(1.0), 0.001)
    }

    @Test
    fun inchToFootTest() {
        assertEquals(0.0833333, inchToFoot(1.0), 0.001)
    }

    @Test
    fun inchToNauticalMileTest() {
        assertEquals(1.3715e-5, inchToNauticalMile(1.0), 0.001)
    }

    // Nautical Mile to other units
    @Test
    fun nauticalMileToKilometerTest() {
        assertEquals(1.852, nauticalMileToKilometer(1.0), 0.001)
    }

    @Test
    fun nauticalMileToMeterTest() {
        assertEquals(1852.0, nauticalMileToMeter(1.0), 0.001)
    }

    @Test
    fun nauticalMileToCentimeterTest() {
        assertEquals(185_200.0, nauticalMileToCentimeter(1.0), 0.001)
    }

    @Test
    fun nauticalMileToMillimeterTest() {
        assertEquals(1_852_000.0, nauticalMileToMillimeter(1.0), 0.001)
    }

    @Test
    fun nauticalMileToMicrometerTest() {
        assertEquals(1_852_000_000.0, nauticalMileToMicrometer(1.0), 0.001)
    }

    @Test
    fun nauticalMileToNanometerTest() {
        assertEquals(1_852_000_000_000.0, nauticalMileToNanometer(1.0), 0.001)
    }

    @Test
    fun nauticalMileToMileTest() {
        assertEquals(1.15078, nauticalMileToMile(1.0), 0.001)
    }

    @Test
    fun nauticalMileToYardTest() {
        assertEquals(2025.37, nauticalMileToYard(1.0), 0.001)
    }

    @Test
    fun nauticalMileToFootTest() {
        assertEquals(6076.12, nauticalMileToFoot(1.0), 0.001)
    }

    @Test
    fun nauticalMileToInchTest() {
        assertEquals(72_913.4, nauticalMileToInch(1.0), 0.001)
    }

    // Metric Ton to other units
    @Test
    fun metricTonToKilogramTest() {
        assertEquals(1000.0, metricTonToKilogram(1.0), 0.001)
    }

    @Test
    fun metricTonToGramTest() {
        assertEquals(1_000_000.0, metricTonToGram(1.0), 0.001)
    }

    @Test
    fun metricTonToMilligramTest() {
        assertEquals(1_000_000_000.0, metricTonToMilligram(1.0), 0.001)
    }

    @Test
    fun metricTonToMicrogramTest() {
        assertEquals(1_000_000_000_000.0, metricTonToMicrogram(1.0), 0.001)
    }

    @Test
    fun metricTonToImperialTonTest() {
        assertEquals(0.984207, metricTonToImperialTon(1.0), 0.001)
    }

    @Test
    fun metricTonToUSTonTest() {
        assertEquals(1.10231, metricTonToUSTon(1.0), 0.001)
    }

    @Test
    fun metricTonToStoneTest() {
        assertEquals(157.473, metricTonToStone(1.0), 0.001)
    }

    @Test
    fun metricTonToPoundTest() {
        assertEquals(2204.62, metricTonToPound(1.0), 0.001)
    }

    @Test
    fun metricTonToOunceTest() {
        assertEquals(35_273.96, metricTonToOunce(1.0), 0.001)
    }

    // Kilogram to other units
    @Test
    fun kilogramToMetricTonTest() {
        assertEquals(0.001, kilogramToMetricTon(1.0), 0.001)
    }

    @Test
    fun kilogramToGramTest() {
        assertEquals(1000.0, kilogramToGram(1.0), 0.001)
    }

    @Test
    fun kilogramToMilligramTest() {
        assertEquals(1_000_000.0, kilogramToMilligram(1.0), 0.001)
    }

    @Test
    fun kilogramToMicrogramTest() {
        assertEquals(1_000_000_000.0, kilogramToMicrogram(1.0), 0.001)
    }

    @Test
    fun kilogramToImperialTonTest() {
        assertEquals(0.000984207, kilogramToImperialTon(1.0), 0.001)
    }

    @Test
    fun kilogramToUSTonTest() {
        assertEquals(0.00110231, kilogramToUSTon(1.0), 0.001)
    }

    @Test
    fun kilogramToStoneTest() {
        assertEquals(0.157473, kilogramToStone(1.0), 0.001)
    }

    @Test
    fun kilogramToPoundTest() {
        assertEquals(2.20462, kilogramToPound(1.0), 0.001)
    }

    @Test
    fun kilogramToOunceTest() {
        assertEquals(35.274, kilogramToOunce(1.0), 0.001)
    }

    // Gram to other units
    @Test
    fun gramToMetricTonTest() {
        assertEquals(1e-6, gramToMetricTon(1.0), 0.001)
    }

    @Test
    fun gramToKilogramTest() {
        assertEquals(0.001, gramToKilogram(1.0), 0.001)
    }

    @Test
    fun gramToMilligramTest() {
        assertEquals(1000.0, gramToMilligram(1.0), 0.001)
    }

    @Test
    fun gramToMicrogramTest() {
        assertEquals(1_000_000.0, gramToMicrogram(1.0), 0.001)
    }

    @Test
    fun gramToImperialTonTest() {
        assertEquals(9.8421e-7, gramToImperialTon(1.0), 0.001)
    }

    @Test
    fun gramToUSTonTest() {
        assertEquals(1.1023e-6, gramToUSTon(1.0), 0.001)
    }

    @Test
    fun gramToStoneTest() {
        assertEquals(0.000157473, gramToStone(1.0), 0.001)
    }

    @Test
    fun gramToPoundTest() {
        assertEquals(0.00220462, gramToPound(1.0), 0.001)
    }

    @Test
    fun gramToOunceTest() {
        assertEquals(0.035274, gramToOunce(1.0), 0.001)
    }

    // Milligram to other units
    @Test
    fun milligramToMetricTonTest() {
        assertEquals(1e-9, milligramToMetricTon(1.0), 0.001)
    }

    @Test
    fun milligramToKilogramTest() {
        assertEquals(1e-6, milligramToKilogram(1.0), 0.001)
    }

    @Test
    fun milligramToGramTest() {
        assertEquals(0.001, milligramToGram(1.0), 0.001)
    }

    @Test
    fun milligramToMicrogramTest() {
        assertEquals(1000.0, milligramToMicrogram(1.0), 0.001)
    }

    @Test
    fun milligramToImperialTonTest() {
        assertEquals(9.8421e-10, milligramToImperialTon(1.0), 0.001)
    }

    @Test
    fun milligramToUSTonTest() {
        assertEquals(1.1023e-9, milligramToUSTon(1.0), 0.001)
    }

    @Test
    fun milligramToStoneTest() {
        assertEquals(1.5747e-7, milligramToStone(1.0), 0.001)
    }

    @Test
    fun milligramToPoundTest() {
        assertEquals(2.2046e-6, milligramToPound(1.0), 0.001)
    }

    @Test
    fun milligramToOunceTest() {
        assertEquals(3.5274e-5, milligramToOunce(1.0), 0.001)
    }

    // Microgram to other units
    @Test
    fun microgramToMetricTonTest() {
        assertEquals(1e-12, microgramToMetricTon(1.0), 0.001)
    }

    @Test
    fun microgramToKilogramTest() {
        assertEquals(1e-9, microgramToKilogram(1.0), 0.001)
    }

    @Test
    fun microgramToGramTest() {
        assertEquals(1e-6, microgramToGram(1.0), 0.001)
    }

    @Test
    fun microgramToMilligramTest() {
        assertEquals(0.001, microgramToMilligram(1.0), 0.001)
    }

    @Test
    fun microgramToImperialTonTest() {
        assertEquals(9.8421e-13, microgramToImperialTon(1.0), 0.001)
    }

    @Test
    fun microgramToUSTonTest() {
        assertEquals(1.1023e-12, microgramToUSTon(1.0), 0.001)
    }

    @Test
    fun microgramToStoneTest() {
        assertEquals(1.5747e-10, microgramToStone(1.0), 0.001)
    }

    @Test
    fun microgramToPoundTest() {
        assertEquals(2.2046e-9, microgramToPound(1.0), 0.001)
    }

    @Test
    fun microgramToOunceTest() {
        assertEquals(3.5274e-8, microgramToOunce(1.0), 0.001)
    }

    // Imperial Ton to other units
    @Test
    fun imperialTonToMetricTonTest() {
        assertEquals(1.01605, imperialTonToMetricTon(1.0), 0.001)
    }

    @Test
    fun imperialTonToKilogramTest() {
        assertEquals(1016.05, imperialTonToKilogram(1.0), 0.001)
    }

    @Test
    fun imperialTonToGramTest() {
        assertEquals(1_016_050.0, imperialTonToGram(1.0), 0.001)
    }

    @Test
    fun imperialTonToMilligramTest() {
        assertEquals(1_016_050_000.0, imperialTonToMilligram(1.0), 0.001)
    }

    @Test
    fun imperialTonToMicrogramTest() {
        assertEquals(1_016_050_000_000.0, imperialTonToMicrogram(1.0), 0.001)
    }

    @Test
    fun imperialTonToUSTonTest() {
        assertEquals(1.119, imperialTonToUSTon(1.0), 0.001)
    }

    @Test
    fun imperialTonToStoneTest() {
        assertEquals(20.0, imperialTonToStone(1.0), 0.001)
    }

    @Test
    fun imperialTonToPoundTest() {
        assertEquals(2240.0, imperialTonToPound(1.0), 0.001)
    }

    @Test
    fun imperialTonToOunceTest() {
        assertEquals(35_840.0, imperialTonToOunce(1.0), 0.001)
    }

    // US Ton (short ton) to other units
    @Test
    fun usTonToMetricTonTest() {
        assertEquals(0.907185, usTonToMetricTon(1.0), 0.001)
    }

    @Test
    fun usTonToKilogramTest() {
        assertEquals(907.185, usTonToKilogram(1.0), 0.001)
    }

    @Test
    fun usTonToGramTest() {
        assertEquals(907_185.0, usTonToGram(1.0), 0.001)
    }

    @Test
    fun usTonToMilligramTest() {
        assertEquals(907_185_000.0, usTonToMilligram(1.0), 0.001)
    }

    @Test
    fun usTonToMicrogramTest() {
        assertEquals(907_185_000_000.0, usTonToMicrogram(1.0), 0.001)
    }

    @Test
    fun usTonToImperialTonTest() {
        assertEquals(0.892857, usTonToImperialTon(1.0), 0.001)
    }

    @Test
    fun usTonToStoneTest() {
        assertEquals(142.857, usTonToStone(1.0), 0.001)
    }

    @Test
    fun usTonToPoundTest() {
        assertEquals(2000.0, usTonToPound(1.0), 0.001)
    }

    @Test
    fun usTonToOunceTest() {
        assertEquals(32_000.0, usTonToOunce(1.0), 0.001)
    }

    // Stone to other units
    @Test
    fun stoneToMetricTonTest() {
        assertEquals(0.00635029, stoneToMetricTon(1.0), 0.001)
    }

    @Test
    fun stoneToKilogramTest() {
        assertEquals(6.35029, stoneToKilogram(1.0), 0.001)
    }

    @Test
    fun stoneToGramTest() {
        assertEquals(6350.29, stoneToGram(1.0), 0.001)
    }

    @Test
    fun stoneToMilligramTest() {
        assertEquals(6_350_290.0, stoneToMilligram(1.0), 0.001)
    }

    @Test
    fun stoneToMicrogramTest() {
        assertEquals(6_350_290_000.0, stoneToMicrogram(1.0), 0.001)
    }

    @Test
    fun stoneToImperialTonTest() {
        assertEquals(0.05, stoneToImperialTon(1.0), 0.001)
    }

    @Test
    fun stoneToUSTonTest() {
        assertEquals(0.007, stoneToUSTon(1.0), 0.001)
    }

    @Test
    fun stoneToPoundTest() {
        assertEquals(14.0, stoneToPound(1.0), 0.001)
    }

    @Test
    fun stoneToOunceTest() {
        assertEquals(224.0, stoneToOunce(1.0), 0.001)
    }

    // Pound to other units
    @Test
    fun poundToMetricTonTest() {
        assertEquals(0.000453592, poundToMetricTon(1.0), 0.001)
    }

    @Test
    fun poundToKilogramTest() {
        assertEquals(0.453592, poundToKilogram(1.0), 0.001)
    }

    @Test
    fun poundToGramTest() {
        assertEquals(453.592, poundToGram(1.0), 0.001)
    }

    @Test
    fun poundToMilligramTest() {
        assertEquals(453_592.0, poundToMilligram(1.0), 0.001)
    }

    @Test
    fun poundToMicrogramTest() {
        assertEquals(453_592_370.0, poundToMicrogram(1.0), 0.001)
    }

    @Test
    fun poundToImperialTonTest() {
        assertEquals(0.000446429, poundToImperialTon(1.0), 0.001)
    }

    @Test
    fun poundToUSTonTest() {
        assertEquals(0.0005, poundToUSTon(1.0), 0.001)
    }

    @Test
    fun poundToStoneTest() {
        assertEquals(0.0714286, poundToStone(1.0), 0.001)
    }

    @Test
    fun poundToOunceTest() {
        assertEquals(16.0, poundToOunce(1.0), 0.001)
    }

    // Ounce to other units
    @Test
    fun ounceToMetricTonTest() {
        assertEquals(2.835e-5, ounceToMetricTon(1.0), 0.001)
    }

    @Test
    fun ounceToKilogramTest() {
        assertEquals(0.0283495, ounceToKilogram(1.0), 0.001)
    }

    @Test
    fun ounceToGramTest() {
        assertEquals(28.3495, ounceToGram(1.0), 0.001)
    }

    @Test
    fun ounceToMilligramTest() {
        assertEquals(28_349.5, ounceToMilligram(1.0), 0.001)
    }
}