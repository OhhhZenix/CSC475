package com.ohhhzenix.csc475.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
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

@Composable
fun LengthUnits() {
    var kilometer by remember { mutableStateOf("") }
    var meter by remember { mutableStateOf("") }
    var centimeter by remember { mutableStateOf("") }
    var millimeter by remember { mutableStateOf("") }
    var micrometer by remember { mutableStateOf("") }
    var nanometer by remember { mutableStateOf("") }
    var mile by remember { mutableStateOf("") }
    var yard by remember { mutableStateOf("") }
    var foot by remember { mutableStateOf("") }
    var inch by remember { mutableStateOf("") }
    var nauticalMile by remember { mutableStateOf("") }

    OutlinedTextField(
        value = kilometer,
        onValueChange = {
            if (isDouble(it)) {
                kilometer = it
                meter = kilometerToMeter(kilometer.toDouble()).toString()
                centimeter = kilometerToCentimeter(kilometer.toDouble()).toString()
                millimeter = kilometerToMillimeter(kilometer.toDouble()).toString()
                micrometer = kilometerToMicrometer(kilometer.toDouble()).toString()
                nanometer = kilometerToNanometer(kilometer.toDouble()).toString()
                mile = kilometerToMile(kilometer.toDouble()).toString()
                yard = kilometerToYard(kilometer.toDouble()).toString()
                foot = kilometerToFoot(kilometer.toDouble()).toString()
                inch = kilometerToInch(kilometer.toDouble()).toString()
                nauticalMile = kilometerToNauticalMile(kilometer.toDouble()).toString()
            }
        },
        label = { Text("Kilometer") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = meter,
        onValueChange = {
            if (isDouble(it)) {
                meter = it
                kilometer = meterToKilometer(meter.toDouble()).toString()
                centimeter = meterToCentimeter(meter.toDouble()).toString()
                millimeter = meterToMillimeter(meter.toDouble()).toString()
                micrometer = meterToMicrometer(meter.toDouble()).toString()
                nanometer = meterToNanometer(meter.toDouble()).toString()
                mile = meterToMile(meter.toDouble()).toString()
                yard = meterToYard(meter.toDouble()).toString()
                foot = meterToFoot(meter.toDouble()).toString()
                inch = meterToInch(meter.toDouble()).toString()
                nauticalMile = meterToNauticalMile(meter.toDouble()).toString()
            }
        },
        label = { Text("Meter") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = centimeter,
        onValueChange = {
            if (isDouble(it)) {
                centimeter = it
                kilometer = centimeterToKilometer(centimeter.toDouble()).toString()
                meter = centimeterToMeter(centimeter.toDouble()).toString()
                millimeter = centimeterToMillimeter(centimeter.toDouble()).toString()
                micrometer = centimeterToMicrometer(centimeter.toDouble()).toString()
                nanometer = centimeterToNanometer(centimeter.toDouble()).toString()
                mile = centimeterToMile(centimeter.toDouble()).toString()
                yard = centimeterToYard(centimeter.toDouble()).toString()
                foot = centimeterToFoot(centimeter.toDouble()).toString()
                inch = centimeterToInch(centimeter.toDouble()).toString()
                nauticalMile = centimeterToNauticalMile(centimeter.toDouble()).toString()
            }
        },
        label = { Text("Centimeter") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = millimeter,
        onValueChange = {
            if (isDouble(it)) {
                millimeter = it
                kilometer = millimeterToKilometer(millimeter.toDouble()).toString()
                meter = millimeterToMeter(millimeter.toDouble()).toString()
                centimeter = millimeterToCentimeter(millimeter.toDouble()).toString()
                micrometer = millimeterToMicrometer(millimeter.toDouble()).toString()
                nanometer = millimeterToNanometer(millimeter.toDouble()).toString()
                mile = millimeterToMile(millimeter.toDouble()).toString()
                yard = millimeterToYard(millimeter.toDouble()).toString()
                foot = millimeterToFoot(millimeter.toDouble()).toString()
                inch = millimeterToInch(millimeter.toDouble()).toString()
                nauticalMile = millimeterToNauticalMile(millimeter.toDouble()).toString()
            }
        },
        label = { Text("Millimeter") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = micrometer,
        onValueChange = {
            if (isDouble(it)) {
                micrometer = it
                kilometer = micrometerToKilometer(micrometer.toDouble()).toString()
                meter = micrometerToMeter(micrometer.toDouble()).toString()
                centimeter = micrometerToCentimeter(micrometer.toDouble()).toString()
                millimeter = micrometerToMillimeter(micrometer.toDouble()).toString()
                nanometer = micrometerToNanometer(micrometer.toDouble()).toString()
                mile = micrometerToMile(micrometer.toDouble()).toString()
                yard = micrometerToYard(micrometer.toDouble()).toString()
                foot = micrometerToFoot(micrometer.toDouble()).toString()
                inch = micrometerToInch(micrometer.toDouble()).toString()
                nauticalMile = micrometerToNauticalMile(micrometer.toDouble()).toString()
            }
        },
        label = { Text("Micrometer") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = nanometer,
        onValueChange = {
            if (isDouble(it)) {
                nanometer = it
                kilometer = nanometerToKilometer(nanometer.toDouble()).toString()
                meter = nanometerToMeter(nanometer.toDouble()).toString()
                centimeter = nanometerToCentimeter(nanometer.toDouble()).toString()
                millimeter = nanometerToMillimeter(nanometer.toDouble()).toString()
                micrometer = nanometerToMicrometer(nanometer.toDouble()).toString()
                mile = nanometerToMile(nanometer.toDouble()).toString()
                yard = nanometerToYard(nanometer.toDouble()).toString()
                foot = nanometerToFoot(nanometer.toDouble()).toString()
                inch = nanometerToInch(nanometer.toDouble()).toString()
                nauticalMile = nanometerToNauticalMile(nanometer.toDouble()).toString()
            }
        },
        label = { Text("Nanometer") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = mile,
        onValueChange = {
            if (isDouble(it)) {
                mile = it
                kilometer = mileToKilometer(mile.toDouble()).toString()
                meter = mileToMeter(mile.toDouble()).toString()
                centimeter = mileToCentimeter(mile.toDouble()).toString()
                millimeter = mileToMillimeter(mile.toDouble()).toString()
                micrometer = mileToMicrometer(mile.toDouble()).toString()
                nanometer = mileToNanometer(mile.toDouble()).toString()
                yard = mileToYard(mile.toDouble()).toString()
                foot = mileToFoot(mile.toDouble()).toString()
                inch = mileToInch(mile.toDouble()).toString()
                nauticalMile = mileToNauticalMile(mile.toDouble()).toString()
            }
        },
        label = { Text("Mile") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = yard,
        onValueChange = {
            if (isDouble(it)) {
                yard = it
                kilometer = yardToKilometer(yard.toDouble()).toString()
                meter = yardToMeter(yard.toDouble()).toString()
                centimeter = yardToCentimeter(yard.toDouble()).toString()
                millimeter = yardToMillimeter(yard.toDouble()).toString()
                micrometer = yardToMicrometer(yard.toDouble()).toString()
                nanometer = yardToNanometer(yard.toDouble()).toString()
                mile = yardToMile(yard.toDouble()).toString()
                foot = yardToFoot(yard.toDouble()).toString()
                inch = yardToInch(yard.toDouble()).toString()
                nauticalMile = yardToNauticalMile(yard.toDouble()).toString()
            }
        },
        label = { Text("Yard") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = foot,
        onValueChange = {
            if (isDouble(it)) {
                foot = it
                kilometer = footToKilometer(foot.toDouble()).toString()
                meter = footToMeter(foot.toDouble()).toString()
                centimeter = footToCentimeter(foot.toDouble()).toString()
                millimeter = footToMillimeter(foot.toDouble()).toString()
                micrometer = footToMicrometer(foot.toDouble()).toString()
                nanometer = footToNanometer(foot.toDouble()).toString()
                mile = footToMile(foot.toDouble()).toString()
                yard = footToYard(foot.toDouble()).toString()
                inch = footToInch(foot.toDouble()).toString()
                nauticalMile = footToNauticalMile(foot.toDouble()).toString()
            }
        },
        label = { Text("Foot") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = inch,
        onValueChange = {
            if (isDouble(it)) {
                inch = it
                kilometer = inchToKilometer(inch.toDouble()).toString()
                meter = inchToMeter(inch.toDouble()).toString()
                centimeter = inchToCentimeter(inch.toDouble()).toString()
                millimeter = inchToMillimeter(inch.toDouble()).toString()
                micrometer = inchToMicrometer(inch.toDouble()).toString()
                nanometer = inchToNanometer(inch.toDouble()).toString()
                mile = inchToMile(inch.toDouble()).toString()
                yard = inchToYard(inch.toDouble()).toString()
                foot = inchToFoot(inch.toDouble()).toString()
                nauticalMile = inchToNauticalMile(inch.toDouble()).toString()
            }
        },
        label = { Text("Inch") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = nauticalMile,
        onValueChange = {
            if (isDouble(it)) {
                nauticalMile = it
                kilometer = nauticalMileToKilometer(nauticalMile.toDouble()).toString()
                meter = nauticalMileToMeter(nauticalMile.toDouble()).toString()
                centimeter = nauticalMileToCentimeter(nauticalMile.toDouble()).toString()
                millimeter = nauticalMileToMillimeter(nauticalMile.toDouble()).toString()
                micrometer = nauticalMileToMicrometer(nauticalMile.toDouble()).toString()
                nanometer = nauticalMileToNanometer(nauticalMile.toDouble()).toString()
                mile = nauticalMileToMile(nauticalMile.toDouble()).toString()
                yard = nauticalMileToYard(nauticalMile.toDouble()).toString()
                foot = nauticalMileToFoot(nauticalMile.toDouble()).toString()
                inch = nauticalMileToInch(nauticalMile.toDouble()).toString()
            }
        },
        label = { Text("Nautical Mile") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Composable
fun MassUnits() {
    var metricTon by remember { mutableStateOf("") }
    var kilogram by remember { mutableStateOf("") }
    var gram by remember { mutableStateOf("") }
    var milligram by remember { mutableStateOf("") }
    var microgram by remember { mutableStateOf("") }
    var imperialTon by remember { mutableStateOf("") }
    var usTon by remember { mutableStateOf("") }
    var stone by remember { mutableStateOf("") }
    var pound by remember { mutableStateOf("") }
    var ounce by remember { mutableStateOf("") }

    OutlinedTextField(
        value = metricTon,
        onValueChange = {
            if (isDouble(it)) {
                metricTon = it
                kilogram = metricTonToKilogram(metricTon.toDouble()).toString()
                gram = metricTonToGram(metricTon.toDouble()).toString()
                milligram = metricTonToMilligram(metricTon.toDouble()).toString()
                microgram = metricTonToMicrogram(metricTon.toDouble()).toString()
                imperialTon = metricTonToImperialTon(metricTon.toDouble()).toString()
                usTon = metricTonToUSTon(metricTon.toDouble()).toString()
                stone = metricTonToStone(metricTon.toDouble()).toString()
                pound = metricTonToPound(metricTon.toDouble()).toString()
                ounce = metricTonToOunce(metricTon.toDouble()).toString()
            }
        },
        label = { Text("Metric ton") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = kilogram,
        onValueChange = {
            if (isDouble(it)) {
                kilogram = it
                metricTon = kilogramToMetricTon(kilogram.toDouble()).toString()
                gram = kilogramToGram(kilogram.toDouble()).toString()
                milligram = kilogramToMilligram(kilogram.toDouble()).toString()
                microgram = kilogramToMicrogram(kilogram.toDouble()).toString()
                imperialTon = kilogramToImperialTon(kilogram.toDouble()).toString()
                usTon = kilogramToUSTon(kilogram.toDouble()).toString()
                stone = kilogramToStone(kilogram.toDouble()).toString()
                pound = kilogramToPound(kilogram.toDouble()).toString()
                ounce = kilogramToOunce(kilogram.toDouble()).toString()
            }
        },
        label = { Text("Kilogram") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = gram,
        onValueChange = {
            if (isDouble(it)) {
                gram = it
                metricTon = gramToMetricTon(gram.toDouble()).toString()
                kilogram = gramToKilogram(gram.toDouble()).toString()
                milligram = gramToMilligram(gram.toDouble()).toString()
                microgram = gramToMicrogram(gram.toDouble()).toString()
                imperialTon = gramToImperialTon(gram.toDouble()).toString()
                usTon = gramToUSTon(gram.toDouble()).toString()
                stone = gramToStone(gram.toDouble()).toString()
                pound = gramToPound(gram.toDouble()).toString()
                ounce = gramToOunce(gram.toDouble()).toString()
            }
        },
        label = { Text("Gram") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = milligram,
        onValueChange = {
            if (isDouble(it)) {
                milligram = it
                metricTon = milligramToMetricTon(milligram.toDouble()).toString()
                kilogram = milligramToKilogram(milligram.toDouble()).toString()
                gram = milligramToGram(milligram.toDouble()).toString()
                microgram = milligramToMicrogram(milligram.toDouble()).toString()
                imperialTon = milligramToImperialTon(milligram.toDouble()).toString()
                usTon = milligramToUSTon(milligram.toDouble()).toString()
                stone = milligramToStone(milligram.toDouble()).toString()
                pound = milligramToPound(milligram.toDouble()).toString()
                ounce = milligramToOunce(milligram.toDouble()).toString()
            }
        },
        label = { Text("Milligram") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = microgram,
        onValueChange = {
            if (isDouble(it)) {
                microgram = it
                metricTon = microgramToMetricTon(microgram.toDouble()).toString()
                kilogram = microgramToKilogram(microgram.toDouble()).toString()
                gram = microgramToGram(microgram.toDouble()).toString()
                milligram = microgramToMilligram(microgram.toDouble()).toString()
                imperialTon = microgramToImperialTon(microgram.toDouble()).toString()
                usTon = microgramToUSTon(microgram.toDouble()).toString()
                stone = microgramToStone(microgram.toDouble()).toString()
                pound = microgramToPound(microgram.toDouble()).toString()
                ounce = microgramToOunce(microgram.toDouble()).toString()
            }
        },
        label = { Text("Microgram") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = imperialTon,
        onValueChange = {
            if (isDouble(it)) {
                imperialTon = it
                metricTon = imperialTonToMetricTon(imperialTon.toDouble()).toString()
                kilogram = imperialTonToKilogram(imperialTon.toDouble()).toString()
                gram = imperialTonToGram(imperialTon.toDouble()).toString()
                milligram = imperialTonToMilligram(imperialTon.toDouble()).toString()
                microgram = imperialTonToMicrogram(imperialTon.toDouble()).toString()
                usTon = imperialTonToUSTon(imperialTon.toDouble()).toString()
                stone = imperialTonToStone(imperialTon.toDouble()).toString()
                pound = imperialTonToPound(imperialTon.toDouble()).toString()
                ounce = imperialTonToOunce(imperialTon.toDouble()).toString()
            }
        },
        label = { Text("Imperial ton") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = usTon,
        onValueChange = {
            if (isDouble(it)) {
                usTon = it
                metricTon = usTonToMetricTon(usTon.toDouble()).toString()
                kilogram = usTonToKilogram(usTon.toDouble()).toString()
                gram = usTonToGram(usTon.toDouble()).toString()
                milligram = usTonToMilligram(usTon.toDouble()).toString()
                microgram = usTonToMicrogram(usTon.toDouble()).toString()
                imperialTon = usTonToImperialTon(usTon.toDouble()).toString()
                stone = usTonToStone(usTon.toDouble()).toString()
                pound = usTonToPound(usTon.toDouble()).toString()
                ounce = usTonToOunce(usTon.toDouble()).toString()
            }
        },
        label = { Text("US ton") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = stone,
        onValueChange = {
            if (isDouble(it)) {
                stone = it
                metricTon = stoneToMetricTon(stone.toDouble()).toString()
                kilogram = stoneToKilogram(stone.toDouble()).toString()
                gram = stoneToGram(stone.toDouble()).toString()
                milligram = stoneToMilligram(stone.toDouble()).toString()
                microgram = stoneToMicrogram(stone.toDouble()).toString()
                imperialTon = stoneToImperialTon(stone.toDouble()).toString()
                usTon = stoneToUSTon(stone.toDouble()).toString()
                pound = stoneToPound(stone.toDouble()).toString()
                ounce = stoneToOunce(stone.toDouble()).toString()
            }
        },
        label = { Text("Stone") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = pound,
        onValueChange = {
            if (isDouble(it)) {
                pound = it
                metricTon = poundToMetricTon(pound.toDouble()).toString()
                kilogram = poundToKilogram(pound.toDouble()).toString()
                gram = poundToGram(pound.toDouble()).toString()
                milligram = poundToMilligram(pound.toDouble()).toString()
                microgram = poundToMicrogram(pound.toDouble()).toString()
                imperialTon = poundToImperialTon(pound.toDouble()).toString()
                usTon = poundToUSTon(pound.toDouble()).toString()
                stone = poundToStone(pound.toDouble()).toString()
                ounce = poundToOunce(pound.toDouble()).toString()
            }
        },
        label = { Text("Pound") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    OutlinedTextField(
        value = ounce,
        onValueChange = {
            if (isDouble(it)) {
                ounce = it
                metricTon = ounceToMetricTon(ounce.toDouble()).toString()
                kilogram = ounceToKilogram(ounce.toDouble()).toString()
                gram = ounceToGram(ounce.toDouble()).toString()
                milligram = ounceToMilligram(ounce.toDouble()).toString()
                microgram = ounceToMicrogram(ounce.toDouble()).toString()
                imperialTon = ounceToImperialTon(ounce.toDouble()).toString()
                usTon = ounceToUSTon(ounce.toDouble()).toString()
                stone = ounceToStone(ounce.toDouble()).toString()
                pound = ounceToPound(ounce.toDouble()).toString()
            }
        },
        label = { Text("Ounce") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var unitType by remember { mutableStateOf(UnitType.Temperature) }
    var optionScreen by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

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
                .verticalScroll(scrollState)
        ) {
            if (optionScreen) {
                Text(
                    "Current Units: ${unitType.name}",
                    modifier = Modifier.padding(8.dp)
                )
                Button(
                    onClick = {
                        unitType = UnitType.Temperature
                        optionScreen = false
                    },
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) { Text("Show Temperature Units") }
                Button(
                    onClick = {
                        unitType = UnitType.Length
                        optionScreen = false
                    },
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) { Text("Show Length Units") }
                Button(
                    onClick = {
                        unitType = UnitType.Mass
                        optionScreen = false
                    },
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) { Text("Show Mass Units") }
                Button(
                    onClick = { optionScreen = false },
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) { Text("Back") }
            } else {
                Button(
                    onClick = { optionScreen = true },
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) { Text("Options") }
                when (unitType) {
                    UnitType.Temperature -> TemperatureUnits()
                    UnitType.Length -> LengthUnits()
                    UnitType.Mass -> MassUnits()
                }
            }
        }
    }
}