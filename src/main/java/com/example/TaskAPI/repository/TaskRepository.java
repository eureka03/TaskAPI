package com.example.TaskAPI.repository;

import com.example.TaskAPI.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,String> {
}
