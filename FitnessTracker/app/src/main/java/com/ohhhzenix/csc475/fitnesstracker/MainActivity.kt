package com.ohhhzenix.csc475.fitnesstracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.ohhhzenix.csc475.fitnesstracker.database.AppDatabase
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.exercise.ExerciseCatalogDao
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.food.FoodCatalogDao
import com.ohhhzenix.csc475.fitnesstracker.database.log.exercise.ExerciseLogDao
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLogDao
import com.ohhhzenix.csc475.fitnesstracker.screen.CalculateGoalScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.HomeScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.catalog.exercise.AddExerciseCatalogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.catalog.exercise.EditExerciseCatalogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.catalog.exercise.ExerciseCatalogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.catalog.food.AddFoodCatalogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.catalog.food.EditFoodCatalogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.catalog.food.FoodCatalogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.log.exercise.AddExerciseLogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.log.exercise.EditExerciseLogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.log.exercise.ExerciseLogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.log.meal.AddMealLogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.log.meal.EditMealLogScreen
import com.ohhhzenix.csc475.fitnesstracker.screen.log.meal.MealLogScreen
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
                App(
                    db.getMealLogDao(),
                    db.getExerciseLogDao(),
                    db.getFoodCatalogDao(),
                    db.getExerciseCatalogDao()
                )
            }
        }
    }
}

@Composable
fun App(
    mealLogDao: MealLogDao,
    exerciseLogDao: ExerciseLogDao,
    foodCatalogDao: FoodCatalogDao,
    exerciseCatalogDao: ExerciseCatalogDao
) {
    val navController = rememberNavController()
    val selectedMealLog = remember { mutableIntStateOf(0) }
    val selectedExerciseLog = remember { mutableIntStateOf(0) }
    val selectedFoodCatalog = remember { mutableIntStateOf(0) }
    val selectedExerciseCatalog = remember { mutableIntStateOf(0) }

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
            CalculateGoalScreen(navController)
        }

        // Meal Log
        composable(AppScreen.MealLog.name) {
            MealLogScreen(navController, mealLogDao, foodCatalogDao, selectedMealLog)
        }
        composable(AppScreen.AddMealLog.name) {
            AddMealLogScreen(navController, mealLogDao, foodCatalogDao)
        }
        composable(AppScreen.EditMealLog.name) {
            EditMealLogScreen(navController, mealLogDao, foodCatalogDao, selectedMealLog)
        }

        // Exercise Log
        composable(AppScreen.ExerciseLog.name) {
            ExerciseLogScreen(
                navController,
                exerciseLogDao,
                exerciseCatalogDao,
                selectedExerciseLog
            )
        }
        composable(AppScreen.AddExerciseLog.name) {
            AddExerciseLogScreen(navController, exerciseLogDao, exerciseCatalogDao)
        }
        composable(AppScreen.EditExerciseLog.name) {
            EditExerciseLogScreen(
                navController,
                exerciseLogDao,
                exerciseCatalogDao,
                selectedExerciseLog
            )
        }


        // Food Catalog
        composable(AppScreen.FoodCatalog.name) {
            FoodCatalogScreen(navController, foodCatalogDao, selectedFoodCatalog)
        }
        composable(AppScreen.AddFood.name) {
            AddFoodCatalogScreen(navController, foodCatalogDao)
        }
        composable(AppScreen.EditFood.name) {
            EditFoodCatalogScreen(navController, foodCatalogDao, selectedFoodCatalog)
        }

        // Exercise Catalog
        composable(AppScreen.ExerciseCatalog.name) {
            ExerciseCatalogScreen(navController, exerciseCatalogDao, selectedExerciseCatalog)
        }
        composable(AppScreen.AddExercise.name) {
            AddExerciseCatalogScreen(navController, exerciseCatalogDao)
        }
        composable(AppScreen.EditExercise.name) {
            EditExerciseCatalogScreen(navController, exerciseCatalogDao, selectedExerciseCatalog)
        }
    }
}