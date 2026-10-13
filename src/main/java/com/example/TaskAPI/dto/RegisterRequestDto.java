package com.example.TaskAPI.dto;

public class RegisterRequestDto {

    private String username;
    private String userEmail;
    private String password;

    public RegisterRequestDto(){

    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setUserEmail(String email){
        this.userEmail =  email;
    }
    public String getUserEmail(){
        return userEmail;
    }
    public String setPassword(){
        this.password = password;
    }


}
