package com.example.demo.Controller;

import com.example.demo.Modele.Cart;
import com.example.demo.Service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("Api/v1/Cart")
@RequiredArgsConstructor
public class CartController {

    @Autowired
    private final CartService cartService;

    private final ArrayList<Cart> cart = new ArrayList<>();

    @GetMapping(".get")
    public ResponseEntity<ArrayList<Cart>> getCart(){
        return ResponseEntity.status(200).body(cart);
    }



}
