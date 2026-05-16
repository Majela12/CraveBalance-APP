package com.example.cravebalance.data.repository

import com.example.cravebalance.R
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

    companion object {
        val recipes = listOf(
            Recipe(
                title = "Smoothie de chocolate ANTI-ANTOJOS",
                cravingType = "Chocolate",
                ingredients = "1 taza de blueberries congeladas\n1 taza de leche de almendra\n1 cucharada de cacao",
                duration = "5 minutos",
                steps = "Pon todos los ingredientes en la licuadora\nLicúa hasta que esté espumoso\nSirve frío",
                imageRes = R.drawable.smoothiechocolate
            ),
            Recipe(
                title = "Garbanzos tostados",
                cravingType = "Sal",
                ingredients = "1 taza de garbanzos\nPimentón dulce\nAjo en polvo",
                duration = "40 minutos",
                steps = "Remoja los garbanzos\nPrecalienta el horno\nHornea durante 40 minutos",
                imageRes = R.drawable.garbanzostostados
            ),
            Recipe(
                title = "Pudín de Chía y Chocolate",
                cravingType = "Chocolate",
                ingredients = "3 cucharadas de semillas de chía\n1 taza de leche de coco\n1 cucharadita de cacao puro",
                duration = "10 minutos + reposo",
                steps = "Mezcla la chía con la leche y el cacao\nDeja reposar en la nevera mínimo 2 horas\nDecora con fruta",
                imageRes = R.drawable.pudinchocolate
            ),
            Recipe(
                title = "Tostadas con Aguacate",
                cravingType = "Pan",
                ingredients = "1 rebanada de pan integral\nMedio aguacate maduro\nSemillas de sésamo",
                duration = "5 minutos",
                steps = "Tuesta el pan\nAplasta el aguacate sobre la tostada\nEspolvorea las semillas",
                imageRes = R.drawable.tostadas
            )
        )
    }
}
