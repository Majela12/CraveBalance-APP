package com.example.cravebalance.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.cravebalance.data.Recipe
import com.example.cravebalance.data.repository.RecipeRepository

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

import kotlinx.coroutines.launch

class RecipeViewModel(
    private val repository: RecipeRepository
) : ViewModel() {

    // LISTA DE RECETAS
    private val _recipes =
        MutableStateFlow<List<Recipe>>(emptyList())

    val recipes: StateFlow<List<Recipe>> =
        _recipes

    // RECETA SELECCIONADA
    private val _selectedRecipe =
        MutableStateFlow<Recipe?>(null)

    val selectedRecipe: StateFlow<Recipe?> =
        _selectedRecipe

    // CARGAR RECETAS POR ANTOJO
    fun loadRecipesByCraving(
        craving: String
    ) {

        viewModelScope.launch {

            _recipes.value =
                repository.getRecipesByCraving(craving)
        }
    }

    // CARGAR RECETA
    fun loadRecipe(
        title: String
    ) {

        viewModelScope.launch {

            _selectedRecipe.value =
                repository.getRecipeByTitle(title)
        }
    }
}