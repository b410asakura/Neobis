package com.example.migrationSystem.controller;

import com.example.migrationSystem.entity.User;
import com.example.migrationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/getUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/getUsers/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @PostMapping(path = "/addNewUser")
    public void addNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    @PutMapping(path = "/updateUser/{id}")
    public void updateUser(@PathVariable("id") Long id,
                                    @RequestBody User newUser){
        userService.updateUser(newUser);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
