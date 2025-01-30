package com.ohhhzenix.csc475.fitnesstracker.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.isDouble

fun calculateMaleBMR(weight: Double, height: Double, age: Double): Double {
    return 10 * weight + 6.25 * height - 5 * age + 5
}

fun calculateFemaleBMR(weight: Double, height: Double, age: Double): Double {
    return 10 * weight + 6.25 * height - 5 * age - 161
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculateGoalScreen(
    navController: NavController
) {
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text("Calculate Goals")
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
        )
    }) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Spacer(Modifier.padding(4.dp))
            OutlinedTextField(
                value = height,
                onValueChange = {
                    if (isDouble(it)) {
                        height = it
                    }
                },
                label = {
                    Text("Height (cm)")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
            OutlinedTextField(
                value = weight,
                onValueChange = {
                    if (isDouble(it)) {
                        weight = it
                    }
                },
                label = {
                    Text("Weight (kg)")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
            Spacer(Modifier.padding(4.dp))
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Calculate")
            }
            Button(
                onClick = { navController.navigate(AppScreen.Home.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Back")
            }
        }
    }
}