package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
//    the onCreate function is the main function of the app and calls the other functions for the app ( this is the main like in kotlin)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { // this is to define the layout through composable functions
            // all functions marked with @composable can be called through
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

/*
Composable requirements:
    need the Composable annotation on top of function
    function name is capitalized
    it can not return anything

*/
@Composable // this is to tell the kotlin compiler that the function below is used by jetpack compose
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) { // came from alt+enter -> surround with widget -> sround with widget -> delete box and add widget
    //added color to the backGround
        Text(
            text = "Hello, my name is $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

// the function below is for previewing the function above without building the application.
// @Preview tells andriod to show the composable function in andriod design view
// showBackground adds a background to the output of the function
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Fucker")
    }
}