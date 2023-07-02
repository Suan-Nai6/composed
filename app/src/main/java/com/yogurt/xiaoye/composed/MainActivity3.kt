package com.yogurt.xiaoye.composed

import android.os.Bundle
import androidx.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yogurt.xiaoye.composed.ui.theme.ComposedTheme
import kotlin.*
import kotlin.math.*

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposedTheme {
                MessageCard(Message("Yogurt","Xiaoye"))
            }
        }
    }
    @Composable
    fun MessageCard(msg:Message) {
        Row(
            modifier = Modifier
                .padding(all = 8.dp)
                .background(MaterialTheme.colorScheme.background)
            ){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,//talkback读出的内容
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Column {
                Text(text = msg.author)
                Spacer(modifier = Modifier.height(8.dp))
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
