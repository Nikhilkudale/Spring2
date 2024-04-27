package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String description;

    // Constructor
    public News() {
    }

    // Constructor with parameters
    public News(String category, String description) {
        this.category = category;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method for logging and debugging
    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
