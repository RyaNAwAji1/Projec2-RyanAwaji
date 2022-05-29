package com.example.demo.Modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor @Data
public class MerchantStock {
    @NotEmpty(message = "id is required") @Size(max = 3)
    private String id;
    @NotEmpty(message = "productid is required") @Size(max = 3)
    private String productid;
    @NotEmpty(message = "merchantid is required") @Length(max = 3)
    private String merchantid;
    @NotEmpty(message = "stock is required") @Range(min = 10)
    private String stock;
}
