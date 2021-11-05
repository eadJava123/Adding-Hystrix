package com.example.course.service;


import com.example.course.model.Course;

import java.util.List;

public interface CourseInformationHystrix {
    List<Course> getById(Long userId);
}
