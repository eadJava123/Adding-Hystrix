package com.example.course.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseList {
    private Long courseId;
    private String title;
    private String description;
    private Double price;
    private Integer rating;

}
