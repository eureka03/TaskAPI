package com.example.TaskAPI.repository;

import com.example.TaskAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserEmail(String userEmail);
    Boolean existsByUserEmail(String userEmail);
}
