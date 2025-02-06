package com.ohhhzenix.csc475.fitnesstracker.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.isDouble
import java.text.DecimalFormat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculateGoalScreen(
    navController: NavController
) {
    val context = LocalContext.current
    var age by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    val sexOptions = remember { mutableStateListOf("Male", "Female") }
    var selectedSex by remember { mutableStateOf("") }
    var isExpanded by remember { mutableStateOf(false) }
    var calculated by remember { mutableStateOf(false) }
    var bmr by remember { mutableDoubleStateOf(0.0) }
    val decimalFormatter = DecimalFormat("#,###.#")

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
            if (calculated) {
                Column(
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
                ) {
                    Text(text = "Given the following details:")
                    Text(text = "- Sex: $selectedSex")
                    Text(text = "- Age: ${decimalFormatter.format(age.toDouble())} years old")
                    Text(text = "- Height: ${decimalFormatter.format(height.toDouble())} cm")
                    Text(text = "- Weight: ${decimalFormatter.format(weight.toDouble())} kg")
                    Text(text = "Here are the options:")
                    Text(text = "- Maintain Weight: ${decimalFormatter.format(bmr)} Calories")
                    Text(text = "- Gain Weight: ${decimalFormatter.format(bmr + 500)} Calories")
                    Text(text = "- Lose Weight: ${decimalFormatter.format(bmr - 500)} Calories")
                }
                Button(
                    onClick = { calculated = false },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) {
                    Text("Recalculate")
                }
                Button(
                    onClick = { navController.navigate(AppScreen.Home.name) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) {
                    Text("Back to Home")
                }
            } else {
                Spacer(Modifier.padding(4.dp))
                ExposedDropdownMenuBox(
                    expanded = isExpanded,
                    onExpandedChange = { isExpanded = !isExpanded },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                ) {
                    OutlinedTextField(
                        value = selectedSex,
                        onValueChange = {},
                        label = { Text("Sex") },
                        readOnly = true,
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .menuAnchor(type = MenuAnchorType.PrimaryEditable)
                    )
                    ExposedDropdownMenu(expanded = isExpanded,
                        onDismissRequest = { isExpanded = false }) {
                        sexOptions.forEach {
                            DropdownMenuItem(
                                text = { Text(it) },
                                onClick = {
                                    selectedSex = it
                                    isExpanded = false
                                }, contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                            )
                        }
                    }
                }
                OutlinedTextField(
                    value = age,
                    onValueChange = {
                        if (isDouble(it)) {
                            age = it
                        }
                    },
                    label = {
                        Text("Age (years)")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                )
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
                    onClick = {
                        if (selectedSex.isEmpty()) {
                            Toast.makeText(
                                context,
                                "A sex has not been selected. Try again.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (age.isEmpty()) {
                            Toast.makeText(
                                context,
                                "Age is empty. Try again.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (age.toDouble() <= 0.0) {
                            Toast.makeText(
                                context,
                                "Age must be greater than zero. Try again.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (height.isEmpty()) {
                            Toast.makeText(
                                context,
                                "Height is empty. Try again.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (height.toDouble() <= 0.0) {
                            Toast.makeText(
                                context,
                                "Height must be greater than zero. Try again.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (weight.isEmpty()) {
                            Toast.makeText(
                                context,
                                "Weight is empty. Try again.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (weight.toDouble() <= 0.0) {
                            Toast.makeText(
                                context,
                                "Weight must be greater than zero. Try again.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            if (selectedSex == sexOptions[0]) {
                                bmr = calculateMaleBMR(
                                    weight.toDouble(),
                                    height.toDouble(),
                                    age.toDouble()
                                )
                            } else if (selectedSex == sexOptions[1]) {
                                bmr = calculateFemaleBMR(
                                    weight.toDouble(),
                                    height.toDouble(),
                                    age.toDouble()
                                )
                            }
                            calculated = true
                        }
                    },
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
}