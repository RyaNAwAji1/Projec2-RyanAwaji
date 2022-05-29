package com.example.demo.Service;

import com.example.demo.Modele.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CartService {
    private final ArrayList<Cart> cart = new ArrayList<>();

    public ArrayList<Cart> getCart() {
        return this.cart;
    }
}
