package com.example.cravebalance.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.cravebalance.screens.HomeScreen
import com.example.cravebalance.screens.CravingDetailScreen
import com.example.cravebalance.screens.RecipeDetailScreen

import com.example.cravebalance.ui.element.LoginScreen
import com.example.cravebalance.ui.element.RegisterScreen
import com.example.cravebalance.ui.element.RecoverScreen


import com.example.cravebalance.viewmodel.RecipeViewModel

@Composable
fun AppNavigation(
    viewModel: RecipeViewModel

) {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        // LOGIN
        composable("login") {

            LoginScreen(

                onLoginSuccess = {

                    navController.navigate("home")
                },

                onNavigateToRegister = {

                    navController.navigate("register")
                },

                onNavigateToRecover = {

                    navController.navigate("recover")
                }
            )
        }

        // REGISTER
        composable("register") {

            RegisterScreen(

                onRegisterSuccess = {

                    navController.navigate("home")
                },

                onNavigateToLogin = {

                    navController.popBackStack()
                }
            )
        }

        composable("recover") {

            RecoverScreen(

                onBackClick = {

                    navController.popBackStack()
                }
            )
        }



        // HOME
        composable("home") {

            HomeScreen(

                navController = navController,
                viewModel = viewModel
            )
        }

        // DETAIL ANTOJO
        composable("craving/{type}") {

            val type =
                it.arguments?.getString("type") ?: ""

            CravingDetailScreen(
                craving = type,
                navController = navController,
                viewModel = viewModel
            )
        }

        // DETAIL RECETA
        composable("recipe/{title}") {

            val title =
                it.arguments?.getString("title") ?: ""

            RecipeDetailScreen(
                recipeTitle = title,
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}