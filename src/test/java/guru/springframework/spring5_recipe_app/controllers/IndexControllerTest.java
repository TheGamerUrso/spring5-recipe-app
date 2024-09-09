package guru.springframework.spring5_recipe_app.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import guru.springframework.spring5_recipe_app.domain.Recipe;
import guru.springframework.spring5_recipe_app.repositories.RecipeRepository;
import guru.springframework.spring5_recipe_app.services.RecipeService;
import guru.springframework.spring5_recipe_app.services.RecipeServiceImpl;

public class IndexControllerTest {

    @Mock
    RecipeServiceImpl recipeService;
    @Mock
    Model model;

    IndexController controller;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        controller = new IndexController(recipeService);
    }

    @Test
    public void testGetIndexPage() {
        // given
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());

        Recipe recipe = new Recipe();
        recipe.setId(1L);

        recipes.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipes);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        // when
        String viewName = controller.getIndexPage(model);

        assertEquals("index", viewName);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
        Set<Recipe> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());
    }
}
