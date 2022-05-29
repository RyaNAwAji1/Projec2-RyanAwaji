package com.example.demo.Modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor @Data
public class Category {
    @NotEmpty(message = "id is required") @Size(max = 3)
    private String id;
    @NotEmpty(message = "name is required") @Length(max = 3)
    private String name;
}
