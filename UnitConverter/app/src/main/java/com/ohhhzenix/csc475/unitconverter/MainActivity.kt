package com.ohhhzenix.csc475.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.ohhhzenix.csc475.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                App()
            }
        }
    }
}

fun isDouble(value: String): Boolean {
    return value.toDoubleOrNull() != null
}

// Celsius to other units
fun celsiusToFahrenheit(celsius: Double): Double = (celsius * 9 / 5) + 32
fun celsiusToKelvin(celsius: Double): Double = celsius + 273.15

// Fahrenheit to other units
fun fahrenheitToCelsius(fahrenheit: Double): Double = (fahrenheit - 32) * 5 / 9
fun fahrenheitToKelvin(fahrenheit: Double): Double = (fahrenheit - 32) * 5 / 9 + 273.15

// Kelvin to other units
fun kelvinToCelsius(kelvin: Double): Double = kelvin - 273.15
fun kelvinToFahrenheit(kelvin: Double): Double = (kelvin - 273.15) * 9 / 5 + 32

// Kilometer to other units
fun kilometerToMeter(km: Double): Double = km * 1000
fun kilometerToCentimeter(km: Double): Double = km * 100000
fun kilometerToMillimeter(km: Double): Double = km * 1000000
fun kilometerToMicrometer(km: Double): Double = km * 1_000_000_000
fun kilometerToNanometer(km: Double): Double = km * 1_000_000_000_000
fun kilometerToMile(km: Double): Double = km / 1.60934
fun kilometerToYard(km: Double): Double = km * 1093.61
fun kilometerToFoot(km: Double): Double = km * 3280.84
fun kilometerToInch(km: Double): Double = km * 39370.1
fun kilometerToNauticalMile(km: Double): Double = km / 1.852

// Meter to other units
fun meterToKilometer(m: Double): Double = m / 1000
fun meterToCentimeter(m: Double): Double = m * 100
fun meterToMillimeter(m: Double): Double = m * 1000
fun meterToMicrometer(m: Double): Double = m * 1_000_000
fun meterToNanometer(m: Double): Double = m * 1_000_000_000
fun meterToMile(m: Double): Double = m / 1609.34
fun meterToYard(m: Double): Double = m * 1.09361
fun meterToFoot(m: Double): Double = m * 3.28084
fun meterToInch(m: Double): Double = m * 39.3701
fun meterToNauticalMile(m: Double): Double = m / 1852

// Centimeter to other units
fun centimeterToKilometer(cm: Double): Double = cm / 100_000
fun centimeterToMeter(cm: Double): Double = cm / 100
fun centimeterToMillimeter(cm: Double): Double = cm * 10
fun centimeterToMicrometer(cm: Double): Double = cm * 10_000
fun centimeterToNanometer(cm: Double): Double = cm * 10_000_000
fun centimeterToMile(cm: Double): Double = cm / 160934
fun centimeterToYard(cm: Double): Double = cm / 91.44
fun centimeterToFoot(cm: Double): Double = cm / 30.48
fun centimeterToInch(cm: Double): Double = cm / 2.54
fun centimeterToNauticalMile(cm: Double): Double = cm / 185200

// Millimeter to other units
fun millimeterToKilometer(mm: Double): Double = mm / 1_000_000
fun millimeterToMeter(mm: Double): Double = mm / 1000
fun millimeterToCentimeter(mm: Double): Double = mm / 10
fun millimeterToMicrometer(mm: Double): Double = mm * 1000
fun millimeterToNanometer(mm: Double): Double = mm * 1_000_000
fun millimeterToMile(mm: Double): Double = mm / 1_609_344
fun millimeterToYard(mm: Double): Double = mm / 914.4
fun millimeterToFoot(mm: Double): Double = mm / 304.8
fun millimeterToInch(mm: Double): Double = mm / 25.4
fun millimeterToNauticalMile(mm: Double): Double = mm / 1_852_000

