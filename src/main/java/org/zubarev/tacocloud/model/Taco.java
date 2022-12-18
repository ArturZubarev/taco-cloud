package org.zubarev.tacocloud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Date createdAt;
    @NotNull
    @Size(min = 5,message = "Имя должно содержать больше пяти символов")
    private String name;
    @Size(min = 5, message = "Нужно выбрать минимум один игредиент")
    private List<Ingredient> ingredients;

}
