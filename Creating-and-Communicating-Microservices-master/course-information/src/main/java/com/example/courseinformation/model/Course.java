package com.example.courseinformation.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Course {
    private Long id;
    private String title;
    private String description;
    private Double price;

}
