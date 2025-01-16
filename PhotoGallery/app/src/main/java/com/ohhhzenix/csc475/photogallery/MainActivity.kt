package com.ohhhzenix.csc475.photogallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ohhhzenix.csc475.photogallery.ui.theme.PhotoGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhotoGalleryTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreen.Home.name
    ) {
        composable(AppScreen.Home.name) {
            HomeScreen(
                navStorageScreen = {
                    navController.navigate(AppScreen.Storage.name)
                },
                navInternetScreen = {
                    navController.navigate(AppScreen.Internet.name)
                }
            )
        }
        composable(AppScreen.Storage.name) {
            StorageScreen(
                navHomeScreen = {
                    navController.navigate(AppScreen.Home.name)
                }
            )
        }
        composable(AppScreen.Internet.name) {
            InternetScreen(
                navHomeScreen = {
                    navController.navigate(AppScreen.Home.name)
                }
            )
        }
    }
}