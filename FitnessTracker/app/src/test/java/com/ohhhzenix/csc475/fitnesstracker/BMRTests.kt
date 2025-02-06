package com.ohhhzenix.csc475.fitnesstracker

import org.junit.Assert.assertEquals
import org.junit.Test

class BMRTests {

    @Test
    fun testMaleBMR() {
        assertEquals(1857.45, calculateMaleBMR(90.62, 175.4, 30.0), 0.01)
    }

    @Test
    fun testFemaleBMR() {
        assertEquals(1629.00, calculateMaleBMR(77.4, 160.0, 30.0), 0.01)
    }
}