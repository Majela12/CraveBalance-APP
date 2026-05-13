package com.example.cravebalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavType

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cravebalance.ui.element.CravingDetailScreen
import com.example.cravebalance.ui.element.HomeScreen
import com.example.cravebalance.ui.element.LoginScreen
import com.example.cravebalance.ui.element.RecoverScreen
import com.example.cravebalance.ui.element.RegisterScreen
import com.example.cravebalance.ui.theme.CraveBalanceTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            CraveBalanceTheme {
                // val auth = FirebaseAuth.getInstance()
                val navController = rememberNavController()

                // val startDestination = if (auth.currentUser != null) "home" else "login"
                val startDestination = "login"

                NavHost(
                    navController = navController,
                    startDestination = startDestination,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    composable(route = "login") {
                        LoginScreen(
                            onLoginSuccess = {
                                navController.navigate("home") {
                                    popUpTo("login") { inclusive = true }
                                }
                            },
                            onNavigateToRegister = {
                                navController.navigate("register")
                            },
                            onNavigateToRecover = {
                                navController.navigate("recover")
                            }
                        )
                    }

                    composable(route = "register") {
                        RegisterScreen(
                            onRegisterSuccess = {
                                navController.navigate("home") {
                                    popUpTo("login") { inclusive = true }
                                }
                            },
                            onNavigateToLogin = {
                                navController.navigate("login")
                            }
                        )
                    }

                    composable(route = "recover") {
                        RecoverScreen(
                            onBackClick = {
                                navController.popBackStack()
                            }
                        )
                    }

                    composable(route = "home") {
                        HomeScreen(
                            onClickAddTouristicPlace = {
                                // navController.navigate("add_Touristic_Place")
                            },
                            onLogout = {
                                // auth.signOut()
                                navController.navigate("login") {
                                    popUpTo("home") { inclusive = true }
                                }
                            },
                            onNavigateToDetail = { craving ->
                                navController.navigate("detail/$craving")
                            }
                        )
                    }

                    composable(
                        route = "detail/{craving}",
                        arguments = listOf(navArgument("craving") { type = NavType.StringType })
                    ) { backStackEntry ->
                        val craving = backStackEntry.arguments?.getString("craving") ?: ""
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
