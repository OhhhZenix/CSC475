package com.ohhhzenix.csc475.todolist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ohhhzenix.csc475.todolist.database.Task

@Composable
fun EditTaskScreen(viewModel: TaskViewModel, task: Task) {
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        Button(
            onClick = {}
        ) {
            Text("Back")
        }
        Spacer(Modifier.padding(30.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Edit Task",
                    color = Color.White,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    "(Currently selected id: ${task.id})",
                    color = Color.LightGray,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
        Spacer(Modifier.padding(8.dp))
        OutlinedTextField(
            value = task.title,
            onValueChange = {},
            label = {
                Text("Title")
            },
            modifier = Modifier.fillMaxWidth(),
        )
        OutlinedTextField(
            value = task.description,
            onValueChange = {},
            label = {
                Text("Description")
            },
            modifier = Modifier.fillMaxWidth(),
        )
        Spacer(Modifier.padding(4.dp))
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(if (task.completed) "Unmark as completed" else "Mark as completed")
        }
        Button(
            onClick = {
                viewModel.deleteTask(task.id)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Delete task")
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save task")
        }
    }
}