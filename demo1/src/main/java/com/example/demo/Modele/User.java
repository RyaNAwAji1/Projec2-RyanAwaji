package com.example.demo.Modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;


@AllArgsConstructor @Data
public class User {

    @NotEmpty(message = "id is required") @Range(max = 3)
    private String id;
    @NotEmpty(message = "id is required") @Length(max = 5)
    private String username;
    @NotEmpty(message = "id is required") @Length(max = 6)
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String password;
    @NotEmpty(message = "id is required") @Email(message = "Please Send a Valid Email")
    private String email;
    @NotEmpty(message = "id is required") @Pattern(regexp = "(Admin,Customer)")
    private String role;
    @NotEmpty(message = "id is required") @Positive(message = "a balance Have Be Positive")
    private String balance;



}
