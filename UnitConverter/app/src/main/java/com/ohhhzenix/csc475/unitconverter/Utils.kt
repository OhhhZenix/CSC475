package com.ohhhzenix.csc475.unitconverter

fun isDouble(value: String): Boolean {
    return value.toDoubleOrNull() != null
}