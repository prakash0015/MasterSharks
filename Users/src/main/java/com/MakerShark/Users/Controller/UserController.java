package com.MakerShark.Users.Controller;

import com.MakerShark.Users.Model.User;
import com.MakerShark.Users.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        try {
           this.userService.addUser(user);
           return ResponseEntity.ok("User register successfully");
        }catch (Exception e) {
            return ResponseEntity.status(500).body("user registration failed");
        }
    }

    @GetMapping("/fetch")
    public ResponseEntity<User> fetch(@RequestParam String username) {
        try {
            User u = this.userService.fetchUser(username);
            if (u != null) {
                return ResponseEntity.ok(u);
            }
            else {
                return ResponseEntity.status(500).body(null);
            }
        }catch(Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}
