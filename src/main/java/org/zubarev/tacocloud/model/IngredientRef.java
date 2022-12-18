package org.zubarev.tacocloud.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

/**
 * Класс описывает связь между Taco и Ingredient
 * */
@Data
@Table
public class IngredientRef {
    private final String ingredient;
}
