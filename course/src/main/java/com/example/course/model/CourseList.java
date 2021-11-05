package com.example.course.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CourseList {
    private Long courseId;
    private String title;
    private String description;
    private Double price;
    private Integer rating;

}
