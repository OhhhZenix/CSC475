package com.ohhhzenix.csc475.fitnesstracker.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navMealLogScreen: () -> Unit,
    navExerciseLogScreen: () -> Unit,
    navCalculateGoalScreen: () -> Unit,
    navFoodCatalogScreen: () -> Unit,
    navExerciseCatalogScreen: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Fitness Tracker")
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
            Spacer(Modifier.padding(8.dp))
            Text(
                "Options",
                modifier = Modifier.padding(start = 8.dp),
                fontSize = 32.sp
            )
            Spacer(Modifier.padding(2.dp))
            Text(
                "Get your fitness journey started!",
                modifier = Modifier.padding(start = 8.dp),
                fontStyle = FontStyle.Italic
            )
            Spacer(Modifier.padding(4.dp))
            Button(
                onClick = navMealLogScreen,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Meal Log")
            }
            Button(
                onClick = navExerciseLogScreen,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Exercise Log")
            }
            Button(
                onClick = navCalculateGoalScreen,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Calculate Goals")
            }
            Button(
                onClick = navFoodCatalogScreen,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Food Catalog")
            }
            Button(
                onClick = navExerciseCatalogScreen,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Exercise Catalog")
            }
        }
    }
}