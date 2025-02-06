package com.ohhhzenix.csc475.fitnesstracker

import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.compose.rememberNavController
import com.ohhhzenix.csc475.fitnesstracker.screen.HomeScreen
import org.junit.Rule
import org.junit.Test

class FeaturesTest {

    @get:Rule
    val rule = createComposeRule()

    private val calculateButton = hasText("Calculate Goals") and hasClickAction()
    private val mealLogButton = hasText("Meal Log") and hasClickAction()
    private val exerciseLogButton = hasText("Exercise Log") and hasClickAction()
    private val foodCatalogButton = hasText("Food Catalog") and hasClickAction()
    private val exerciseCatalogButton = hasText("Exercise Catalog") and hasClickAction()

    @Test
    fun testFeaturesExists() {
        rule.setContent { HomeScreen(navController = rememberNavController()) }
        rule.onNode(calculateButton).assertExists()
        rule.onNode(mealLogButton).assertExists()
        rule.onNode(exerciseLogButton).assertExists()
        rule.onNode(foodCatalogButton).assertExists()
        rule.onNode(exerciseCatalogButton).assertExists()
    }
}