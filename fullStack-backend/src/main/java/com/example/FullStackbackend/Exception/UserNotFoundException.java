package com.example.FullStackbackend.Exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id){
        super("No User with such id: " + id);
    }

}
