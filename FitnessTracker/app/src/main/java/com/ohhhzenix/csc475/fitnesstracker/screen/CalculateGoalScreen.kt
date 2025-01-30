package com.ohhhzenix.csc475.fitnesstracker.screen

import androidx.compose.runtime.Composable

fun calculateMaleBMR(weight: Double, height: Double, age: Double): Double {
    return 10 * weight + 6.25 * height - 5 * age + 5
}

fun calculateFemaleBMR(weight: Double, height: Double, age: Double): Double {
    return 10 * weight + 6.25 * height - 5 * age - 161
}

@Composable
fun CalculateGoalScreen() {
}