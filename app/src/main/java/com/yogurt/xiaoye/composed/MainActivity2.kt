package com.yogurt.xiaoye.composed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.yogurt.xiaoye.composed.ui.theme.ComposedTheme
import kotlin.*
import kotlin.math.*

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Yogurt","Xiaoye"))
        }
    }
    @Composable
    fun MessageCard(msg:Message) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null//talkback读出的内容
            )
            Column {
                Text(text = msg.author)
                Text(text = msg.body)
            }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MessageCard(Message("Yogurt","Xiaoye"))
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
