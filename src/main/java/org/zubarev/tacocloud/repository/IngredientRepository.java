package org.zubarev.tacocloud.repository;

import org.zubarev.tacocloud.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository {
    /**
     * репозиторий для хранения объектов Ingredient должен поддер-
     * живать следующие операции:
     * получение всех ингредиентов в виде коллекции объектов Ingredient;
     * получение одного ингредиента по идентификатору;
     * сохранение объекта Ingredient.
     */

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
