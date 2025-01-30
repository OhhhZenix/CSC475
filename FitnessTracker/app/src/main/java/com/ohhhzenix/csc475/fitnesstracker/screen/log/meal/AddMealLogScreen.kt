package com.ohhhzenix.csc475.fitnesstracker.screen.log.meal

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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.food.FoodCatalogDao
import com.ohhhzenix.csc475.fitnesstracker.isDouble

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddMealLogScreen(
    navController: NavController,
    foodCatalogDao: FoodCatalogDao
) {
    val isExpanded = remember { mutableStateOf(false) }
    val food = remember { mutableStateListOf<Pair<String, Int>>() }
    val selectedFoodName = remember { mutableStateOf("") }
    val selectedFoodId = remember { mutableIntStateOf(0) }
    val quantity = remember { mutableStateOf("") }

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
                ExposedDropdownMenu(
                    expanded = isExpanded.value,
                    onDismissRequest = { isExpanded.value = false }
                ) {
                    food.forEach {
                        DropdownMenuItem(
                            text = { Text(it.first) },
                            onClick = {
                                selectedFoodName.value = it.first
                                selectedFoodId.intValue = it.second
                                isExpanded.value = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
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
            Spacer(Modifier.padding(4.dp))
            Button(
                onClick = { },
                modifier = Modifier
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