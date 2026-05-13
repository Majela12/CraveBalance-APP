package com.example.cravebalance

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

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

@Composable
fun RecipeDetailScreen(

    recipeTitle: String,

    navController: NavController
) {

    val recipe = recipes.find {

        it.title == recipeTitle
    }

    var showPreparation by remember {

        mutableStateOf(false)
    }

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

        Spacer(modifier = Modifier.height(18.dp))

        // EMOJI
        Box(
            modifier = Modifier
                .fillMaxWidth(),

            contentAlignment = Alignment.Center
        ) {

            Text(
                text = recipe?.emoji ?: "🍽️",
                fontSize = 110.sp
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // TITULO
        Text(
            text = recipe?.title ?: "",

            modifier = Modifier.fillMaxWidth(),

            textAlign = TextAlign.Center,

            fontSize = 28.sp,

            fontWeight = FontWeight.ExtraBold,

            color = Color(0xFF9A5B2B)
        )

        Spacer(modifier = Modifier.height(22.dp))

        // INGREDIENTES
        Text(
            text = "Ingredientes",

            fontSize = 22.sp,

            fontWeight = FontWeight.Bold,

            color = Color(0xFFFF9800)
        )

        Spacer(modifier = Modifier.height(14.dp))

        recipe?.ingredients?.forEach { ingredient ->

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),

                shape = RoundedCornerShape(14.dp)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),

                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "✨",
                        fontSize = 18.sp
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = ingredient,

                        color = Color(0xFF6A6A6A),

                        fontSize = 15.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(22.dp))

        // PERSONAJE
        Card(
            modifier = Modifier.fillMaxWidth(),

            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF4F4F4)
            ),

            shape = RoundedCornerShape(18.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp),

                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .clickable {

                            showPreparation =
                                !showPreparation
                        },

                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "👩",
                        fontSize = 60.sp
                    )

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
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text =
                        if (showPreparation)
                            recipe?.preparation ?: ""
                        else
                            "Toca el personaje para comenzar",

                    textAlign = TextAlign.Center,

                    color = Color(0xFF6A6A6A),

                    lineHeight = 20.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(26.dp))

        // BOTON
        Button(
            onClick = {

            },

            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFCBE39D)
            ),

            shape = RoundedCornerShape(18.dp)
        ) {

            Text(
                text = "LISTO",

                color = Color.White,

                fontWeight = FontWeight.Bold,

                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewRecipeDetailScreen() {

    MaterialTheme {

        Surface {

            RecipeDetailScreen(
                recipeTitle = "Smoothie de chocolate",
                navController = rememberNavController()
            )
        }
    }
}