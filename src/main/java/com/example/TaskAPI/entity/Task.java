package com.example.TaskAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    private String Id;
    private String title;
    private String completed;

    public Task(){

    }

    public Task(String id, String title, String completed) {
        this.Id = id;
        this.title = title;
        this.completed = completed;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCompleted() {
        return completed;
    }
    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
