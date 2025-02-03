package com.ohhhzenix.csc475.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class MassConversionTests {

    // Test Metric Ton to Kilogram
    @Test
    fun testMetricTonToKilogram() {
        assertEquals(1000.0, metricTonToKilogram(1.0), 1e-6)
        assertEquals(5000.0, metricTonToKilogram(5.0), 1e-6)
        assertEquals(10_000.0, metricTonToKilogram(10.0), 1e-6)
    }

    // Test Metric Ton to Gram
    @Test
    fun testMetricTonToGram() {
        assertEquals(1_000_000.0, metricTonToGram(1.0), 1e-6)
        assertEquals(5_000_000.0, metricTonToGram(5.0), 1e-6)
        assertEquals(10_000_000.0, metricTonToGram(10.0), 1e-6)
    }

    // Test Metric Ton to Milligram
    @Test
    fun testMetricTonToMilligram() {
        assertEquals(1_000_000_000.0, metricTonToMilligram(1.0), 1e-6)
        assertEquals(5_000_000_000.0, metricTonToMilligram(5.0), 1e-6)
        assertEquals(10_000_000_000.0, metricTonToMilligram(10.0), 1e-6)
    }

    // Test Metric Ton to Microgram
    @Test
    fun testMetricTonToMicrogram() {
        assertEquals(1_000_000_000_000.0, metricTonToMicrogram(1.0), 1e-6)
        assertEquals(5_000_000_000_000.0, metricTonToMicrogram(5.0), 1e-6)
        assertEquals(10_000_000_000_000.0, metricTonToMicrogram(10.0), 1e-6)
    }

    // Test Metric Ton to Imperial Ton
    @Test
    fun testMetricTonToImperialTon() {
        assertEquals(0.984207, metricTonToImperialTon(1.0), 1e-6)
        assertEquals(4.921035, metricTonToImperialTon(5.0), 1e-6)
        assertEquals(9.84207, metricTonToImperialTon(10.0), 1e-6)
    }

    // Test Metric Ton to US Ton
    @Test
    fun testMetricTonToUSTon() {
        assertEquals(1.10231, metricTonToUSTon(1.0), 1e-6)
        assertEquals(5.51155, metricTonToUSTon(5.0), 1e-6)
        assertEquals(11.0231, metricTonToUSTon(10.0), 1e-6)
    }

    // Test Metric Ton to Stone
    @Test
    fun testMetricTonToStone() {
        assertEquals(157.473, metricTonToStone(1.0), 1e-3)
        assertEquals(787.365, metricTonToStone(5.0), 1e-3)
        assertEquals(1_574.73, metricTonToStone(10.0), 1e-3)
    }

    // Test Metric Ton to Pound
    @Test
    fun testMetricTonToPound() {
        assertEquals(2204.62, metricTonToPound(1.0), 1e-2)
        assertEquals(11_023.1, metricTonToPound(5.0), 1e-2)
        assertEquals(22_046.2, metricTonToPound(10.0), 1e-2)
    }

    // Test Metric Ton to Ounce
    @Test
    fun testMetricTonToOunce() {
        assertEquals(35_273.96, metricTonToOunce(1.0), 1e-2)
        assertEquals(176_369.8, metricTonToOunce(5.0), 1e-2)
        assertEquals(352_739.6, metricTonToOunce(10.0), 1e-2)
    }

    // Test Gram to Metric Ton
    @Test
    fun testGramToMetricTon() {
        assertEquals(0.000001, gramToMetricTon(1.0), 1e-7)
        assertEquals(0.005, gramToMetricTon(5000.0), 1e-7)
        assertEquals(0.01, gramToMetricTon(10_000.0), 1e-7)
    }

    // Test Kilogram to Metric Ton
    @Test
    fun testKilogramToMetricTon() {
        assertEquals(1.0, kilogramToMetricTon(1000.0), 1e-6)
        assertEquals(5.0, kilogramToMetricTon(5000.0), 1e-6)
        assertEquals(10.0, kilogramToMetricTon(10_000.0), 1e-6)
    }

    // Test Kilogram to Gram
    @Test
    fun testKilogramToGram() {
        assertEquals(1000.0, kilogramToGram(1.0), 1e-6)
        assertEquals(5000.0, kilogramToGram(5.0), 1e-6)
        assertEquals(10_000.0, kilogramToGram(10.0), 1e-6)
    }

    // Test Kilogram to Milligram
    @Test
    fun testKilogramToMilligram() {
        assertEquals(1_000_000.0, kilogramToMilligram(1.0), 1e-6)
        assertEquals(5_000_000.0, kilogramToMilligram(5.0), 1e-6)
        assertEquals(10_000_000.0, kilogramToMilligram(10.0), 1e-6)
    }

    // Test Kilogram to Microgram
    @Test
    fun testKilogramToMicrogram() {
        assertEquals(1_000_000_000.0, kilogramToMicrogram(1.0), 1e-6)
        assertEquals(5_000_000_000.0, kilogramToMicrogram(5.0), 1e-6)
        assertEquals(10_000_000_000.0, kilogramToMicrogram(10.0), 1e-6)
    }

    // Test Kilogram to Imperial Ton
    @Test
    fun testKilogramToImperialTon() {
        assertEquals(0.984203, kilogramToImperialTon(1000.0), 1e-6)
        assertEquals(4.921017, kilogramToImperialTon(5000.0), 1e-6)
        assertEquals(9.842035, kilogramToImperialTon(10_000.0), 1e-6)
    }

    // Test Kilogram to US Ton
    @Test
    fun testKilogramToUSTon() {
        assertEquals(1.102311, kilogramToUSTon(1000.0), 1e-6)
        assertEquals(5.511556, kilogramToUSTon(5000.0), 1e-6)
        assertEquals(11.023113, kilogramToUSTon(10_000.0), 1e-6)
    }

    // Test Kilogram to Stone
    @Test
    fun testKilogramToStone() {
        assertEquals(157.480, kilogramToStone(1000.0), 1e-3)
        assertEquals(787.401, kilogramToStone(5000.0), 1e-3)
        assertEquals(1_574.803, kilogramToStone(10_000.0), 1e-3)
    }

    // Test Kilogram to Pound
    @Test
    fun testKilogramToPound() {
        assertEquals(2.20462, kilogramToPound(1.0), 1e-6)
        assertEquals(11.0231, kilogramToPound(5.0), 1e-6)
        assertEquals(22.0462, kilogramToPound(10.0), 1e-6)
    }

    // Test Kilogram to Ounce
    @Test
    fun testKilogramToOunce() {
        assertEquals(35.274, kilogramToOunce(1.0), 1e-2)
        assertEquals(176.37, kilogramToOunce(5.0), 1e-2)
        assertEquals(352.74, kilogramToOunce(10.0), 1e-2)
    }

    // Test Gram to Kilogram
    @Test
    fun testGramToKilogram() {
        assertEquals(0.001, gramToKilogram(1.0), 1e-3)
        assertEquals(5.0, gramToKilogram(5000.0), 1e-3)
        assertEquals(10.0, gramToKilogram(10_000.0), 1e-3)
    }

    // Test Gram to Milligram
    @Test
    fun testGramToMilligram() {
        assertEquals(1000.0, gramToMilligram(1.0), 1e-1)
        assertEquals(5_000_000.0, gramToMilligram(5000.0), 1e-1)
        assertEquals(10_000_000.0, gramToMilligram(10_000.0), 1e-1)
    }

    // Test Gram to Microgram
    @Test
    fun testGramToMicrogram() {
        assertEquals(1_000_000.0, gramToMicrogram(1.0), 1e-1)
        assertEquals(5_000_000_000.0, gramToMicrogram(5000.0), 1e-1)
        assertEquals(10_000_000_000.0, gramToMicrogram(10_000.0), 1e-1)
    }

    // Test Gram to Imperial Ton
    @Test
    fun testGramToImperialTon() {
        assertEquals(9.84e-7, gramToImperialTon(1.0), 1e-8)
        assertEquals(4.92101e-3, gramToImperialTon(5000.0), 1e-8)
        assertEquals(9.84203e-3, gramToImperialTon(10_000.0), 1e-8)
    }

    // Test Gram to US Ton
    @Test
    fun testGramToUSTon() {
        assertEquals(1.1e-6, gramToUSTon(1.0), 1e-8)
        assertEquals(5.51155e-3, gramToUSTon(5000.0), 1e-8)
        assertEquals(1.102311e-2, gramToUSTon(10_000.0), 1e-8)
    }

    // Test Gram to Stone
    @Test
    fun testGramToStone() {
        assertEquals(0.000157, gramToStone(1.0), 1e-6)
        assertEquals(0.787, gramToStone(5000.0), 1e-3)
        assertEquals(1.574, gramToStone(10_000.0), 1e-3)
    }

    // Test Gram to Pound
    @Test
    fun testGramToPound() {
        assertEquals(0.00220462, gramToPound(1.0), 1e-8)
        assertEquals(11.0231, gramToPound(5000.0), 1e-4)
        assertEquals(22.0462, gramToPound(10_000.0), 1e-4)
    }

    // Test Gram to Ounce
    @Test
    fun testGramToOunce() {
        assertEquals(0.03527399, gramToOunce(1.0), 1e-8)
        assertEquals(176.3699536, gramToOunce(5000.0), 1e-7)
        assertEquals(352.7399072, gramToOunce(10_000.0), 1e-7)
    }

    // Test Milligram to Metric Ton
    @Test
    fun testMilligramToMetricTon() {
        assertEquals(1.0e-9, milligramToMetricTon(1.0), 1e-12)
        assertEquals(5.0e-9, milligramToMetricTon(5.0), 1e-12)
        assertEquals(1.0e-8, milligramToMetricTon(10.0), 1e-12)
    }

    // Test Milligram to Kilogram
    @Test
    fun testMilligramToKilogram() {
        assertEquals(1.0e-6, milligramToKilogram(1.0), 1e-9)
        assertEquals(5.0e-6, milligramToKilogram(5.0), 1e-9)
        assertEquals(1.0e-5, milligramToKilogram(10.0), 1e-9)
    }

    // Test Milligram to Gram
    @Test
    fun testMilligramToGram() {
        assertEquals(0.001, milligramToGram(1.0), 1e-6)
        assertEquals(0.005, milligramToGram(5.0), 1e-6)
        assertEquals(0.01, milligramToGram(10.0), 1e-6)
    }

    // Test Milligram to Microgram
    @Test
    fun testMilligramToMicrogram() {
        assertEquals(1000.0, milligramToMicrogram(1.0), 1e-3)
        assertEquals(5000.0, milligramToMicrogram(5.0), 1e-3)
        assertEquals(10_000.0, milligramToMicrogram(10.0), 1e-3)
    }

    // Test Milligram to Imperial Ton
    @Test
    fun testMilligramToImperialTon() {
        assertEquals(9.842e-10, milligramToImperialTon(1.0), 1e-14)
        assertEquals(4.92101e-9, milligramToImperialTon(5.0), 1e-14)
        assertEquals(9.84203e-9, milligramToImperialTon(10.0), 1e-14)
    }

    // Test Milligram to US Ton
    @Test
    fun testMilligramToUSTon() {
        assertEquals(1.10231e-9, milligramToUSTon(1.0), 1e-14)
        assertEquals(5.51155e-9, milligramToUSTon(5.0), 1e-14)
        assertEquals(1.102311e-8, milligramToUSTon(10.0), 1e-14)
    }

    // Test Milligram to Stone
    @Test
    fun testMilligramToStone() {
        assertEquals(1.57e-7, milligramToStone(1.0), 1e-9)
        assertEquals(7.87e-7, milligramToStone(5.0), 1e-9)
        assertEquals(1.574e-6, milligramToStone(10.0), 1e-9)
    }

    // Test Milligram to Pound
    @Test
    fun testMilligramToPound() {
        assertEquals(2.2e-9, milligramToPound(1.0), 1e-11)
        assertEquals(1.102e-8, milligramToPound(5.0), 1e-11)
        assertEquals(2.204e-8, milligramToPound(10.0), 1e-11)
    }

    // Test Milligram to Ounce
    @Test
    fun testMilligramToOunce() {
        assertEquals(3.53e-8, milligramToOunce(1.0), 1e-10)
        assertEquals(1.7636e-7, milligramToOunce(5.0), 1e-10)
        assertEquals(3.5273e-7, milligramToOunce(10.0), 1e-10)
    }
}