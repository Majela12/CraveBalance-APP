package com.example.cravebalance.data.repository

import com.example.cravebalance.data.Recipe
import com.example.cravebalance.data.local.RecipeDao

class RecipeRepository(
    private val dao: RecipeDao
) {

    suspend fun insertRecipe(recipe: Recipe) {

        dao.insertRecipe(recipe)
    }

    suspend fun getAllRecipes(): List<Recipe> {

        return dao.getAllRecipes()
    }

    suspend fun getRecipesByCraving(
        craving: String
    ): List<Recipe> {

        return dao.getRecipesByCraving(craving)
    }

    suspend fun getRecipeByTitle(
        title: String
    ): Recipe? {

        return dao.getRecipeByTitle(title)
    }
}