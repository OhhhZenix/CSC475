package com.ohhhzenix.csc475.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

fun celsiusToFahrenheit(celsius: Double) {}

fun celsiusToKelvin(celsius: Double) {}

fun fahrenheitToCelsius(fahrenheit: Double) {}

fun fahrenheitToKelvin(fahrenheit: Double) {}

fun kelvinToCelsius(kelvin: Double) {}

fun kelvinToFahrenheit(kelvin: Double) {}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    val options = listOf("Temperature", "");
    val options = listOf("Temperature", "Length", "Mass");

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

        }
    }
}