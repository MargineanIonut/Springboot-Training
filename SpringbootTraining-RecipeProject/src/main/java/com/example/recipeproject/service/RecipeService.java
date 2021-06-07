package com.example.recipeproject.service;

import com.example.recipeproject.commands.RecipeCommand;
import com.example.recipeproject.domain.Recipe;
import javassist.NotFoundException;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l) throws NotFoundException;
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l) throws NotFoundException;
    void deleteById(Long id);
}
