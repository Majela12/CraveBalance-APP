package com.example.cravebalance.data.local

import com.example.cravebalance.R
import com.example.cravebalance.data.Recipe

object RecipeSeeder {

    suspend fun seedDatabase(recipeDao: RecipeDao) {

        if (recipeDao.getAllRecipes().isNotEmpty()) {
            return
        }

        val recipes = listOf(

            // CHOCOLATE

            Recipe(
                title = "Smoothie de chocolate ANTI-ANTOJOS",

                cravingType = "Chocolate",

                ingredients =
                    "1 taza de blueberries congeladas\n" +
                            "1 pizca de sal (opcional)\n" +
                            "1 taza de leche de almendra\n" +
                            "1/2 taza de leche de coco entera\n" +
                            "1 cucharada de cacao crudo orgánico en polvo\n" +
                            "1 cucharada de aceite de coco\n" +
                            "1 puño grande de almendras o semillas\n" +
                            "1/4 cucharadita de extracto de vainilla\n" +
                            "1/2 cucharada de miel orgánica",

                duration = "5 minutos",

                steps =
                    "Pon todos los ingredientes en la licuadora\n" +
                            "Licúa hasta que la mezcla esté espumosa\n" +
                            "Verifica la textura\n" +
                            "Sirve y disfruta",

                imageRes = R.drawable.smoothiechocolate
            ),

            Recipe(
                title = "Pudín rápido de chocolate hecho con yogur",

                cravingType = "Chocolate",

                ingredients =
                    "150 g de yogur griego blanco descremado\n" +
                            "2 cucharaditas de cacao\n" +
                            "20 g de proteína o xilitol\n" +
                            "100 g de fruta congelada o fresca",

                duration = "5 minutos",

                steps =
                    "Pon todos los ingredientes en una licuadora\n" +
                            "Bate a velocidad media\n" +
                            "Continúa hasta que quede homogéneo\n" +
                            "Añade más endulzante si deseas",

                imageRes = R.drawable.pudinchocolate
            ),

            Recipe(
                title = "Parfait Saludable de Yogur Griego y Cacao",

                cravingType = "Chocolate",

                ingredients =
                    "1 taza de yogur griego natural\n" +
                            "1/8 taza de cacao en polvo sin azúcar\n" +
                            "1 cucharada de miel\n" +
                            "1/2 taza de granola\n" +
                            "1/2 plátano en rodajas\n" +
                            "1/4 taza de fresas\n" +
                            "1/4 taza de arándanos\n" +
                            "1/8 cucharadita de vainilla\n" +
                            "Sal al gusto",

                duration = "15-20 minutos",

                steps =
                    "Mezcla yogur, cacao, miel y vainilla\n" +
                            "Coloca una capa de yogur en el vaso\n" +
                            "Agrega granola\n" +
                            "Añade frutas\n" +
                            "Repite las capas\n" +
                            "Agrega una pizca de sal\n" +
                            "Sirve o refrigera",

                imageRes = R.drawable.yogurtcacao
            ),

            // SAL

            Recipe(
                title = "Garbanzos tostados",

                cravingType = "Sal",

                ingredients =
                    "1 taza de garbanzos crudos\n" +
                            "Zumo de medio limón\n" +
                            "1 cucharadita de pimentón dulce\n" +
                            "1 cucharadita de ajo en polvo\n" +
                            "1 cucharadita de comino\n" +
                            "1 cucharadita de curry",

                duration = "40 minutos",

                steps =
                    "Deja los garbanzos en remojo toda la noche\n" +
                            "Precalienta el horno a 200 grados\n" +
                            "Mezcla garbanzos con limón y especias\n" +
                            "Colócalos en una bandeja\n" +
                            "Hornea durante 40 minutos\n" +
                            "Prueba y sirve",

                imageRes = R.drawable.garbanzostostados
            ),

            Recipe(
                title = "Palomitas de maíz con levadura nutricional",

                cravingType = "Sal",

                ingredients =
                    "100 g de maíz para palomitas\n" +
                            "15 g de aceite de oliva\n" +
                            "30 g de levadura nutricional",

                duration = "56 minutos",

                steps =
                    "Calienta el aceite en una sartén\n" +
                            "Agrega el maíz y tapa\n" +
                            "Espera a que exploten las palomitas\n" +
                            "Remueve constantemente\n" +
                            "Añade levadura nutricional\n" +
                            "Mezcla y sirve",

                imageRes = R.drawable.palomitaslevadura
            )
        )

        recipes.forEach {

            recipeDao.insertRecipe(it)
        }
    }
}