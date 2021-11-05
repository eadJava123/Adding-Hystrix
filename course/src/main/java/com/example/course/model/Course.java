package com.example.course.model;



import lombok.Data;

@Data
public class Course {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Rating rating;
}
