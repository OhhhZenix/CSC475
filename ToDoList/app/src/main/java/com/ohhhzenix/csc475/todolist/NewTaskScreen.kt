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
import com.ohhhzenix.csc475.todolist.database.Task
import com.ohhhzenix.csc475.todolist.database.TaskDao
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewTaskScreen(
    navController: NavController,
    taskDao: TaskDao
) {
    val context = LocalContext.current
    val title = remember { mutableStateOf("") }
    val description = remember { mutableStateOf("") }
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("New Task")
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
                    "Fill the boxes below.",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(Modifier.padding(8.dp))
            OutlinedTextField(
                value = title.value,
                onValueChange = {
                    title.value = it
                },
                label = {
                    Text("Title")
                },
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = description.value,
                onValueChange = {
                    description.value = it
                },
                label = {
                    Text("Description")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp),
            )
            Spacer(Modifier.padding(8.dp))
            Button(
                onClick = {
                    if (title.value.isEmpty()) {
                        Toast.makeText(context, "Title is empty. Try again.", Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        coroutineScope.launch {
                            taskDao.upsertTask(
                                Task(
                                    title = title.value,
                                    description = description.value
                                )
                            )
                        }
                        navController.navigate(AppScreen.Main.name)
                    }
                },
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text("Add")
            }
            Button(
                onClick = {
                    navController.navigate(AppScreen.Main.name)
                },
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text("Back")
            }
        }
    }
}