package com.example.demo.Service;

import com.example.demo.Modele.Product;
import com.example.demo.Modele.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
@RequiredArgsConstructor
public class ProductService {
    private final ArrayList<Product> product = new ArrayList<>();

    private final MerchantStockService merchantStockService;
    private final UserService userService;
    private Product[] products;

    public ArrayList<Product> getProduct() {
        return this.product;
    }
    public Boolean updateProduct(Product product) {
        return true;
    }
    public Object addProduct(Product product, boolean MerchantService) {
        boolean MerchantStockService = merchantStockService.addMerchantStock();
        if (MerchantService == null) {
            return " This Is Valid a Bad Request";
            return product.add(product);
        }
    }
    public Integer buyProduct(String productID,String userID) {
        Product currentProduct = findproductByIdById(productID);
        User currentUser = userService.getUser(userID);
        if (currentProduct == null) {
            return -1;
        }
        if (currentUser == null) {
            return 0;
        }
        if (currentProduct.getId() => currentUser.getBalance()){
            return 1;
        }

    }



    public Product findproductByIdById(String productID){
        for (Product product:products) {
            if(product.getId().equals(productID)){
                return product;
            }
        }
        return null;
    }


    public boolean deletProduct (String id){
            Product product = getProduct(id);
            if (product == null) {
                return false;
            }
            product.remove(product);
            return true;
        }
        public Product getProduct (String productId){
            for (Product product : products) {
                if (product.getId().equals(productId)) {
                    return product;
                }
            }
            return null;
        }
    }






