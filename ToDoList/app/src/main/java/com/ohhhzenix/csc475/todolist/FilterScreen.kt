package com.ohhhzenix.csc475.todolist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterScreen(navController: NavController, filter: FilterType) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Filtering Option")
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
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text("Current: " + FilterType.SHOW_UNCOMPLETED.name)
            }
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Show All")
            }
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Show Completed Only")
            }
            Button(
                onClick = {
                    
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Show Uncompleted Only")
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