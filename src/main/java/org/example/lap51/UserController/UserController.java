package org.example.lap51.UserController;

import jakarta.validation.Valid;
import org.example.lap51.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    ArrayList<User> users = new ArrayList<>();

    @GetMapping("/get")
    public ResponseEntity getUser() {
        return ResponseEntity.ok(users);
    }

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody @Valid User user, Errors errors)
    {
        if (errors.hasErrors())
        {
            String message =errors.getFieldError().getDefaultMessage();
            return  ResponseEntity.status(400).body(message);
        }
        users.add(user);
        return ResponseEntity.status(200).body("user added");
        
    }


}
