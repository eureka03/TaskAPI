package com.example.TaskAPI.service;

import com.example.TaskAPI.dto.TaskRequest;
import com.example.TaskAPI.entity.Task;
import com.example.TaskAPI.exception.TaskNotFoundException;
import com.example.TaskAPI.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        newTask.setName(taskrequest.getName());
        newTask.setCompleted(taskrequest.isCompleted());
        newTask.setPriority(taskrequest.getPriority());

        return taskRepository.save(newTask);

    }

    public Task getTaskById(UUID id){
       return taskRepository.findById(id)
               .orElseThrow( ()->new TaskNotFoundException(id));

    }

    public Task updateTask(UUID id, TaskRequest taskRequest){
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new TaskNotFoundException(id));

        task.setName(taskRequest.getName());
        task.setCompleted(taskRequest.isCompleted());

        return taskRepository.save(task);
    }

    public void deleteTask(UUID id){
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new TaskNotFoundException(id));
        taskRepository.delete(task);

    }



}
