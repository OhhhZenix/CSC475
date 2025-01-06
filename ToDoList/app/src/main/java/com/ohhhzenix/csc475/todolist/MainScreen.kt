package com.ohhhzenix.csc475.todolist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ohhhzenix.csc475.todolist.database.Task

val fakeTasks = listOf(
    Task(1, "Hello", ""),
    Task(2, "World", ""),
    Task(3, "Android", "")
)

@Composable
fun ToDoItem(task: Task) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = MaterialTheme.colorScheme.secondary)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(task.title, color = Color.White, modifier = Modifier.weight(1f))
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_check_box_24),
                contentDescription = "Complete",
                tint = Color.White
            )
        }
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_delete_24),
                contentDescription = "Delete",
                tint = Color.White
            )
        }
    }
}


@Preview
@Composable
fun MainScreen() {
    Column() {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Button(onClick = {}, modifier = Modifier.weight(0.5f)) {
                Text("Filter")
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Button(onClick = {}, modifier = Modifier.weight(0.5f)) {
                Text("Add new task")
            }
        }
        LazyColumn(content = {
            itemsIndexed(fakeTasks) { index: Int, item: Task ->
                ToDoItem(task = item)
            }
        })
    }
}

