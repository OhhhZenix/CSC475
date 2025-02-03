package com.ohhhzenix.csc475.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class MassConversionTests {

    // Test Gram to Metric Ton
    @Test
    fun testGramToMetricTon() {
        assertEquals(0.000001, gramToMetricTon(1.0), 1e-7)
        assertEquals(0.005, gramToMetricTon(5000.0), 1e-7)
        assertEquals(0.01, gramToMetricTon(10_000.0), 1e-7)
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
}