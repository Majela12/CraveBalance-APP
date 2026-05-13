package com.example.cravebalance

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            val navController =
                rememberNavController()

            MaterialTheme {

                Surface {

                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {

                        // HOME
                        composable("home") {

                            HomeScreen(
                                navController = navController
                            )
                        }

                        // DETAIL
                        composable("detail/{craving}") {

                            val craving =
                                it.arguments?.getString("craving")
                                    ?: ""

                            CravingDetailScreen(
                                craving = craving,
                                navController = navController
                            )
                        }

                        // RECIPE DETAIL
                        composable("recipe/{title}") {

                            val title =
                                it.arguments?.getString("title")
                                    ?: ""

                            RecipeDetailScreen(
                                recipeTitle = title,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}