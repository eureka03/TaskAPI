package com.example.TaskAPI.controller;

import com.example.TaskAPI.entity.Task;
import com.example.TaskAPI.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("api/tasks")
    public ResponseEntity<List<Task>> getAllTasks(){

        return ResponseEntity.status(200).body(taskService.getAllTasks());

    }

    @PostMapping("api/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        return ResponseEntity.status(201).body(taskService.addTask(task));
    }
}
