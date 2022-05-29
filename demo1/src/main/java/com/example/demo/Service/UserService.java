package com.example.demo.Service;

import com.example.demo.Modele.Cart;
import com.example.demo.Modele.Product;
import com.example.demo.Modele.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ArrayList<User> user = new ArrayList<>();
    private final ProductService productService;
    private final CartService cartService;
    private User[] users;


    public String addUser(User user) {
        Product currentProduct = productService.getProduct(user.getId());
        Cart currentCart = cartService.getCart().get(Integer.parseInt(user.getId()));
        if (currentProduct == null || currentCart == null){
            return "Valid a Bad Request";
        }
        return user.add(user);
    }


    public User getUser(String userid) {
        for (User user : users){
            if (user.getId().equals(userid)){
                return user;
            }
        }
        return null;
    }

    public User updateUser(User user) {

        if(user.getProduct()|| user.getCart()== null) {
            return null;
        }
        return user;

    }

    public boolean deletUser(String id) {
        Product currentProduct = productService.getProduct(user.getId());
        Cart currentCart = cartService.getCart().get(user.getId());
        if (currentProduct == null || currentCart == null){
            return Boolean.parseBoolean("Valid a Bad Request");
        }
        return user.add(user);
    }


    public Boolean updatUser(User user) {
        return false;
    }
}
