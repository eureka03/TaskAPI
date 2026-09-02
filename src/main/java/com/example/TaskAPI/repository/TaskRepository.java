package com.example.TaskAPI.repository;

import com.example.TaskAPI.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
}
