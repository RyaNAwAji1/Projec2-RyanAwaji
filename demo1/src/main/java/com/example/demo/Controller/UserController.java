package com.example.demo.Controller;

import com.example.demo.Modele.Api;
import com.example.demo.Modele.User;
import com.example.demo.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("Api/v1/User")
@RequiredArgsConstructor
public class UserController {


    @Autowired
    private final UserService userService;
    private final ArrayList<User> user = new ArrayList<>();


    @GetMapping(".get")
    public ResponseEntity<ArrayList<User>> getUser(){
        return ResponseEntity.status(200).body(user);
    }


    @PostMapping(".add")
    public  ResponseEntity addUser(@RequestBody @Valid User user, @NotNull Errors errors){
        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new Api(errors.getFieldError().getDefaultMessage(),400));
        }

        userService.addUser(user);
        return ResponseEntity.status(200).body(new Api("New User added",200));

    }

    @PutMapping(".update")
    public ResponseEntity updatUser(@RequestBody @Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.status(400).body(new Api(errors.getFieldError().getDefaultMessage(), 400));
        }
        Boolean isUserAdd = userService.updatUser(user);
        if (! isUserAdd){
            return ResponseEntity.status(200).body(new Api("New User update", 200));
        }
        return ResponseEntity.status(400).body(new Api("User not found",400));

    }

    @DeleteMapping(".delet")
    public ResponseEntity deletUser(@PathVariable String id){
        if(userService.deletUser(id)){
            return ResponseEntity.status(200).body(new Api("User deleted",200));
        }
        return ResponseEntity.status(400).body(new Api("User not found",400));

    }

}
