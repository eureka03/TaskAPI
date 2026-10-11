package com.example.TaskAPI.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// Object used to deserialize the request body for creating a new task
public class TaskRequest {

    @NotBlank(message="Title is required")
    @Size(min=3 , max =100 , message = "Title must be between 3 and 100 characters")
    private String name;
    private boolean completed;
    private String priority;

    public TaskRequest() {
    }

    public TaskRequest(String name, boolean completed, String priority) {
        this.name = name;
        this.completed = completed;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }

    public String getPriority(){
        return priority;
    }
}
