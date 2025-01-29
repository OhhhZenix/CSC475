package com.ohhhzenix.csc475.fitnesstracker.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodCatalogScreen(navController: NavController) {
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
                onClick = {},
                modifier = Modifier.padding(8.dp).fillMaxWidth()
            ) {
                Text("Add Food")
            }
        }
    }
}