package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Component()
        }
    }
}

@Composable
fun Component() {
    Box(
        modifier = Modifier
            .fillMaxSize()  //ocupa todo el entorno de prewivi
            .padding(all = 5.dp) //una reduccion
            .background(Color.Black)
    ){
        Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Spacer(
                modifier = Modifier.padding(top = 10.dp)
            )
            Card(
                elevation = 8.dp,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .width(350.dp)
                    .height(150.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Icon(
                        imageVector = Icons.Outlined.KeyboardArrowLeft,
                        contentDescription = "ada",
                        modifier = Modifier.size(50.dp)
                    )
                    Icon(
                        imageVector = Icons.Outlined.List,
                        contentDescription = "ada",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Box {
                    Text(
                        "5555-6666-7777-6534",
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                            .border(1.dp, Color.Black)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Component()
}