package com.example.examenrecuperaciondennis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.examenrecuperaciondennis.ui.theme.ExamenRecuperacionDennisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenRecuperacionDennisTheme {
                Greeting()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(
            modifier = Modifier
                .background(Color.Black)
                .height(100.dp)
                .width(320.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .background(Color.Red),
                textAlign = TextAlign.Center,
                text = "Hola Android!"
            )

            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .height(100.dp)
                    .width(320.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center


            ) {
                Text(
                    modifier = Modifier
                        .background(Color.Cyan),
                    text = "Hola Android!"
                )
            }
        }
        Column(
            modifier = Modifier
                .background(Color.Gray)
                .height(200.dp)
                .width(320.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .background(Color.Yellow),
                textAlign = TextAlign.Center,
                text = "Hello Android!"
            )
            Text(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
                    .background(Color.Red),
                textAlign = TextAlign.Center,
                text = "Hello Android!"
            )
            Text(
                modifier = Modifier
                    .width(150.dp)
                    .background(Color.White),
                textAlign = TextAlign.Center,
                text = "Hello Android!"
            )
        }

        //-------------------------------------
        Column(
            modifier = Modifier
                .background(Color.Green)
                .height(180.dp)
                .width(320.dp),
            horizontalAlignment = Alignment.End,

            ) {
            Row(
                modifier = Modifier
                    .background(Color.Blue),

                ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("1")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("2")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("3")
                }
            }
            Row(
                modifier = Modifier
                    .background(Color.Yellow)
                    .width(250.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("1")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("2")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("3")
                }
            }
            Row(
                modifier = Modifier
                    .background(Color.White),

                ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("1")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("2")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text("3")
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .height(150.dp)
                    .width(160.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ) { }
        }

    }
}
