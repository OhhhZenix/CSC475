package com.ohhhzenix.csc475.fitnesstracker.screen.catalog.food

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodCatalogScreen(navController: NavController) {
    val food = remember { mutableListOf<String>() }

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text("Food Catalog")
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
        )
    }) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Button(
                onClick = { navController.navigate(AppScreen.Home.name) },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Back")
            }
            Spacer(Modifier.padding(8.dp))
            Text(
                "Add your favorite food!",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
            )
            Button(
                onClick = { navController.navigate(AppScreen.AddFood.name) },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text("Add Food")
            }
            if (food.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "No food exists currently.", textAlign = TextAlign.Center
                        )
                        Text(
                            "Get started by adding one.", textAlign = TextAlign.Center
                        )
                    }
                }
            } else {
                Text(
                    "Currently available selection:", modifier = Modifier.padding(start = 8.dp)
                )
                LazyColumn {
                    items(food) {

                    }
                }
            }
        }
    }
}