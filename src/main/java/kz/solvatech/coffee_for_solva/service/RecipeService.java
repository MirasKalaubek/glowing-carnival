package kz.solvatech.coffee_for_solva.service;

import kz.solvatech.coffee_for_solva.dto.RecipeDTO;
import kz.solvatech.coffee_for_solva.model.Recipe;
import kz.solvatech.coffee_for_solva.repository.RecipeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    private static final Logger logger = LoggerFactory.getLogger(RecipeService.class);

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Transactional
    public Recipe addRecipe(RecipeDTO recipeDTO) {
        if (recipeDTO == null || recipeDTO.getName() == null || recipeDTO.getName().isBlank()) {
            logger.error("Invalid RecipeDTO: {}", recipeDTO);
            throw new IllegalArgumentException("RecipeDTO is invalid or missing required fields");
        }

        var recipe = new Recipe();
        recipe.setName(recipeDTO.getName());
        Recipe savedRecipe = recipeRepository.save(recipe);
        logger.info("Recipe added successfully: {}", savedRecipe);
        return savedRecipe;
    }

    public Optional<Recipe> findRecipeByName(String name) {
        if (name == null || name.isBlank()) {
            logger.warn("Name is null or blank");
            return Optional.empty();
        }

        Optional<Recipe> recipe = recipeRepository.findByName(name);
        logger.info("Recipe found by name '{}': {}", name, recipe.orElse(null));
        return recipe;
    }

    public List<Recipe> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        logger.info("Retrieved all recipes: {}", recipes);
        return recipes;
    }
}
