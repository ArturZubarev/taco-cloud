package org.zubarev.tacocloud.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Date createdAt;
    @NotNull
    @Size(min = 5,message = "Имя должно содержать больше пяти символов")
    private String name;
    @NotNull
    @Size(min = 5, message = "Нужно выбрать минимум один игредиент")
    private List<Ingredient> ingredients;

}
