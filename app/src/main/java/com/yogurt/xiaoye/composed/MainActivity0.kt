package com.yogurt.xiaoye.composed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlin.*

class MainActivity0 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Yogurt")
            /*ComposedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }*/
        }
    }
    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello,$name!")
    }

    @Preview//预览
    @Composable
    fun yulanMessageCard() {
        MessageCard(name = "Yulan")
    }
}

/*预览效果*//*

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposedTheme {
        Greeting("Android")
    }
}*/
