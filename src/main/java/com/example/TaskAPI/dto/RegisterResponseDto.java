package com.example.TaskAPI.dto;

public class RegisterResponseDto {

    private Long userId;
    private String userEmail;

    public RegisterResponseDto(){

    }

    public void setUserId(Long id){
        this.userId = id;
    }
    public Long getUserId(){
        return userId;
    }

    public void setUserEmail(String email){
        this.userEmail = email;
    }
    public String getUserEmail(){
        return userEmail;
    }
}
