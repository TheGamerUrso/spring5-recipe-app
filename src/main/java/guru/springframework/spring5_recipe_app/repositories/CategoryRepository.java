package guru.springframework.spring5_recipe_app.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5_recipe_app.domain.Category;
import java.util.Optional;


public interface CategoryRepository extends CrudRepository<Category,Long>
{
    Optional<Category> findByDescription(String description);
}
