package guru.springframework.spring5_recipe_app.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5_recipe_app.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>{

}
