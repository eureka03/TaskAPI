package com.example.TaskAPI.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegisterRequestDto {

    @NotBlank(message = "Email Address cannot be blank")
    private String userEmail;
    @Size(message ="Password must be 10 Characters or more")
    private String password;

    public RegisterRequestDto(){

    }
    public void setUserEmail(String email){
        this.userEmail =  email;
    }
    public String getUserEmail(){
        return userEmail;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

}
