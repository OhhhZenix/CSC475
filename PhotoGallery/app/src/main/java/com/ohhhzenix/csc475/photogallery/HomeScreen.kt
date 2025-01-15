package com.ohhhzenix.csc475.photogallery

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navStorageScreen: () -> Unit,
    navInternetScreen: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Photo Gallery")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
            )
        }
    ) { innerPadding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            val screenHeight = LocalConfiguration.current.screenHeightDp.dp
            val offsetY = screenHeight * 0.25f

            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.TopCenter)
                    .offset(y = offsetY),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    "Welcome!",
                    style = TextStyle(
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center
                    )
                )
                Text(
                    "To get started, select the options below.",
                    style = TextStyle(
                        textAlign = TextAlign.Center
                    )
                )
                Spacer(Modifier.padding(8.dp))
                Button(
                    onClick = navStorageScreen,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("View from storage")
                }
                Button(
                    onClick = navInternetScreen,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("View from internet")
                }
            }
        }
    }
}