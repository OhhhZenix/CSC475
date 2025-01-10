package com.ohhhzenix.csc475.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ohhhzenix.csc475.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    var name by remember { mutableStateOf("") }
    var color by remember { mutableStateOf("") }
    var food by remember { mutableStateOf("") }
    var greeted by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (!greeted) {
            Text("Hello there!")

            OutlinedTextField(
                value = name,
                onValueChange = {
                    name = it
                },
                label = {
                    Text("What is your name?")
                }
            )

            OutlinedTextField(
                value = color,
                onValueChange = {
                    color = it
                },
                label = {
                    Text("What is your favorite color?")
                }
            )

            OutlinedTextField(
                value = food,
                onValueChange = {
                    food = it
                },
                label = {
                    Text("What is your favorite food?")
                }
            )

            Spacer(Modifier.padding(16.dp))

            Button(
                onClick = {
                    greeted = name.isNotEmpty() && color.isNotEmpty() && food.isNotEmpty()
                },
                enabled = name.isNotEmpty() && color.isNotEmpty() && food.isNotEmpty()
            ) {
                Text("Greet")
            }
        } else {
            Text("Nice to meet you, $name! My name is Gideon.")

            if (color.equals("red", true)) {
                Text("My favorite color is red as well!")
            } else {
                Text("Your favorite color is $color, mine is red.")
            }

            if (food.equals("fried chicken", true)) {
                Text("It is awesome that we both like fried chicken!")
            } else {
                Text("Your favorite food is $food, mine is fried chicken.")
            }

            Spacer(Modifier.padding(16.dp))

            Button(
                onClick = {
                    greeted = false
                }
            ) {
                Text("Greet again")
            }
        }
    }
}