// Micrometer to other units
fun micrometerToKilometer(um: Double): Double = um / 1_000_000_000
fun micrometerToMeter(um: Double): Double = um / 1_000_000
fun micrometerToCentimeter(um: Double): Double = um / 10_000
fun micrometerToMillimeter(um: Double): Double = um / 1000
fun micrometerToNanometer(um: Double): Double = um * 1000
fun micrometerToMile(um: Double): Double = um / 1_609_344_000
fun micrometerToYard(um: Double): Double = um / 914_400
fun micrometerToFoot(um: Double): Double = um / 304_800
fun micrometerToInch(um: Double): Double = um / 25_400
fun micrometerToNauticalMile(um: Double): Double = um / 1_852_000_000

// Nanometer to other units
fun nanometerToKilometer(nm: Double): Double = nm / 1_000_000_000_000
fun nanometerToMeter(nm: Double): Double = nm / 1_000_000_000
fun nanometerToCentimeter(nm: Double): Double = nm / 10_000_000
fun nanometerToMillimeter(nm: Double): Double = nm / 1_000_000
fun nanometerToMicrometer(nm: Double): Double = nm / 1000
fun nanometerToMile(nm: Double): Double = nm / 1_609_344_000_000
fun nanometerToYard(nm: Double): Double = nm / 914_400_000
fun nanometerToFoot(nm: Double): Double = nm / 304_800_000
fun nanometerToInch(nm: Double): Double = nm / 25_400_000
fun nanometerToNauticalMile(nm: Double): Double = nm / 1_852_000_000_000

// Mile to other units
fun mileToKilometer(mile: Double): Double = mile * 1.60934
fun mileToMeter(mile: Double): Double = mile * 1609.34
fun mileToCentimeter(mile: Double): Double = mile * 160934
fun mileToMillimeter(mile: Double): Double = mile * 1_609_344
fun mileToMicrometer(mile: Double): Double = mile * 1_609_344_000
fun mileToNanometer(mile: Double): Double = mile * 1_609_344_000_000
fun mileToYard(mile: Double): Double = mile * 1760
fun mileToFoot(mile: Double): Double = mile * 5280
fun mileToInch(mile: Double): Double = mile * 63_360
fun mileToNauticalMile(mile: Double): Double = mile / 1.15078

// Yard to other units
fun yardToKilometer(yard: Double): Double = yard / 1093.61
fun yardToMeter(yard: Double): Double = yard / 1.09361
fun yardToCentimeter(yard: Double): Double = yard * 91.44
fun yardToMillimeter(yard: Double): Double = yard * 914.4
fun yardToMicrometer(yard: Double): Double = yard * 914400
fun yardToNanometer(yard: Double): Double = yard * 914400000
fun yardToMile(yard: Double): Double = yard / 1760
fun yardToFoot(yard: Double): Double = yard * 3
fun yardToInch(yard: Double): Double = yard * 36
fun yardToNauticalMile(yard: Double): Double = yard / 2025.37

// Foot to other units
fun footToKilometer(foot: Double): Double = foot / 3280.84
fun footToMeter(foot: Double): Double = foot / 3.28084
fun footToCentimeter(foot: Double): Double = foot * 30.48
fun footToMillimeter(foot: Double): Double = foot * 304.8
fun footToMicrometer(foot: Double): Double = foot * 304800
fun footToNanometer(foot: Double): Double = foot * 304800000
fun footToMile(foot: Double): Double = foot / 5280
fun footToYard(foot: Double): Double = foot / 3
fun footToInch(foot: Double): Double = foot * 12
fun footToNauticalMile(foot: Double): Double = foot / 6076.12

// Inch to other units
fun inchToKilometer(inch: Double): Double = inch / 39370.1
fun inchToMeter(inch: Double): Double = inch / 39.3701
fun inchToCentimeter(inch: Double): Double = inch * 2.54
fun inchToMillimeter(inch: Double): Double = inch * 25.4
fun inchToMicrometer(inch: Double): Double = inch * 25_400
fun inchToNanometer(inch: Double): Double = inch * 25_400_000
fun inchToMile(inch: Double): Double = inch / 63_360
fun inchToYard(inch: Double): Double = inch / 36
fun inchToFoot(inch: Double): Double = inch / 12
fun inchToNauticalMile(inch: Double): Double = inch / 72913.4

