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
import androidx.compose.material.Text
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
            .fillMaxSize()
            .border(2.dp, color = Color.Black)
    ) {
        Box(
            modifier = Modifier
                .padding(top = 4.dp, start = 4.dp, end = 4.dp, bottom = 5.dp)
                .background(color = Color(0xFF1F5520))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "IMSS Digital",
                    modifier = Modifier
                        .padding(top = 10.dp, start = 20.dp)
                        .align(Alignment.TopStart),
                    fontSize = 30.sp,
                    color = Color.White,
                    fontWeight = FontWeight(900)

                    )
                Text(
                    text = "Bienvenido",
                    modifier = Modifier
                        .padding(top = 52.dp, bottom = 10.dp, start = 20.dp)
                        .align(Alignment.BottomStart),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(300),
                    color = Color.White
                )

                Text(
                    text = "Consulta",
                    modifier = Modifier
                        .padding(top = 10.dp, end = 25.dp)
                        .align(Alignment.TopEnd),
                    fontSize = 21.sp,
                    fontWeight = FontWeight(300),
                    color = Color.White
                    )
                Text(
                    text = "NSS",
                    modifier = Modifier
                        .width(80.dp)
                        .padding(top = 40.dp, end = 30.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterEnd)
                        .background(Color.White),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(900),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }
        }
        Column(
            modifier = Modifier
                .paddingFromBaseline(top = 205.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 10.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {

                        Image(
                            painter = painterResource(id = R.drawable.pulmones),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp)
                        )

                        Text(
                            text = "Modulo Atencion Respiratoria (MARSS)",
                            modifier = Modifier
                                .width(180.dp)
                                .height(75.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.covid),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Permiso COVID 4.0",
                            modifier = Modifier
                                .width(180.dp)
                                .height(75.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 100.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.calendario),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Cita medica familiar",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.corazon),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp),
                        )
                        Text(
                            text = "CHKT en linea",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 100.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.informe),
                            contentDescription = "ima1",
                            modifier = Modifier.size(70.dp)
                        )
                        Text(
                            text = "Vigencia de derechos",
                            modifier = Modifier
                                .width(180.dp)
                                .height(60.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.localizacion),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Alta o cambio de clinica",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 100.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ayuda),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Informate de tu familiar",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card (
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.licencia),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Licencia 140 Bis",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Spacer(
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth()
                    ,
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cas),
                        contentDescription = "ima1",
                        modifier = Modifier.size(80.dp)
                            .align(Alignment.CenterStart)
                            .padding(start = 40.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.localization),
                        contentDescription = "ima1",
                        modifier = Modifier.size(45.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.calendary),
                        contentDescription = "ima1",
                        modifier = Modifier.size(85.dp)
                            .align(Alignment.CenterEnd)
                            .padding(end = 40.dp)
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