package com.example.cravebalance.screens

import androidx.compose.foundation.Image
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

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration

import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cravebalance.R

import androidx.compose.runtime.getValue
import com.example.cravebalance.viewmodel.RecipeViewModel

@Composable
fun RecipeDetailScreen(
    recipeTitle: String,
    navController: NavController,
    viewModel: RecipeViewModel
) {

    val recipes by viewModel.recipes.collectAsState()

    LaunchedEffect(recipeTitle) {
        viewModel.loadRecipeByTitle(recipeTitle)
    }

    val recipe = recipes.find {
        it.title == recipeTitle
    }

    val ingredientsList = recipe?.ingredients?.split("\n") ?: emptyList()
    val stepsList = recipe?.steps?.split("\n") ?: emptyList()

    var showPreparation by remember {
        mutableStateOf(false)
    }

    var currentStep by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7F2))
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

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

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(
                    id = recipe?.imageRes
                        ?: R.drawable.smoothiechocolate
                ),

                contentDescription = null,

                modifier = Modifier
                    .size(220.dp)
                    .clip(RoundedCornerShape(24.dp)),

                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = recipe?.title ?: "",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF9A5B2B)
        )

        Spacer(modifier = Modifier.height(22.dp))

        Text(
            text = "Ingredientes",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF9800)
        )

        Spacer(modifier = Modifier.height(14.dp))

        ingredientsList.forEach { ingredient ->
            var checked by remember {
                mutableStateOf(false)
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .clickable {
                        checked = !checked
                    },

                colors = CardDefaults.cardColors(
                    containerColor =
                        if (checked)
                            Color(0xFFE8F5E9)
                        else
                            Color.White
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
                        text =
                            if (checked) "✔"
                            else "✨",
                        fontSize = 18.sp
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = ingredient,
                        color =
                            if (checked)
                                Color.Gray
                            else
                                Color(0xFF6A6A6A),

                        fontSize = 15.sp,
                        textDecoration =
                            if (checked)
                                TextDecoration.LineThrough
                            else
                                TextDecoration.None
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(22.dp))

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
                    Image(
                        painter = painterResource(
                            id = R.drawable.cocinar
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text =
                        if (showPreparation)
                            stepsList.getOrNull(currentStep) ?: ""
                        else
                            "Toca el personaje para comenzar",

                    textAlign = TextAlign.Center,
                    color = Color(0xFF6A6A6A),
                    lineHeight = 20.sp
                )

                Spacer(modifier = Modifier.height(12.dp))

                if (showPreparation) {
                    Text(
                        text =
                            "Paso ${currentStep + 1} de ${stepsList.size}",
                        color = Color(0xFFFF9800),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(26.dp))

        if (!showPreparation) {
            Button(
                onClick = {
                    showPreparation = true
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
                    text = "COMENZAR",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }

        } else {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        if (currentStep > 0) {
                            currentStep--
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFB74D)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = "← Anterior",
                        color = Color.White
                    )
                }

                Button(
                    onClick = {
                        if (currentStep < stepsList.size - 1) {
                            currentStep++
                        }
                    },

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFCBE39D)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = "Siguiente →",
                        color = Color.White
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecipeDetailScreen() {
    MaterialTheme {
        Text(
            text = "Preview no disponible con ViewModel",
            modifier = Modifier.padding(20.dp)
        )
    }
}