package com.example.cravebalance.data.local

import com.example.cravebalance.R
import com.example.cravebalance.data.Recipe

object RecipeSeeder {

    suspend fun seedDatabase(recipeDao: RecipeDao) {

        if (recipeDao.getAllRecipes().isNotEmpty()) {
            return
        }

        val recipes = listOf(

            Recipe(
                title = "Smoothie de chocolate ANTI-ANTOJOS",

                cravingType = "Chocolate",

                ingredients =
                    "1 taza de blueberries congeladas\n" +
                            "1 taza de leche de almendra\n" +
                            "1 cucharada de cacao",

                duration = "5 minutos",

                steps =
                    "Pon todos los ingredientes en la licuadora\n" +
                            "Licúa hasta que esté espumoso\n" +
                            "Sirve frío",

                imageRes = R.drawable.smoothiechocolate
            ),

            Recipe(
                title = "Garbanzos tostados",

                cravingType = "Sal",

                ingredients =
                    "1 taza de garbanzos\n" +
                            "Pimentón dulce\n" +
                            "Ajo en polvo",

                duration = "40 minutos",

                steps =
                    "Remoja los garbanzos\n" +
                            "Precalienta el horno\n" +
                            "Hornea durante 40 minutos",

                imageRes = R.drawable.garbanzostostados
            )
        )

        recipes.forEach {
            recipeDao.insertRecipe(it)
        }
    }
}