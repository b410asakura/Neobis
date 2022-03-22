package com.example.migrationSystem.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id){
        super("There is no user with id = " + id);
    }
}
