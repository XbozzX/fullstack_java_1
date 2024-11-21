package com.example.ccsd.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class usersController {

    @Autowired
    private usersService usersService;

    @GetMapping
    public List<users> getAllUsers() {
        return usersService.getAllUsers();
    }

    // get user by id 
    @GetMapping("/{id}")
    public ResponseEntity<users> getUserById(@PathVariable String UserId) {
        return usersService.getUserById(UserId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

     // get user by email
     @GetMapping("/{id}")
     public ResponseEntity<users> getUserByEmail(@PathVariable String email) {
         return usersService.getUserByEmail(email)
                 .map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
     }

    @PostMapping
    public users addUser(@RequestBody users users) {
        return usersService.addUser(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<users> updateUser(@PathVariable String id, @RequestBody users usersDetails) {
        users updatedusers = usersService.updateUser(id, usersDetails);
        if (updatedusers != null) {
            return ResponseEntity.ok(updatedusers);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userId) {
        usersService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }
    
    
}
