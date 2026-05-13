package com.example.cravebalance

data class Recipe(

    val title: String,

    val cravingType: String,

    val ingredients: List<String>,

    val duration: String,

    val preparation: String,

    val emoji: String
)

val recipes = listOf(

    Recipe(
        title = "Smoothie de chocolate",

        cravingType = "Chocolate",

        ingredients = listOf(
            "Blueberries",
            "Cacao",
            "Leche de almendra"
        ),

        duration = "5 minutos",

        preparation =
            "Pon todos los ingredientes en la licuadora y mezcla hasta que quede espumoso.",

        emoji = "🥣"
    ),

    Recipe(
        title = "Brownie saludable",

        cravingType = "Chocolate",

        ingredients = listOf(
            "Cacao",
            "Avena",
            "Banano"
        ),

        duration = "10 minutos",

        preparation =
            "Mezcla los ingredientes y hornea por 10 minutos.",

        emoji = "🍰"
    ),

    Recipe(
        title = "Yogurt con cacao",

        cravingType = "Chocolate",

        ingredients = listOf(
            "Yogurt",
            "Cacao",
            "Miel"
        ),

        duration = "7 minutos",

        preparation =
            "Mezcla el yogurt con cacao y añade miel.",

        emoji = "🍓"
    ),

    Recipe(
        title = "Snack salado",

        cravingType = "Sal",

        ingredients = listOf(
            "Pan integral",
            "Sal marina"
        ),

        duration = "5 minutos",

        preparation =
            "Tuesta el pan y añade sal marina.",

        emoji = "🥨"
    ),

    Recipe(
        title = "Tostadas saladas",

        cravingType = "Sal",

        ingredients = listOf(
            "Pan",
            "Queso",
            "Sal"
        ),

        duration = "8 minutos",

        preparation =
            "Prepara las tostadas y agrega queso.",

        emoji = "🍞"
    )
)