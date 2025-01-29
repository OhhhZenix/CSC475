package com.ohhhzenix.csc475.fitnesstracker.screen.catalog.exercise

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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ohhhzenix.csc475.fitnesstracker.AppScreen
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.exercise.ExerciseCatalog
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.exercise.ExerciseCatalogDao
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExerciseCatalogScreen(
    navController: NavController,
    exerciseCatalogDao: ExerciseCatalogDao,
    selectedExerciseCatalog: MutableIntState
) {
    val coroutineScope = rememberCoroutineScope()
    val exercises = remember { mutableStateListOf<ExerciseCatalog>() }

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            exercises.addAll(exerciseCatalogDao.getAllExercise())
        }
    }

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text("Exercise Catalog")
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
                "Add your favorite exercise!",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
            )
            Button(
                onClick = { navController.navigate(AppScreen.AddExercise.name) },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text("Add Exercise")
            }
            if (exercises.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "No exercise exists currently.", textAlign = TextAlign.Center
                        )
                        Text(
                            "Get started by adding one.", textAlign = TextAlign.Center
                        )
                    }
                }
            } else {
                Text(
                    "Current catalog:", modifier = Modifier.padding(start = 8.dp)
                )
                Spacer(Modifier.padding(4.dp))
                LazyColumn {
                    items(exercises.sortedBy { it.name }) {
                        Button(
                            onClick = {
                                selectedExerciseCatalog.intValue = it.id
                                navController.navigate(AppScreen.EditExercise.name)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    it.name,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    "${it.calories} Calories",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}