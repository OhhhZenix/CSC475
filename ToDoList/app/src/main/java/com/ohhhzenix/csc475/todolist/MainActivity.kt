package com.ohhhzenix.csc475.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ohhhzenix.csc475.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]

        setContent {
            ToDoListTheme {
                AppScreens(viewModel = taskViewModel)
            }
        }
    }
}

@Composable
fun AppScreens(viewModel: TaskViewModel) {
    val navController = rememberNavController()
    val filter by remember { mutableStateOf(FilterType.SHOW_UNCOMPLETED) }

    NavHost(
        navController = navController,
        startDestination = AppScreen.Main.name
    ) {
        composable(AppScreen.Main.name) {
            HomeScreen(viewModel, navController)
        }
        composable(AppScreen.Filter.name) {
            FilterScreen(navController, filter)
        }
        composable(AppScreen.NewTask.name) {
            NewTaskScreen(viewModel)
        }
    }
}


