package com.example.TaskAPI.service;

import com.example.TaskAPI.dto.RegisterRequestDto;
import com.example.TaskAPI.dto.RegisterResponseDto;
import com.example.TaskAPI.entity.User;
import com.example.TaskAPI.exception.UserAlreadyExistException;
import com.example.TaskAPI.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private PasswordEncoder passwordEncoder;
    private UserRepository userRepository;

    public UserService(PasswordEncoder passwordEncoder , UserRepository userRepository ){
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    public RegisterResponseDto registerUser(RegisterRequestDto registerRequestDto){
        if(userRepository.existsByEmail(registerRequestDto.getUserEmail())){
            throw new UserAlreadyExistException(registerRequestDto.getUserEmail());
        }
        User newUser = new User();
        newUser.setUserEmail(registerRequestDto.getUserEmail());
        newUser.setPassword(passwordEncoder.encode(registerRequestDto.getPassword()));
        User savedUser = userRepository.save(newUser);

        RegisterResponseDto registered = new RegisterResponseDto();
        registered.setUserId(savedUser.getId());
        registered.setUserEmail(savedUser.getUserEmail());

        return registered;
    }


}
