package com.example.TaskAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Task {

    @Id
    private UUID Id;
    private String title;
    private boolean completed;

    public Task(){

    }

    public Task(UUID id, String title, boolean completed) {
        this.Id = id;
        this.title = title;
        this.completed = completed;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        this.Id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
