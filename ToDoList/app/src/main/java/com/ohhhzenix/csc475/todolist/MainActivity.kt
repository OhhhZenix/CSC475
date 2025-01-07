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
import com.ohhhzenix.csc475.todolist.database.Task
import com.ohhhzenix.csc475.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]

        setContent {
            ToDoListTheme {
                MyApp(viewModel = taskViewModel)
            }
        }
    }
}

@Composable
fun MyApp(viewModel: TaskViewModel) {
    val navController = rememberNavController()
    val tasks = remember { mutableListOf<Task>() }
    val filter = remember { mutableStateOf(FilterType.SHOW_UNCOMPLETED) }
    val selectedTask = remember { mutableStateOf<Task?>(null) }

    NavHost(
        navController = navController,
        startDestination = AppScreen.Main.name
    ) {
        composable(AppScreen.Main.name) {
            HomeScreen(navController, tasks, selectedTask, filter)
        }
        composable(AppScreen.Filter.name) {
            FilterScreen(navController, filter)
        }
        composable(AppScreen.NewTask.name) {
            NewTaskScreen(navController, tasks)
        }
        composable(AppScreen.EditTask.name) {
            EditTaskScreen(navController, selectedTask, tasks)
        }
    }
}


