package com.example.cravebalance.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cravebalance.data.Recipe

@Database(
    entities = [Recipe::class],
    version = 3
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun recipeDao(): RecipeDao
}