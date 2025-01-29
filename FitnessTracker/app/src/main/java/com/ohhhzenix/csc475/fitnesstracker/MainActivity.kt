package com.ohhhzenix.csc475.fitnesstracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.ohhhzenix.csc475.fitnesstracker.database.AppDatabase
import com.ohhhzenix.csc475.fitnesstracker.database.MealLogDao
import com.ohhhzenix.csc475.fitnesstracker.screen.CalculateGoalScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.food.FoodCatalogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.HomeScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.meallog.MealLogScreen
import com.ohhhzenix.csc475.fitnesstracker.ui.theme.FitnessTrackerTheme

class MainActivity : ComponentActivity() {

    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            AppDatabase.NAME
        ).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitnessTrackerTheme {
                App(db.getMealLogDao())
            }
        }
    }
}

@Composable
fun App(mealLogDao: MealLogDao) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreen.Home.name
    ) {
        // Home
        composable(AppScreen.Home.name) {
            HomeScreen(navController)
        }

        // Calculate Goal
        composable(AppScreen.CalculateGoal.name) {
            CalculateGoalScreen()
        }

        // Meal Log
        composable(AppScreen.MealLog.name) {
            MealLogScreen(navController, mealLogDao)
        }
        composable(AppScreen.AddMealLog.name) {  }
        composable(AppScreen.EditMealLog.name) {  }

        // Exercise Log
        composable(AppScreen.ExerciseLog.name) {  }
        composable(AppScreen.AddExerciseLog.name) {  }
        composable(AppScreen.EditExerciseLog.name) {  }


        // Food Catalog
        composable(AppScreen.FoodCatalog.name) {
            FoodCatalogScreen(navController)
        }
        composable(AppScreen.AddFood.name) {  }
        composable(AppScreen.EditFood.name) {  }

        // Exercise Catalog
        composable(AppScreen.ExerciseCatalog.name) {  }
        composable(AppScreen.AddExercise.name) {  }
        composable(AppScreen.EditExercise.name) {  }
    }
}