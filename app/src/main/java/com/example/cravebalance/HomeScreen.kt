package com.example.cravebalance


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class CravingItem(
    val title: String,
    val emoji: String
)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {

    val cravings = listOf(
        CravingItem("Chocolate", "🍫"),
        CravingItem("Sal", "🧂"),
        CravingItem("Azúcar", "🍬"),
        CravingItem("Leche", "🥛"),
        CravingItem("Pan", "🥐"),
        CravingItem("Hielo", "🧊")
    )

    val recipes = listOf(
        "🍕",
        "🥪",
        "🍰"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7F2))
            .verticalScroll(rememberScrollState())
    ) {

        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .clip(
                    RoundedCornerShape(
                        bottomStart = 28.dp,
                        bottomEnd = 28.dp
                    )
                )
                .background(Color(0xFFCBE39D))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "BIENVENIDO",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFFA5C86D)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.padding(horizontal = 18.dp)
        ) {

            Text(
                text = "¿De donde vienen nuestros antojos?",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFB7D97D),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF1F6E6)
                ),
                shape = RoundedCornerShape(18.dp),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "←",
                        fontSize = 26.sp,
                        color = Color(0xFFFFB347)
                    )

                    Text(
                        text = "Los antojos vienen principalmente de una compleja interacción entre el cerebro, las hormonas y las emociones, más que de una necesidad real de comida en el estómago.",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp,
                        color = Color(0xFF6A6A6A),
                        lineHeight = 20.sp
                    )

                    Text(
                        text = "→",
                        fontSize = 26.sp,
                        color = Color(0xFFFFB347)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Tengo antojo de...",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFFFB347)
            )

            Spacer(modifier = Modifier.height(14.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.height(220.dp)
            ) {

                items(cravings) { item ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { },
                        shape = RoundedCornerShape(18.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        elevation = CardDefaults.cardElevation(1.dp)
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState())
                                .padding(
                                    horizontal = 14.dp,
                                    vertical = 14.dp
                                ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            Text(
                                text = item.emoji,
                                fontSize = 28.sp
                            )

                            Text(
                                text = item.title,
                                color = Color(0xFFFFA552),
                                fontWeight = FontWeight.Medium,
                                fontSize = 16.sp
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "Recetas que podrían gustarte",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFA5C86D)
            )

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                recipes.forEach { recipe ->

                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .horizontalScroll(rememberScrollState())
                            .height(220.dp),
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

                            // Imagen o emoji
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(90.dp)
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(Color(0xFFF7F0D8)),
                                contentAlignment = Alignment.Center
                            ) {

                                Text(
                                    text = recipe,
                                    fontSize = 40.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            // Titulo receta
                            Text(
                                text = "Nada",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFFF9800),
                                textAlign = TextAlign.Center
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            // Etiquetas
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {

                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0xFFFFA726))
                                        .padding(
                                            horizontal = 10.dp,
                                            vertical = 4.dp
                                        )
                                ) {

                                    Text(
                                        text = "Cacao",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0xFFFFA726))
                                        .padding(
                                            horizontal = 10.dp,
                                            vertical = 4.dp
                                        )
                                ) {

                                    Text(
                                        text = "Yogurt",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            // Tiempo
                            Text(
                                text = "Tiempo: 5 minutos",
                                fontSize = 11.sp,
                                color = Color(0xFFFF9800),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .height(130.dp),
                    contentAlignment = Alignment.Center
                ) {

                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null,
                        tint = Color(0xFFFFB347),
                        modifier = Modifier.size(28.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHomeScreen() {

    MaterialTheme {

        Surface {
            HomeScreen()
        }
    }
}
