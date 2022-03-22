package com.example.migrationSystem.service;

import com.example.migrationSystem.entity.User;
import com.example.migrationSystem.exception.ResourceNotFoundException;
import com.example.migrationSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User newUser) {
        User user = userRepository.findById(newUser.getId())
                .orElseThrow(() -> new ResourceNotFoundException(newUser.getId()));

        user.setUserName(newUser.getUserName());
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setEmail(newUser.getEmail());
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}