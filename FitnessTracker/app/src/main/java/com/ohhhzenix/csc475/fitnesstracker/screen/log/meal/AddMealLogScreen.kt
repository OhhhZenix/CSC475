package com.ohhhzenix.csc475.fitnesstracker.screen.log.meal

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.R
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.food.FoodCatalogDao
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLog
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLogDao
import com.ohhhzenix.csc475.fitnesstracker.isDouble
import kotlinx.coroutines.launch
import java.time.Instant
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddMealLogScreen(
    navController: NavController,
    mealLogDao: MealLogDao,
    foodCatalogDao: FoodCatalogDao,
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val isExpanded = remember { mutableStateOf(false) }
    val food = remember { mutableStateListOf<Pair<String, Int>>() }
    val selectedFoodName = remember { mutableStateOf("") }
    val selectedFoodId = remember { mutableIntStateOf(0) }
    val quantity = remember { mutableStateOf("") }

    var pickedDate by remember { mutableStateOf(LocalDate.now()) }
    var pickedTime by remember { mutableStateOf(LocalTime.now()) }
    val formattedDate by remember {
        derivedStateOf {
            DateTimeFormatter.ofPattern("MMM dd yyyy").format(pickedDate)
        }
    }
    val formattedTime by remember {
        derivedStateOf {
            DateTimeFormatter.ofPattern("hh:mm a").format(pickedTime)
        }
    }
    val datePickerState = rememberDatePickerState()
    val timePickerState = rememberTimePickerState()
    var showDateDialog by remember { mutableStateOf(false) }
    var showTimeDialog by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        foodCatalogDao.getAllFood().forEach {
            food.add(Pair(it.name, it.id))
        }
    }

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text("New Meal Log")
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
            ExposedDropdownMenuBox(
                expanded = isExpanded.value,
                onExpandedChange = { isExpanded.value = !isExpanded.value },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                OutlinedTextField(
                    value = selectedFoodName.value,
                    onValueChange = {},
                    label = { Text("Food") },
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded.value) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor(type = MenuAnchorType.PrimaryEditable)
                )
                ExposedDropdownMenu(expanded = isExpanded.value,
                    onDismissRequest = { isExpanded.value = false }) {
                    food.forEach {
                        DropdownMenuItem(text = { Text(it.first) }, onClick = {
                            selectedFoodName.value = it.first
                            selectedFoodId.intValue = it.second
                            isExpanded.value = false
                        }, contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                        )
                    }
                }
            }
            OutlinedTextField(
                value = quantity.value,
                onValueChange = {
                    if (isDouble(it)) {
                        quantity.value = it
                    }
                },
                label = { Text("Quantity") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
            OutlinedTextField(
                value = formattedDate,
                onValueChange = {},
                label = { Text("Date") },
                readOnly = true,
                trailingIcon = {
                    IconButton(onClick = { showDateDialog = true }) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = "Select date"
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            )
            if (showDateDialog) {
                DatePickerDialog(
                    onDismissRequest = {
                        showDateDialog = false
                    },
                    dismissButton = {
                        TextButton(onClick = { showDateDialog = false }) { Text("Cancel") }
                    },
                    confirmButton = {
                        TextButton(onClick = {
                            datePickerState.selectedDateMillis?.let {
                                pickedDate = Instant.ofEpochMilli(it).atZone(ZoneOffset.UTC)
                                    .toLocalDate()
                                showDateDialog = false
                            }
                        }) { Text("OK") }
                    }
                ) {
                    DatePicker(state = datePickerState)
                }
            }
            OutlinedTextField(
                value = formattedTime,
                onValueChange = {},
                label = { Text("Time") },
                readOnly = true,
                trailingIcon = {
                    IconButton(onClick = { showTimeDialog = true }) {
                        Icon(
                            painter = painterResource(R.drawable.outline_punch_clock_24),
                            contentDescription = "Select time"
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            )
            if (showTimeDialog) {
                AlertDialog(
                    onDismissRequest = { showTimeDialog = false },
                    dismissButton = {
                        TextButton(onClick = { showDateDialog = false }) {
                            Text("Cancel")
                        }
                    },
                    confirmButton = {
                        TextButton(
                            onClick = {
                                pickedTime =
                                    LocalTime.of(timePickerState.hour, timePickerState.minute)
                                showTimeDialog = false
                            }
                        ) {
                            Text("OK")
                        }
                    },
                    text = {
                        TimePicker(
                            state = timePickerState,
                        )
                    }
                )
            }
            Spacer(Modifier.padding(4.dp))
            Button(
                onClick = {
                    if (selectedFoodName.value.isEmpty()) {
                        Toast.makeText(
                            context, "A food is not selected. Try again.", Toast.LENGTH_SHORT
                        ).show()
                    } else if (quantity.value.isEmpty()) {
                        Toast.makeText(context, "Quantity is empty. Try again.", Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        coroutineScope.launch {
                            mealLogDao.addLog(
                                MealLog(
                                    dateTime = pickedDate.atTime(pickedTime),
                                    foodId = selectedFoodId.intValue,
                                    quantity = quantity.value.toDouble()
                                )
                            )
                        }

                    }
                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Add")
            }
            Button(
                onClick = { navController.navigate(AppScreen.MealLog.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Back")
            }
        }
    }
}

fun convertMillisToDate(it: Long) {

}
