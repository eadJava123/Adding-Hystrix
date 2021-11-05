package com.example.course.service.impl;

import com.example.course.model.Course;
import com.example.course.model.CoursesDTO;
import com.example.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course getCoursesById(Long id) {
        return courseRepository.getCourseById(id);
    }

    public CoursesDTO getCoursesByIds(List<Long> ids) {
        CoursesDTO coursesDTO = new CoursesDTO();
        coursesDTO.setCourses(courseRepository.getCoursesByIdIn(ids));
        return coursesDTO;
    }
}
