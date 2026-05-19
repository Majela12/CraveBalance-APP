package com.example.cravebalance

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.example.cravebalance.navigation.AppNavigation
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.cravebalance.data.local.DatabaseProvider
import com.example.cravebalance.data.local.RecipeSeeder
import com.example.cravebalance.data.repository.RecipeRepository
import com.example.cravebalance.viewmodel.RecipeViewModel
import com.example.cravebalance.viewmodel.RecipeViewModelFactory
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = DatabaseProvider.getDatabase(this)
        val repository = RecipeRepository(db.recipeDao())
        val factory = RecipeViewModelFactory(repository)
        val viewModel = ViewModelProvider(this, factory)[RecipeViewModel::class.java]

        lifecycleScope.launch {

            RecipeSeeder.seedDatabase(
                db.recipeDao()
            )
        }

        setContent {
            AppNavigation(viewModel = viewModel)
        }
    }
}