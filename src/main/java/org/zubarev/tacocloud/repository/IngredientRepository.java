package org.zubarev.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.zubarev.tacocloud.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient,String> {
    /**
     * репозиторий для хранения объектов Ingredient должен поддер-
     * живать следующие операции:
     * получение всех ингредиентов в виде коллекции объектов Ingredient;
     * получение одного ингредиента по идентификатору;
     * сохранение объекта Ingredient.
     */
}

