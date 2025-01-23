package com.ohhhzenix.csc475.fitnesstracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ohhhzenix.csc475.fitnesstracker.screen.HomeScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.MealLogScreen
import com.ohhhzenix.csc475.fitnesstracker.ui.theme.FitnessTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitnessTrackerTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreen.Home.name
    ) {
        composable(AppScreen.Home.name) {
            HomeScreen(
                navMealLogScreen = { navController.navigate(AppScreen.MealLog.name) },
                navExerciseLogScreen = { navController.navigate(AppScreen.ExerciseLog.name) },
                navCalculateGoalScreen = { navController.navigate(AppScreen.CalculateGoal.name) },
                navFoodCatalogScreen = { navController.navigate(AppScreen.FoodCatalog.name) },
                navExerciseCatalogScreen = { navController.navigate(AppScreen.ExerciseCatalog.name) })
        }
        composable(AppScreen.MealLog.name) {
            MealLogScreen()
        }
    }
}