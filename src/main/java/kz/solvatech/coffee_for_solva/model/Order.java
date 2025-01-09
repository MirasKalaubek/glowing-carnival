package kz.solvatech.coffee_for_solva.model;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name="orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime orderDateTime;
    private Long recipeId;

    // Геттеры и сеттеры
    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
}