// Nautical Mile to other units
fun nauticalMileToKilometer(nm: Double): Double = nm * 1.852
fun nauticalMileToMeter(nm: Double): Double = nm * 1852
fun nauticalMileToCentimeter(nm: Double): Double = nm * 185200
fun nauticalMileToMillimeter(nm: Double): Double = nm * 1_852_000
fun nauticalMileToMicrometer(nm: Double): Double = nm * 1_852_000_000
fun nauticalMileToNanometer(nm: Double): Double = nm * 1_852_000_000_000
fun nauticalMileToMile(nm: Double): Double = nm * 1.15078
fun nauticalMileToYard(nm: Double): Double = nm * 2025.37
fun nauticalMileToFoot(nm: Double): Double = nm * 6076.12
fun nauticalMileToInch(nm: Double): Double = nm * 72913.4

// Metric Ton to other units
fun metricTonToKilogram(metricTon: Double): Double = metricTon * 1000
fun metricTonToGram(metricTon: Double): Double = metricTon * 1_000_000
fun metricTonToMilligram(metricTon: Double): Double = metricTon * 1_000_000_000
fun metricTonToMicrogram(metricTon: Double): Double = metricTon * 1_000_000_000_000
fun metricTonToImperialTon(metricTon: Double): Double = metricTon * 0.984207
fun metricTonToStone(metricTon: Double): Double = metricTon * 157.473
fun metricTonToPound(metricTon: Double): Double = metricTon * 2204.62
fun metricTonToOunce(metricTon: Double): Double = metricTon * 35_273.96

// Kilogram to other units
fun kilogramToMetricTon(kg: Double): Double = kg / 1000
fun kilogramToGram(kg: Double): Double = kg * 1000
fun kilogramToMilligram(kg: Double): Double = kg * 1_000_000
fun kilogramToMicrogram(kg: Double): Double = kg * 1_000_000_000
fun kilogramToImperialTon(kg: Double): Double = kg / 1016.05
fun kilogramToStone(kg: Double): Double = kg / 6.35
fun kilogramToPound(kg: Double): Double = kg * 2.20462
fun kilogramToOunce(kg: Double): Double = kg * 35.274

// Gram to other units
fun gramToMetricTon(g: Double): Double = g / 1_000_000
fun gramToKilogram(g: Double): Double = g / 1000
fun gramToMilligram(g: Double): Double = g * 1000
fun gramToMicrogram(g: Double): Double = g * 1_000_000
fun gramToImperialTon(g: Double): Double = g / 1_016_050
fun gramToStone(g: Double): Double = g / 6350.293
fun gramToPound(g: Double): Double = g / 453.592
fun gramToOunce(g: Double): Double = g / 28.3495

// Milligram to other units
fun milligramToMetricTon(mg: Double): Double = mg / 1_000_000_000
fun milligramToKilogram(mg: Double): Double = mg / 1_000_000
fun milligramToGram(mg: Double): Double = mg / 1000
fun milligramToMicrogram(mg: Double): Double = mg * 1000
fun milligramToImperialTon(mg: Double): Double = mg / 1_016_050_000
fun milligramToStone(mg: Double): Double = mg / 6_350_293
fun milligramToPound(mg: Double): Double = mg / 453_592_370
fun milligramToOunce(mg: Double): Double = mg / 28_349_523.125

// Microgram to other units
fun microgramToMetricTon(ug: Double): Double = ug / 1_000_000_000_000
fun microgramToKilogram(ug: Double): Double = ug / 1_000_000_000
fun microgramToGram(ug: Double): Double = ug / 1_000_000
fun microgramToMilligram(ug: Double): Double = ug / 1000
fun microgramToImperialTon(ug: Double): Double = ug / 1_016_050_000_000
fun microgramToStone(ug: Double): Double = ug / 6_350_293_000
fun microgramToPound(ug: Double): Double = ug / 453_592_370_000
fun microgramToOunce(ug: Double): Double = ug / 28_349_523_125

