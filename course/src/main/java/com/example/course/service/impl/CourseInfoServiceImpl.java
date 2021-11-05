package com.example.course.service.impl;

import com.example.course.model.Course;
import com.example.course.model.UserCourse;
import com.example.course.service.CourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CourseInfoServiceImpl implements CourseInfoService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CourseInformationHystrix courseInformationHystrix;

    @Override
    public List<Course> getUserCourses(Long userId) {
        return courseInformationHystrix.getById(userId);
    }
}
