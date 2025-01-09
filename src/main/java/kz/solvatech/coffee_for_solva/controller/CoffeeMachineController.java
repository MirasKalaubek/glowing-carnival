package kz.solvatech.coffee_for_solva.controller;

import io.swagger.v3.oas.annotations.Operation;
import kz.solvatech.coffee_for_solva.dto.OrderDTO;
import kz.solvatech.coffee_for_solva.dto.RecipeDTO;
import kz.solvatech.coffee_for_solva.model.Recipe;
import kz.solvatech.coffee_for_solva.service.OrderService;
import kz.solvatech.coffee_for_solva.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee-machine")
public class CoffeeMachineController {

    private final OrderService orderService;
    private final RecipeService recipeService;

    @Autowired
    public CoffeeMachineController(OrderService orderService, RecipeService recipeService) {
        this.orderService = orderService;
        this.recipeService = recipeService;
    }

    @Operation(summary = "Get the most popular recipe")
    @GetMapping("/statistics/popular")
    public ResponseEntity<Long> popularRecipe() {
        try {
            Long popularRecipeId = orderService.findPopularRecipe();
            return ResponseEntity.status(HttpStatus.OK).body(popularRecipeId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Operation(summary = "Add a new recipe")
    @PostMapping("/recipe")
    public ResponseEntity<?> addRecipe(@RequestBody RecipeDTO recipeDTO) {
        try {
            Recipe savedRecipe = recipeService.addRecipe(recipeDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedRecipe);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Operation(summary = "Add a new order")
    @PostMapping("/order")
    public ResponseEntity<?> addOrder(@RequestBody OrderDTO orderDTO) {
        try {
            orderService.addOrder(orderDTO);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
