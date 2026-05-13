package com.example.cravebalance.ui.element

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

import androidx.compose.material3.*

import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CravingDetailScreen(
    craving: String,
    navController: NavController
) {

    var showMessage by remember {
        mutableStateOf(false)
    }

    // DATOS SEGUN EL ANTOJO
    val emoji = when (craving) {

        "Chocolate" -> "🍫"
        "Sal" -> "🧂"
        "Azúcar" -> "🍬"
        "Leche" -> "🥛"
        "Pan" -> "🥐"
        "Hielo" -> "🧊"

        else -> "🍽️"
    }

    val explanation = when (craving) {

        "Chocolate" ->
            "El antojo de chocolate proviene principalmente de una combinación de deficiencias nutricionales, emociones y búsqueda de placer."

        "Sal" ->
            "Los antojos salados pueden aparecer por estrés, cansancio o deshidratación."

        "Azúcar" ->
            "El cuerpo suele pedir azúcar cuando necesita energía rápida o existe fatiga."

        "Leche" ->
            "Los antojos de leche pueden relacionarse con necesidad de calcio o comodidad emocional."

        "Pan" ->
            "El pan suele generar sensación de satisfacción y energía inmediata."

        "Hielo" ->
            "Masticar hielo puede relacionarse con ansiedad o incluso deficiencia de hierro."

        else ->
            "Cada antojo puede tener causas físicas y emocionales."
    }

    val recipes = listOf(
        "🥣",
        "🍰",
        "🍓",
        "🍪"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7F2))
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

        // BOTON VOLVER
        Box(
            modifier = Modifier
                .size(42.dp)
                .clip(CircleShape)
                .background(Color(0xFFCBE39D))
                .clickable {

                    navController.popBackStack()
                },
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        // IMAGEN GRANDE
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = emoji,
                fontSize = 120.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        // TITULO
        Text(
            text = craving.uppercase(),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF9A5B2B)
        )

        Spacer(modifier = Modifier.height(18.dp))

        // CARD EXPLICACION
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF4F4F4)
            )
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                // TEXTO
                AnimatedVisibility(
                    visible = showMessage
                ) {

                    Text(
                        text = explanation,
                        modifier = Modifier.weight(1f),
                        fontSize = 13.sp,
                        color = Color(0xFF6A6A6A),
                        lineHeight = 18.sp
                    )
                }

                if (!showMessage) {

                    Text(
                        text = "Toca al personaje para aprender",
                        modifier = Modifier.weight(1f),
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                // PERSONAJE
                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .clickable {

                            showMessage = !showMessage
                        },
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "👧",
                        fontSize = 60.sp
                    )

                    // PLAY BUTTON
                    Box(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(
                                Color.Black.copy(alpha = 0.7f)
                            ),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            text = "▶",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // TITULO RECETAS
        Text(
            text = "Pruebalas todas",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF9800),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        // GRID RECETAS
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.height(500.dp)
        ) {

            items(recipes) { recipe ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        // IMAGEN
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp)
                                .clip(RoundedCornerShape(14.dp))
                                .background(Color(0xFFF7F0D8)),
                            contentAlignment = Alignment.Center
                        ) {

                            Text(
                                text = recipe,
                                fontSize = 38.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        // TITULO
                        Text(
                            text = "Yogur con Cacao",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFF9800),
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // TAGS
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {

                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color(0xFFFFA726))
                                    .padding(
                                        horizontal = 8.dp,
                                        vertical = 3.dp
                                    )
                            ) {

                                Text(
                                    text = "Cacao",
                                    color = Color.White,
                                    fontSize = 9.sp
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color(0xFFFFA726))
                                    .padding(
                                        horizontal = 8.dp,
                                        vertical = 3.dp
                                    )
                            ) {

                                Text(
                                    text = "Yogurt",
                                    color = Color.White,
                                    fontSize = 9.sp
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        // TIEMPO
                        Text(
                            text = "Tiempo: 5 minutos",
                            fontSize = 10.sp,
                            color = Color(0xFFFF9800),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCravingDetailScreen() {

    MaterialTheme {

        Surface {

            CravingDetailScreen(
                craving = "Chocolate",
                navController = rememberNavController()
            )
        }
    }
}