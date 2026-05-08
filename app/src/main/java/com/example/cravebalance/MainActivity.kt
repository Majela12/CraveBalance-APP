package com.example.cravebalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.cravebalance.ui.theme.CraveBalanceTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            CraveBalanceTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "home"
                ) {

                    composable("home") {

                        HomeScreen(navController)
                    }

                    composable("detail/{craving}") {

                        val craving =
                            it.arguments?.getString("craving") ?: ""

                        CravingDetailScreen(
                            craving = craving,
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}