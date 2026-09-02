package com.example.TaskAPI.dto;

public class TaskPatchRequest {

    private String title;
    private Boolean completed;

    public TaskPatchRequest() {
    }

    public TaskPatchRequest(String title, Boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
