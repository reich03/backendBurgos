package com.backend.backendBurgos.controller;
import com.backend.backendBurgos.model.User;
import com.backend.backendBurgos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        return userService.authenticate(user.getUsername(), user.getPassword())
                .map(u -> ResponseEntity.ok("Login exitoso"))
                .orElse(ResponseEntity.status(401).body("Credenciales incorrectas"));
    }
}
