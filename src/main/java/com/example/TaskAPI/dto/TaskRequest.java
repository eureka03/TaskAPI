package com.example.TaskAPI.dto;

import jakarta.validation.constraints.NotBlank;

// Object used to deserialize the request body for creating a new task
public class TaskRequest {

    @NotBlank
    private String title;
    private boolean completed;

    public TaskRequest() {
    }

    public TaskRequest(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
