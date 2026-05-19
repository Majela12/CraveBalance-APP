package com.example.cravebalance.screens

import androidx.compose.foundation.Image
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

import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController

import com.example.cravebalance.viewmodel.RecipeViewModel

import com.example.cravebalance.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CravingDetailScreen(

    craving: String,
    navController: NavController,
    viewModel: RecipeViewModel

) {

    var showMessage by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(craving) {

        viewModel.loadRecipesByCraving(craving)
    }

    val filteredRecipes by viewModel.recipes.collectAsState()

    // EMOJI PRINCIPAL
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
            "La carencia de ciertos minerales en el cuerpo, principalmente el magnesio, suele manifestarse en forma de antojo de chocolate."

        "Sal" ->
            "Cuando el cuerpo pide sal, generalmente indica una necesidad urgente de sodio."

        "Azúcar" ->
            "Los antojos de azúcar pueden ser causados por niveles bajos de azúcar."

        "Leche" ->
            "La leche es fuente de calcio, proteínas y vitamina D."

        "Pan" ->
            "El cuerpo podría estar pidiendo magnesio y triptófano."

        "Hielo" ->
            "Puede estar relacionado con deficiencias nutricionales."

        else ->
            "Cada antojo puede tener causas físicas y emocionales."
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

        Spacer(modifier = Modifier.height(10.dp))

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

        Text(
            text = craving.uppercase(),

            modifier = Modifier.fillMaxWidth(),

            textAlign = TextAlign.Center,

            fontSize = 30.sp,

            fontWeight = FontWeight.ExtraBold,

            color = Color(0xFF9A5B2B)
        )

        Spacer(modifier = Modifier.height(18.dp))

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

                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text =
                        if (showMessage)
                            explanation
                        else
                            "Toca el personaje para aprender de donde viene este antojo",

                    modifier = Modifier.weight(1f),

                    fontSize = 13.sp,

                    color = Color.Gray
                )

                Spacer(modifier = Modifier.width(12.dp))

                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .clickable {

                            showMessage = !showMessage
                        },

                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(
                            id = R.drawable.pensar
                        ),

                        contentDescription = null,

                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape),

                        contentScale = ContentScale.Crop
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Podría gustarte",

            fontSize = 22.sp,

            fontWeight = FontWeight.Bold,

            color = Color(0xFFFF9800),

            modifier = Modifier.fillMaxWidth(),

            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),

            horizontalArrangement = Arrangement.spacedBy(12.dp),

            verticalArrangement = Arrangement.spacedBy(12.dp),

            modifier = Modifier.height(500.dp)
        ) {

            items(filteredRecipes) { recipe ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(270.dp)
                        .clickable {

                            navController.navigate(
                                "recipe/${recipe.title}"
                            )
                        },

                    shape = RoundedCornerShape(18.dp),

                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp),

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween

                    ) {

                        Image(
                            painter = painterResource(
                                id = recipe.imageRes
                            ),

                            contentDescription = null,

                            modifier = Modifier
                                .fillMaxWidth()
                                .height(90.dp)
                                .clip(RoundedCornerShape(14.dp)),

                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = recipe.title,

                            fontSize = 13.sp,

                            fontWeight = FontWeight.Bold,

                            color = Color(0xFFFF9800),

                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Tiempo: ${recipe.duration}",

                            fontSize = 10.sp,

                            color = Color(0xFFFF9800)
                        )
                    }
                }
            }
        }
    }
}