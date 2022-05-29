package com.example.demo.Controller;

import com.example.demo.Modele.Cart;
import com.example.demo.Service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
@RequestMapping("Api/v1/Cooment")
@RequiredArgsConstructor
public class CommentController {
    @Autowired
    private final CommentService commentService;

    private final ArrayList<Cart> cart = new ArrayList<>();


    @GetMapping(".get")
    public ResponseEntity<ArrayList<Cart>> getComment(){
        return ResponseEntity.status(200).body(cart);
    }
}
