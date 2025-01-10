package com.ohhhzenix.csc475.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.ohhhzenix.csc475.todolist.database.AppDatabase
import com.ohhhzenix.csc475.todolist.database.TaskDao
import com.ohhhzenix.csc475.todolist.ui.theme.ToDoListTheme

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
            ToDoListTheme {
                MyApp(db.getTaskDao())
            }
        }
    }
}

@Composable
fun MyApp(taskDao: TaskDao) {
    val navController = rememberNavController()
    val filter = remember { mutableStateOf(FilterType.SHOW_UNCOMPLETED) }
    val selectedTask = remember { mutableIntStateOf(0) }

    NavHost(
        navController = navController,
        startDestination = AppScreen.Main.name
    ) {
        composable(AppScreen.Main.name) {
            HomeScreen(navController, filter, selectedTask, taskDao)
        }
        composable(AppScreen.Filter.name) {
            FilterScreen(navController, filter)
        }
        composable(AppScreen.NewTask.name) {
            NewTaskScreen(navController, taskDao)
        }
        composable(AppScreen.EditTask.name) {
            EditTaskScreen(navController, selectedTask, taskDao)
        }
    }
}


