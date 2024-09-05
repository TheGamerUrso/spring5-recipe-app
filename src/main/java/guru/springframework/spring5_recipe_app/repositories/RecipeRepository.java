package guru.springframework.spring5_recipe_app.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5_recipe_app.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long>
{

}
