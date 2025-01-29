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
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
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
                onClick = { navController.navigate(AppScreen.CalculateGoal.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Calculate Goals")
            }
            Button(
                onClick = { navController.navigate(AppScreen.MealLog.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Meal Log")
            }
            Button(
                onClick = { navController.navigate(AppScreen.ExerciseLog.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Exercise Log")
            }
            Button(
                onClick = { navController.navigate(AppScreen.FoodCatalog.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Food Catalog")
            }
            Button(
                onClick = { navController.navigate(AppScreen.ExerciseCatalog.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Exercise Catalog")
            }
        }
    }
}