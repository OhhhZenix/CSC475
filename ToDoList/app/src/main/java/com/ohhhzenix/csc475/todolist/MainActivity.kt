package com.ohhhzenix.csc475.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.ohhhzenix.csc475.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        val taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]
        setContent {
            ToDoListTheme {
                Surface(
                    modifier = Modifier.fillMaxHeight()
                ) {
                    MainScreen(taskViewModel)
                }
            }
        }
    }
}
