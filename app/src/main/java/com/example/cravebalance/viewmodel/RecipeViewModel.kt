package com.example.cravebalance.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.cravebalance.data.Recipe
import com.example.cravebalance.data.repository.RecipeRepository

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

import kotlinx.coroutines.launch

class RecipeViewModel(
    private val repository: RecipeRepository
) : ViewModel() {

    private val _recipes =
        MutableStateFlow<List<Recipe>>(emptyList())

    val recipes: StateFlow<List<Recipe>> =
        _recipes.asStateFlow()

    init {

        loadAllRecipes()
    }

    private fun loadAllRecipes() {

        viewModelScope.launch {

            _recipes.value =
                repository.getAllRecipes()
        }
    }

    fun loadRecipesByCraving(
        craving: String
    ) {

        viewModelScope.launch {

            _recipes.value =
                repository.getRecipesByCraving(craving)
        }
    }

    fun loadRecipeByTitle(
        title: String
    ) {

        viewModelScope.launch {

            val recipe =
                repository.getRecipeByTitle(title)

            _recipes.value =
                if (recipe != null)
                    listOf(recipe)
                else
                    emptyList()
        }
    }
}