package com.example.cravebalance.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

import com.example.cravebalance.data.Recipe

@Dao
interface RecipeDao {

    @Insert
    suspend fun insertRecipe(recipe: Recipe)

    @Query("SELECT * FROM recipes")
    suspend fun getAllRecipes(): List<Recipe>

    @Query(
        "SELECT * FROM recipes WHERE cravingType = :craving"
    )
    suspend fun getRecipesByCraving(
        craving: String
    ): List<Recipe>

    @Query(
        "SELECT * FROM recipes WHERE title = :title LIMIT 1"
    )
    suspend fun getRecipeByTitle(
        title: String
    ): Recipe?
}