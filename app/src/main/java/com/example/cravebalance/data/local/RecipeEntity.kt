package com.example.cravebalance.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class RecipeEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val title: String,

    val cravingType: String,

    val ingredients: String,

    val duration: String,

    val steps: String,

    val imageRes: Int
)