package com.example.TaskAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private boolean completed;
    private String priority;

    public Task(){

    }

    public Task(Long id, String title, boolean completed) {
        this.Id = id;
        this.name = name;
        this.completed = completed;
        this.priority = priority;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String title) {
        this.name = title;
    }
    public boolean getCompleted() {
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
