package com.ohhhzenix.csc475.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.ohhhzenix.csc475.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoListTheme {
                Surface(
                    modifier = Modifier.fillMaxHeight()
                ) {
                    MainScreen()
                }
            }
        }
    }
}
