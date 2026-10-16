package com.example.TaskAPI.exception;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException(String email){
        super("The user with email "+email+" Already exists");
    }


}
