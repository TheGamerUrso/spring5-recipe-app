package guru.springframework.spring5_recipe_app.services;

import java.util.Set;

import guru.springframework.spring5_recipe_app.domain.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();
}