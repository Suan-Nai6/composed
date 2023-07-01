package com.yogurt.xiaoye.composed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yogurt.xiaoye.composed.ui.theme.ComposedTheme
import kotlin.*
import kotlin.math.*

class MainActivity : ComponentActivity() {
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
        Text(text = "Hello $name !")
    }

    @Preview//预览
    @Composable
    fun yulanMessageCard() {
        MessageCard(name = "Yulan")
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var a: Int = 10
    a *= 10
    println("a = $a")

    fun largerNumber(num1: Int, num2: Int): Int {
        return max(num1, num2)
    }

    val suannai: Int = 22
    val xiaoye: Int = 15
    val delta: Int = largerNumber(suannai, xiaoye)

    if (suannai > xiaoye) {
        println("酸奶比小夜大，酸奶的年龄为：$delta")
    } else {
        println("小夜比酸奶大，小夜的年龄为：$delta")
    }
    Text(
        text = "Hello $name!现在酸奶已经{$suannai}岁了",
        modifier = modifier
    )
}

@Composable
fun MessageCard(msg: Message) {
    Column() {this

    }
}
*/
/*预览效果*//*

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposedTheme {
        Greeting("Android")
    }
}*/
