package com.example.TaskAPI.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordencoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){


        http
                //Alows us to define which users with which roles should access which endpoints / url
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize

                        .requestMatchers("/api/auth/register").permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults()


        );
        return http.build();

    }


}


