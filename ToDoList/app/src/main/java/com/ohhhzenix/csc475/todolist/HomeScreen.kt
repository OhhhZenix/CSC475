package com.ohhhzenix.csc475.todolist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.todolist.database.Task

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    tasks: MutableList<Task>,
    selectedTask: MutableState<Task?>,
    filter: MutableState<FilterType>
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("To Do List")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        navController.navigate(AppScreen.Filter.name)
                    },
                    modifier = Modifier.weight(0.5f)
                ) {
                    Text("Filter")
                }
                Spacer(modifier = Modifier.padding(8.dp))
                Button(
                    onClick = {
                        navController.navigate(AppScreen.NewTask.name)
                    },
                    modifier = Modifier.weight(0.5f)
                ) {
                    Text("Add new task")
                }
            }
            LazyColumn(content = {
                val filteredTask = when (filter.value) {
                    FilterType.SHOW_ALL -> tasks.sortedBy { it.completed }
                    FilterType.SHOW_COMPLETED -> tasks.filter { it.completed }
                    FilterType.SHOW_UNCOMPLETED -> tasks.filter { !it.completed }
                }

                items(filteredTask) { task: Task ->
                    Button(
                        onClick = {
                            selectedTask.value = task
                            navController.navigate(AppScreen.EditTask.name)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .height(80.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonColors(
                            containerColor = MaterialTheme.colorScheme.secondary,
                            contentColor = Color.White,
                            disabledContainerColor = MaterialTheme.colorScheme.secondary,
                            disabledContentColor = MaterialTheme.colorScheme.secondary
                        )
                    ) {
                        Row(
                            modifier = Modifier.background(color = MaterialTheme.colorScheme.secondary),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(
                                    id = if (task.completed)
                                        R.drawable.baseline_check_box_24
                                    else
                                        R.drawable.baseline_check_box_outline_blank_24
                                ),
                                contentDescription = "Delete",
                                tint = Color.White
                            )
                            Spacer(Modifier.padding(8.dp))
                            Text(
                                task.title,
                                color = Color.White,
                                modifier = Modifier.weight(1f),
                                style = TextStyle(
                                    textDecoration = if (task.completed)
                                        TextDecoration.LineThrough
                                    else
                                        TextDecoration.None
                                )
                            )
                        }
                    }
                }
            })
        }
    }
}