// Imperial Ton to other units
fun imperialTonToMetricTon(impTon: Double): Double = impTon / 0.984207
fun imperialTonToKilogram(impTon: Double): Double = impTon * 1016.05
fun imperialTonToGram(impTon: Double): Double = impTon * 1_016_050
fun imperialTonToMilligram(impTon: Double): Double = impTon * 1_016_050_000
fun imperialTonToMicrogram(impTon: Double): Double = impTon * 1_016_050_000_000
fun imperialTonToStone(impTon: Double): Double = impTon * 20.0000
fun imperialTonToPound(impTon: Double): Double = impTon * 2_240
fun imperialTonToOunce(impTon: Double): Double = impTon * 35_840

// Stone to other units
fun stoneToMetricTon(stone: Double): Double = stone / 157.473
fun stoneToKilogram(stone: Double): Double = stone * 6.35
fun stoneToGram(stone: Double): Double = stone * 6350.293
fun stoneToMilligram(stone: Double): Double = stone * 6_350_293
fun stoneToMicrogram(stone: Double): Double = stone * 6_350_293_000
fun stoneToImperialTon(stone: Double): Double = stone / 20
fun stoneToPound(stone: Double): Double = stone * 14
fun stoneToOunce(stone: Double): Double = stone * 224

// Pound to other units
fun poundToMetricTon(pound: Double): Double = pound / 2204.62
fun poundToKilogram(pound: Double): Double = pound / 2.20462
fun poundToGram(pound: Double): Double = pound * 453.592
fun poundToMilligram(pound: Double): Double = pound * 453_592
fun poundToMicrogram(pound: Double): Double = pound * 453_592_370
fun poundToImperialTon(pound: Double): Double = pound / 2240
fun poundToStone(pound: Double): Double = pound / 14
fun poundToOunce(pound: Double): Double = pound * 16

// Ounce to other units
fun ounceToMetricTon(ounce: Double): Double = ounce / 35_273.96
fun ounceToKilogram(ounce: Double): Double = ounce / 35.274
fun ounceToGram(ounce: Double): Double = ounce * 28.3495
fun ounceToMilligram(ounce: Double): Double = ounce * 28_349.5
fun ounceToMicrogram(ounce: Double): Double = ounce * 28_349_523.125
fun ounceToImperialTon(ounce: Double): Double = ounce / 35_840
fun ounceToStone(ounce: Double): Double = ounce / 224
fun ounceToPound(ounce: Double): Double = ounce / 16

@Composable
fun TemperatureUnits() {
    var celsius by remember { mutableStateOf("") }
    var fahrenheit by remember { mutableStateOf("") }
    var kelvin by remember { mutableStateOf("") }

    OutlinedTextField(
        value = celsius,
        onValueChange = {
            if (isDouble(it)) {
                celsius = it
                fahrenheit = celsiusToFahrenheit(celsius.toDouble()).toString()
                kelvin = celsiusToKelvin(celsius.toDouble()).toString()
            }
        },
        label = {
            Text("Celsius")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        )
    )
    OutlinedTextField(
        value = fahrenheit,
        onValueChange = {
            if (isDouble(it)) {
                fahrenheit = it
                celsius = fahrenheitToCelsius(fahrenheit.toDouble()).toString()
                kelvin = fahrenheitToKelvin(fahrenheit.toDouble()).toString()
            }
        },
        label = {
            Text("Fahrenheit")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        )
    )
    OutlinedTextField(
        value = kelvin,
        onValueChange = {
            if (isDouble(it)) {
                kelvin = it
                celsius = kelvinToCelsius(kelvin.toDouble()).toString()
                fahrenheit = kelvinToFahrenheit(kelvin.toDouble()).toString()
            }
        },
        label = {
            Text("Kelvin")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var unitType by remember { mutableStateOf(UnitType.Temperature) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Unit Converter")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) { Text("Options") }
            TemperatureUnits()
        }
    }
}