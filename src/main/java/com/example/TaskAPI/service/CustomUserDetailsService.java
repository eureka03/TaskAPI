package com.example.TaskAPI.service;

import com.example.TaskAPI.entity.User;
import com.example.TaskAPI.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService  implements UserDetailsService {

    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        //building the Username part of the userDetails
        User user = userRepository.findByUserEmail(username)
                .orElseThrow(()-> new UsernameNotFoundException(username));

        //Spring security needs the user details in a UserDetails format
        //so we use this user to build a UserDetails

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUserEmail())
                .password(user.getPassword())
                .roles("USER")
                .build();
    }
}
