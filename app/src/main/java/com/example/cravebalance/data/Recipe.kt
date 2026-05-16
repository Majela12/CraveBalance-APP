package com.example.cravebalance.data

data class Recipe(

    val title: String,

    val cravingType: String,

    val ingredients: List<String>,

    val duration: String,

    val steps: List<String>,

    val imageRes: Int
)