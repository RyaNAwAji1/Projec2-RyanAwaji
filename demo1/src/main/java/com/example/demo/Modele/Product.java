package com.example.demo.Modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@AllArgsConstructor @Data
public class Product {
    @NotEmpty(message = "id is required") @Size(max = 3)
    private String id;
    @NotEmpty(message = "name is required") @Length(max = 3)
    private String name;
    @NotEmpty(message = "price is required") @Positive(message = "price must be positive")
    private String price;
    @NotEmpty(message = "categoryID is required") @Size(max = 3)
    private String categoryID;
    private ArrayList<Comment> comments;
}
