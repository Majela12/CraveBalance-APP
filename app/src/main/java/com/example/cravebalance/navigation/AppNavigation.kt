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
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

@Composable
fun AppNavigation(
    viewModel: RecipeViewModel
) {
    val navController = rememberNavController()
    val auth = Firebase.auth
    val currentUser = auth.currentUser

    val myStartDestination: String = if (currentUser != null){
        "home"
    }else{
        "login"
    }


    NavHost(
        navController = navController,
        startDestination = myStartDestination
    ) {
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

        composable("register") {
            RegisterScreen(
                onRegisterSuccess = {
                    navController.navigate("home"){
                        popUpTo(0)
                    }
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

        composable("home") {
            HomeScreen(
                navController = navController,
                viewModel = viewModel,
                onClickLogout = {
                    navController.navigate("login") {
                        popUpTo(0)
                    }
                }
            )
        }

        composable("craving/{type}") {

            val type =
                it.arguments?.getString("type") ?: ""

            CravingDetailScreen(
                craving = type,
                navController = navController,
                viewModel = viewModel
            )
        }

        composable("recipe/{title}") {

            val title =
                it.arguments?.getString("title") ?: ""

            RecipeDetailScreen(
                recipeTitle = title,
                navController = navController
            )
        }
    }
}