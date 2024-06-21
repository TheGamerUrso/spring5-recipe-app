package guru.springframework.repositories;


import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import guru.springframework.domain.Category;
import java.util.List;


public interface CategoryRepository extends CrudRepository<Category,Long>{
    Optional<Category> findByDescription(String description);
}
