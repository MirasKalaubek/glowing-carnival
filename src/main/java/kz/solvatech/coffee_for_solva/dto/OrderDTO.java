package kz.solvatech.coffee_for_solva.dto;

public class OrderDTO {
    private Long recipeId; // Поле для хранения ID рецепта

    // Геттер для поля recipeId
    public Long getRecipeId() {
        return recipeId;
    }

    // Сеттер для поля recipeId
    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }
}
