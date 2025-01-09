package kz.solvatech.coffee_for_solva.repository;

import kz.solvatech.coffee_for_solva.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    // Найти рецепт по имени
    Optional<Recipe> findByName(String name);

    // Найти все рецепты
    List<Recipe> findAll();
}
