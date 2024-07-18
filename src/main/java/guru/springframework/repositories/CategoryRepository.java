package guru.springframework.repositories;


import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import guru.springframework.domain.Category;


public interface CategoryRepository extends CrudRepository<Category,Long>{
    Optional<Category> findByDescription(String description);
}
