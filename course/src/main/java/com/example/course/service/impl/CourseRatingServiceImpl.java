package com.example.course.service.impl;

import com.example.course.model.Rating;
import com.example.course.model.UserCourse;
import com.example.course.service.CourseRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CourseRatingServiceImpl implements CourseRatingService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CourseInformationHystrix courseInformationHystrix;
    @Override
    public Rating getCourseRating(Long courseId) {
//        UserCourse userCourses = restTemplate.getForObject("http://course-information/course/info" + courseId, UserCourse.class);
//        return (Rating) userCourses.getCourses();
        return(Rating) courseInformationHystrix.getById(courseId);

    }
}
