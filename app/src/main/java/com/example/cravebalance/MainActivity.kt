package com.example.cravebalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope

import com.example.cravebalance.navigation.AppNavigation
import com.example.cravebalance.data.local.DatabaseProvider
import com.example.cravebalance.data.local.RecipeSeeder
import com.example.cravebalance.data.repository.RecipeRepository
import com.example.cravebalance.viewmodel.RecipeViewModel
import com.example.cravebalance.viewmodel.RecipeViewModelFactory

import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val db by lazy {
        DatabaseProvider.getDatabase(this)
    }

    private val repository by lazy {
        RecipeRepository(db.recipeDao())
    }

    private val viewModel: RecipeViewModel by viewModels {
        RecipeViewModelFactory(repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        lifecycleScope.launch {

            RecipeSeeder.seedDatabase(
                db.recipeDao()
            )
        }

        setContent {

            AppNavigation(
                viewModel = viewModel
            )
        }
    }
}