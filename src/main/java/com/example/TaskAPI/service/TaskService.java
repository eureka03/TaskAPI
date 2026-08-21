package com.example.TaskAPI.service;

import com.example.TaskAPI.entity.Task;
import com.example.TaskAPI.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();

    }

    public Task addTask(Task task){
        return taskRepository.save(task);
    }


}
