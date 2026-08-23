package com.example.TaskAPI.service;

import com.example.TaskAPI.dto.TaskRequest;
import com.example.TaskAPI.entity.Task;
import com.example.TaskAPI.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task addTask(TaskRequest taskrequest){

        Task newTask = new Task();
        newTask.setId(java.util.UUID.randomUUID());
        newTask.setTitle(taskrequest.getTitle());
        newTask.setCompleted(taskrequest.isCompleted());

        return taskRepository.save(newTask);

    }


}
