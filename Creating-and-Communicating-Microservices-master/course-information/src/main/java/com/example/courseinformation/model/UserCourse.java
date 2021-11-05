package com.example.courseinformation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCourse {
    private Long userId;
    private List<Course> courses;
}
