package com.example.cravebalance

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.example.cravebalance.navigation.AppNavigation
import androidx.room.Room
import androidx.lifecycle.lifecycleScope
import com.example.cravebalance.data.local.DatabaseProvider
import com.example.cravebalance.data.local.RecipeSeeder
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = DatabaseProvider.getDatabase(this)

        lifecycleScope.launch {

            RecipeSeeder.seedDatabase(
                db.recipeDao()
            )
        }

        setContent {

        }
    }
}