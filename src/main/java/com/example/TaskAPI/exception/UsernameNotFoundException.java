package com.example.TaskAPI.exception;

public class UsernameNotFoundException extends Exception{

    public UsernameNotFoundException(String username){
        super("Username "+username+" not Found");
    }
}
