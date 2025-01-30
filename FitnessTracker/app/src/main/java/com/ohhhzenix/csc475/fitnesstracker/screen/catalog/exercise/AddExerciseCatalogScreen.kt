package com.ohhhzenix.csc475.fitnesstracker.screen.catalog.exercise

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.exercise.ExerciseCatalog
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.exercise.ExerciseCatalogDao
import com.ohhhzenix.csc475.fitnesstracker.isDouble
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddExerciseCatalogScreen(
    navController: NavController,
    exerciseCatalogDao: ExerciseCatalogDao
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val name = remember { mutableStateOf("") }
    val calories = remember { mutableStateOf("") }

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text("New Exercise")
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
            Spacer(Modifier.padding(4.dp))
            OutlinedTextField(
                value = name.value,
                onValueChange = { name.value = it },
                label = {
                    Text("Name")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            )
            OutlinedTextField(
                value = calories.value,
                onValueChange = {
                    if (isDouble(it)) {
                        calories.value = it
                    }
                },
                label = {
                    Text("Calories")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
            Spacer(Modifier.padding(4.dp))
            Button(
                onClick = {
                    if (name.value.isEmpty()) {
                        Toast.makeText(context, "Name is empty. Try again.", Toast.LENGTH_SHORT)
                            .show()
                    } else if (calories.value.toDouble() <= 0.0) {
                        Toast.makeText(
                            context,
                            "Calories must be greater than zero. Try again.",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    } else {
                        coroutineScope.launch {
                            exerciseCatalogDao.addExercise(
                                ExerciseCatalog(
                                    name = name.value,
                                    calories = calories.value.toDouble()
                                )
                            )
                        }
                        navController.navigate(AppScreen.ExerciseCatalog.name)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Add")
            }
            Button(
                onClick = { navController.navigate(AppScreen.ExerciseCatalog.name) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Text("Back")
            }
        }
    }
}