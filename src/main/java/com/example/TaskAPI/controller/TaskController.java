package com.example.TaskAPI.controller;


import com.example.TaskAPI.dto.TaskRequest;
import com.example.TaskAPI.entity.Task;
import com.example.TaskAPI.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/api/tasks")
    public ResponseEntity<List<Task>> getAllTasks(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getAllTasks());

    }

    @PostMapping("/api/tasks")
    public ResponseEntity<Task> createTask(@Valid  @RequestBody TaskRequest taskRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.addTask(taskRequest));
    }

   @GetMapping("/api/tasks/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id){
        Task task = taskService.getTaskById(id);
        return ResponseEntity.status(HttpStatus.OK).body(task);
   }

   @PutMapping("/api/tasks/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @Valid  @RequestBody TaskRequest taskRequest){

        Task updatedTask = taskService.updateTask(id, taskRequest);
        return ResponseEntity.status(HttpStatus.OK).body(updatedTask);

   }

  /* @PatchMapping("/api/tasks/{id}")
   public ResponseEntity<Task> updateTaskPartial(@PathVariable UUID id , @RequestBody TaskRequest taskRequest){

   }*/

   @DeleteMapping("/api/tasks/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){

        taskService.deleteTask(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

   }



}
