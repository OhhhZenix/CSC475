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

    // Test Microgram to Metric Ton
    @Test
    fun testMicrogramToMetricTon() {
        assertEquals(1.0e-12, microgramToMetricTon(1.0), 1e-15)
        assertEquals(5.0e-12, microgramToMetricTon(5.0), 1e-15)
        assertEquals(1.0e-11, microgramToMetricTon(10.0), 1e-15)
    }

    // Test Microgram to Kilogram
    @Test
    fun testMicrogramToKilogram() {
        assertEquals(1.0e-9, microgramToKilogram(1.0), 1e-12)
        assertEquals(5.0e-9, microgramToKilogram(5.0), 1e-12)
        assertEquals(1.0e-8, microgramToKilogram(10.0), 1e-12)
    }

    // Test Microgram to Gram
    @Test
    fun testMicrogramToGram() {
        assertEquals(1.0e-6, microgramToGram(1.0), 1e-9)
        assertEquals(5.0e-6, microgramToGram(5.0), 1e-9)
        assertEquals(1.0e-5, microgramToGram(10.0), 1e-9)
    }

    // Test Microgram to Milligram
    @Test
    fun testMicrogramToMilligram() {
        assertEquals(0.001, microgramToMilligram(1.0), 1e-6)
        assertEquals(0.005, microgramToMilligram(5.0), 1e-6)
        assertEquals(0.01, microgramToMilligram(10.0), 1e-6)
    }

    // Test Microgram to Imperial Ton
    @Test
    fun testMicrogramToImperialTon() {
        assertEquals(9.8420e-13, microgramToImperialTon(1.0), 1e-17)
        assertEquals(4.92101e-12, microgramToImperialTon(5.0), 1e-17)
        assertEquals(9.84203e-12, microgramToImperialTon(10.0), 1e-17)
    }

    // Test Microgram to US Ton
    @Test
    fun testMicrogramToUSTon() {
        assertEquals(1.10231e-12, microgramToUSTon(1.0), 1e-17)
        assertEquals(5.51155e-12, microgramToUSTon(5.0), 1e-17)
        assertEquals(1.102311e-11, microgramToUSTon(10.0), 1e-17)
    }

    // Test Microgram to Stone
    @Test
    fun testMicrogramToStone() {
        assertEquals(1.57e-10, microgramToStone(1.0), 1e-12)
        assertEquals(7.87e-10, microgramToStone(5.0), 1e-12)
        assertEquals(1.574e-9, microgramToStone(10.0), 1e-12)
    }

    // Test Microgram to Pound
    @Test
    fun testMicrogramToPound() {
        assertEquals(2.2046e-12, microgramToPound(1.0), 1e-15)
        assertEquals(1.10231e-11, microgramToPound(5.0), 1e-15)
        assertEquals(2.20462e-11, microgramToPound(10.0), 1e-15)
    }

    // Test Microgram to Ounce
    @Test
    fun testMicrogramToOunce() {
        assertEquals(3.5273e-11, microgramToOunce(1.0), 1e-15)
        assertEquals(1.76369e-10, microgramToOunce(5.0), 1e-15)
        assertEquals(3.52739e-10, microgramToOunce(10.0), 1e-15)
    }

    // Test Imperial Ton to Metric Ton
    @Test
    fun testImperialTonToMetricTon() {
        assertEquals(1.016, imperialTonToMetricTon(1.0), 1e-3)
        assertEquals(5.08, imperialTonToMetricTon(5.0), 1e-3)
        assertEquals(10.16, imperialTonToMetricTon(10.0), 1e-3)
    }

    // Test Imperial Ton to Kilogram
    @Test
    fun testImperialTonToKilogram() {
        assertEquals(1016.05, imperialTonToKilogram(1.0), 1e-2)
        assertEquals(5080.25, imperialTonToKilogram(5.0), 1e-2)
        assertEquals(10160.5, imperialTonToKilogram(10.0), 1e-2)
    }

    // Test Imperial Ton to Gram
    @Test
    fun testImperialTonToGram() {
        assertEquals(1_016_050.0, imperialTonToGram(1.0), 1e-1)
        assertEquals(5_080_250.0, imperialTonToGram(5.0), 1e-1)
        assertEquals(10_160_500.0, imperialTonToGram(10.0), 1e-1)
    }

    // Test Imperial Ton to Milligram
    @Test
    fun testImperialTonToMilligram() {
        assertEquals(1_016_050_000.0, imperialTonToMilligram(1.0), 1e-2)
        assertEquals(5_080_250_000.0, imperialTonToMilligram(5.0), 1e-2)
        assertEquals(10_160_500_000.0, imperialTonToMilligram(10.0), 1e-2)
    }

    // Test Imperial Ton to Microgram
    @Test
    fun testImperialTonToMicrogram() {
        assertEquals(1_016_050_000_000.0, imperialTonToMicrogram(1.0), 1e-2)
        assertEquals(5_080_250_000_000.0, imperialTonToMicrogram(5.0), 1e-2)
        assertEquals(10_160_500_000_000.0, imperialTonToMicrogram(10.0), 1e-2)
    }

    // Test Imperial Ton to US Ton
    @Test
    fun testImperialTonToUSTon() {
        assertEquals(1.119, imperialTonToUSTon(1.0), 1e-3)
        assertEquals(5.595, imperialTonToUSTon(5.0), 1e-3)
        assertEquals(11.19, imperialTonToUSTon(10.0), 1e-3)
    }

    // Test Imperial Ton to Stone
    @Test
    fun testImperialTonToStone() {
        assertEquals(20.0, imperialTonToStone(1.0), 1e-2)
        assertEquals(100.0, imperialTonToStone(5.0), 1e-2)
        assertEquals(200.0, imperialTonToStone(10.0), 1e-2)
    }

    // Test Imperial Ton to Pound
    @Test
    fun testImperialTonToPound() {
        assertEquals(2240.0, imperialTonToPound(1.0), 1e-2)
        assertEquals(11_200.0, imperialTonToPound(5.0), 1e-2)
        assertEquals(22_400.0, imperialTonToPound(10.0), 1e-2)
    }

    // Test Imperial Ton to Ounce
    @Test
    fun testImperialTonToOunce() {
        assertEquals(35_840.0, imperialTonToOunce(1.0), 1e-2)
        assertEquals(179_200.0, imperialTonToOunce(5.0), 1e-2)
        assertEquals(358_400.0, imperialTonToOunce(10.0), 1e-2)
    }

    // Test US Ton to Metric Ton
    @Test
    fun testUSTonToMetricTon() {
        assertEquals(0.907, usTonToMetricTon(1.0), 1e-3)
        assertEquals(4.535, usTonToMetricTon(5.0), 1e-3)
        assertEquals(9.071, usTonToMetricTon(10.0), 1e-3)
    }

    // Test US Ton to Kilogram
    @Test
    fun testUSTonToKilogram() {
        assertEquals(907.18474, usTonToKilogram(1.0), 1e-5)
        assertEquals(4535.9237, usTonToKilogram(5.0), 1e-5)
        assertEquals(9071.8474, usTonToKilogram(10.0), 1e-5)
    }

    // Test US Ton to Gram
    @Test
    fun testUSTonToGram() {
        assertEquals(907_184.74, usTonToGram(1.0), 1e-2)
        assertEquals(4_535_923.7, usTonToGram(5.0), 1e-2)
        assertEquals(9_071_847.4, usTonToGram(10.0), 1e-2)
    }

    // Test US Ton to Milligram
    @Test
    fun testUSTonToMilligram() {
        assertEquals(907_184_740.0, usTonToMilligram(1.0), 1e-1)
        assertEquals(4_535_923_700.0, usTonToMilligram(5.0), 1e-1)
        assertEquals(9_071_847_400.0, usTonToMilligram(10.0), 1e-1)
    }

    // Test US Ton to Microgram
    @Test
    fun testUSTonToMicrogram() {
        assertEquals(907_184_740_000.0, usTonToMicrogram(1.0), 1e-1)
        assertEquals(4_535_923_700_000.0, usTonToMicrogram(5.0), 1e-1)
        assertEquals(9_071_847_400_000.0, usTonToMicrogram(10.0), 1e-1)
    }

    // Test US Ton to Imperial Ton
    @Test
    fun testUSTonToImperialTon() {
        assertEquals(0.894, usTonToImperialTon(1.0), 1e-3)
        assertEquals(4.468, usTonToImperialTon(5.0), 1e-3)
        assertEquals(8.936, usTonToImperialTon(10.0), 1e-3)
    }

    // Test US Ton to Stone
    @Test
    fun testUSTonToStone() {
        assertEquals(142.857, usTonToStone(1.0), 1e-3)
        assertEquals(714.285, usTonToStone(5.0), 1e-3)
        assertEquals(1428.57, usTonToStone(10.0), 1e-3)
    }

    // Test US Ton to Pound
    @Test
    fun testUSTonToPound() {
        assertEquals(2000.0, usTonToPound(1.0), 1e-2)
        assertEquals(10_000.0, usTonToPound(5.0), 1e-2)
        assertEquals(20_000.0, usTonToPound(10.0), 1e-2)
    }

    // Test US Ton to Ounce
    @Test
    fun testUSTonToOunce() {
        assertEquals(32_000.0, usTonToOunce(1.0), 1e-2)
        assertEquals(160_000.0, usTonToOunce(5.0), 1e-2)
        assertEquals(320_000.0, usTonToOunce(10.0), 1e-2)
    }

    // Test Stone to Metric Ton
    @Test
    fun testStoneToMetricTon() {
        assertEquals(0.00635, stoneToMetricTon(1.0), 1e-5)
        assertEquals(0.03175, stoneToMetricTon(5.0), 1e-5)
        assertEquals(0.0635, stoneToMetricTon(10.0), 1e-5)
    }

    // Test Stone to Kilogram
    @Test
    fun testStoneToKilogram() {
        assertEquals(6.35, stoneToKilogram(1.0), 1e-2)
        assertEquals(31.75, stoneToKilogram(5.0), 1e-2)
        assertEquals(63.5, stoneToKilogram(10.0), 1e-2)
    }

    // Test Stone to Gram
    @Test
    fun testStoneToGram() {
        assertEquals(6350.293, stoneToGram(1.0), 1e-3)
        assertEquals(31_751.465, stoneToGram(5.0), 1e-3)
        assertEquals(63_502.93, stoneToGram(10.0), 1e-3)
    }

    // Test Stone to Milligram
    @Test
    fun testStoneToMilligram() {
        assertEquals(6_350_293.0, stoneToMilligram(1.0), 1e-1)
        assertEquals(31_751_465.0, stoneToMilligram(5.0), 1e-1)
        assertEquals(63_502_930.0, stoneToMilligram(10.0), 1e-1)
    }

    // Test Stone to Microgram
    @Test
    fun testStoneToMicrogram() {
        assertEquals(6_350_293_000.0, stoneToMicrogram(1.0), 1e-1)
        assertEquals(31_751_465_000.0, stoneToMicrogram(5.0), 1e-1)
        assertEquals(63_502_930_000.0, stoneToMicrogram(10.0), 1e-1)
    }

    // Test Stone to Imperial Ton
    @Test
    fun testStoneToImperialTon() {
        assertEquals(0.05, stoneToImperialTon(1.0), 1e-2)
        assertEquals(0.25, stoneToImperialTon(5.0), 1e-2)
        assertEquals(0.5, stoneToImperialTon(10.0), 1e-2)
    }

    // Test Stone to US Ton
    @Test
    fun testStoneToUSTon() {
        assertEquals(0.007, stoneToUSTon(1.0), 1e-3)
        assertEquals(0.035, stoneToUSTon(5.0), 1e-3)
        assertEquals(0.07, stoneToUSTon(10.0), 1e-3)
    }

    // Test Stone to Pound
    @Test
    fun testStoneToPound() {
        assertEquals(14.0, stoneToPound(1.0), 1e-2)
        assertEquals(70.0, stoneToPound(5.0), 1e-2)
        assertEquals(140.0, stoneToPound(10.0), 1e-2)
    }

    // Test Stone to Ounce
    @Test
    fun testStoneToOunce() {
        assertEquals(224.0, stoneToOunce(1.0), 1e-2)
        assertEquals(1120.0, stoneToOunce(5.0), 1e-2)
        assertEquals(2240.0, stoneToOunce(10.0), 1e-2)
    }
}