package com.example.course.service;

import com.example.course.model.Course;
import java.util.List;

public interface CourseInfoService {
    List<Course> getUserCourses(Long userId);
}
