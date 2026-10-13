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
    private String username;
    private String userEmail;

    public User(){

    }

    public User(Long userId , String username , String userEmail){
        this.userId = userId;
        this.userEmail = userEmail;
        this.username = username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
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
