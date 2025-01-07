package com.ohhhzenix.csc475.todolist

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.todolist.database.TaskDao
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditTaskScreen(
    navController: NavController,
    selectedTask: MutableIntState,
    taskDao: TaskDao
) {
    val context = LocalContext.current
    val taskId = selectedTask.intValue
    val tempTitle = remember { mutableStateOf("") }
    val tempDescription = remember { mutableStateOf("") }
    val tempCompleted = remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            val task = taskDao.getTask(taskId)
            tempTitle.value = task.title
            tempDescription.value = task.description
            tempCompleted.value = task.completed
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Edit Task")
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
                .padding(8.dp)
        ) {
            Spacer(Modifier.padding(8.dp))
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "(Selected Task ID: ${selectedTask.intValue})",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(Modifier.padding(8.dp))
            OutlinedTextField(
                value = tempTitle.value,
                onValueChange = {
                    tempTitle.value = it
                },
                label = {
                    Text("Title")
                },
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = tempDescription.value,
                onValueChange = {
                    tempDescription.value = it
                },
                label = {
                    Text("Description")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp),
            )
            Spacer(Modifier.padding(4.dp))
            Button(
                onClick = {
                    tempCompleted.value = !tempCompleted.value
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(if (tempCompleted.value) "Unmark as completed" else "Mark as completed")
            }
            Button(
                onClick = {
                    coroutineScope.launch {
                        taskDao.deleteTask(taskId)
                    }
                    navController.navigate(AppScreen.Main.name)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Delete task")
            }
            Button(
                onClick = {
                    if (tempTitle.value.isEmpty()) {
                        Toast.makeText(context, "Title is empty. Try again.", Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        coroutineScope.launch {
                            taskDao.updateTask(
                                taskId,
                                tempTitle.value,
                                tempDescription.value,
                                tempCompleted.value
                            )
                        }
                        navController.navigate(AppScreen.Main.name)
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Save task")
            }
            Button(
                onClick = {
                    navController.navigate(AppScreen.Main.name)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Back")
            }
        }
    }
}