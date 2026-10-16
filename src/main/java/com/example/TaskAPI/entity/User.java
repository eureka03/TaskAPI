package com.example.TaskAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String password;
    private String userEmail;

    public User(){

    }

    public User(Long userId , String password , String userEmail){
        this.userId = userId;
        this.userEmail = userEmail;
        this.password = password;
    }
    public void setPassword(String username){
        this.password = username;
    }
    public String getPassword(){
        return password;
    }

    public void setId(Long id){
        this.userId = id;
    }

    public Long getId(){
        return userId;
    }

    public void setUserEmail(String email){
        this.userEmail = email;
    }

    public String getUserEmail(){
        return userEmail;
    }
}
