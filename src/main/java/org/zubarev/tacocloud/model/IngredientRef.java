package org.zubarev.tacocloud.model;

import lombok.Data;

/**
 * Класс описывает связь между Taco и Ingredient
 * */
@Data
public class IngredientRef {
    private final String ingredient;
}
