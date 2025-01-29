package com.ohhhzenix.csc475.fitnesstracker.screen.log.meal

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLog
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLogDao
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MealLogScreen(
    navController: NavController,
    mealLogDao: MealLogDao,
) {
    val coroutineScope = rememberCoroutineScope()
    val mealsFromToday = remember { mutableStateListOf<MealLog>() }

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            mealsFromToday.clear()
            mealsFromToday.addAll(mealLogDao.getTodayLogs())
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
            Spacer(Modifier.padding(8.dp))
            Text(
                "Today's Intake",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 32.sp
            )
            Text(
                "Total Calories: 0",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic
            )
            Button(
                onClick = {}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text("Add meal")
            }
            if (mealsFromToday.isEmpty()) {
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
                    items(mealsFromToday) {

                    }
                }
            }
        }
    }
}