package com.ohhhzenix.csc475.fitnesstracker.screen.log.meal

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.food.FoodCatalog
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.food.FoodCatalogDao
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLog
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLogDao
import kotlinx.coroutines.launch
import java.text.DecimalFormat
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MealLogScreen(
    navController: NavController,
    mealLogDao: MealLogDao,
    foodCatalogDao: FoodCatalogDao,
    selectedMealLog: MutableIntState
) {
    val coroutineScope = rememberCoroutineScope()
    val meals = remember { mutableStateListOf<Pair<MealLog, FoodCatalog?>>() }
    var totalCalories by remember { mutableDoubleStateOf(0.0) }
    val decimalFormatter = DecimalFormat("#,###.0")

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            mealLogDao.getTodayLogs().forEach { log ->
                val food = foodCatalogDao.getFood(log.foodId)
                meals.add(Pair(log, food))
                totalCalories += (food?.calories ?: 0.0) * log.quantity
            }
        }
    }

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text("Meal Log")
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
            Button(
                onClick = { navController.navigate(AppScreen.Home.name) },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Back")
            }
            Text(
                "Today's Intake",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 32.sp
            )
            Text(
                text = "Total Calories: ${decimalFormatter.format(totalCalories)}",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic
            )
            Button(
                onClick = { navController.navigate(AppScreen.AddMealLog.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text("Add meal")
            }
            if (meals.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "No logs available from today.", textAlign = TextAlign.Center
                        )
                        Text(
                            "Get started by adding one.", textAlign = TextAlign.Center
                        )
                    }
                }
            } else {
                Text(
                    "Meals from Today:", modifier = Modifier.padding(start = 8.dp)
                )
                LazyColumn {
                    items(meals.sortedBy { it.first.dateTime }.reversed()) {
                        it.second?.let { food ->
                            Button(
                                onClick = {
                                    selectedMealLog.intValue = it.first.foodId
                                    navController.navigate(AppScreen.EditMealLog.name)
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column {
                                        Text(
                                            text = food.name,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 16.sp
                                        )
                                        Text(
                                            text = "Quantity: ${decimalFormatter.format(it.first.quantity)}",
                                            fontWeight = FontWeight.Light
                                        )
                                        Text(
                                            text = "Total Calories: ${decimalFormatter.format(food.calories * it.first.quantity)}",
                                            fontWeight = FontWeight.Light
                                        )
                                    }
                                    Text(
                                        text = it.first.dateTime.format(
                                            DateTimeFormatter.ofPattern(
                                                "MMM dd yyyy hh:mm a"
                                            )
                                        ),
                                        textAlign = TextAlign.End,
                                        modifier = Modifier.fillMaxWidth(),
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}