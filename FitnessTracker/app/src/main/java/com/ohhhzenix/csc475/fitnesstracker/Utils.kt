package com.ohhhzenix.csc475.fitnesstracker

fun isDouble(value: String): Boolean {
    return value.toDoubleOrNull() != null
}