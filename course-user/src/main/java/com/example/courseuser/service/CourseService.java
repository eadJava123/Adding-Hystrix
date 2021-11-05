package com.example.courseuser.service;

import com.example.courseuser.model.Course;
import com.example.courseuser.model.CoursesDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(
            fallbackMethod = "getUserCoursesFallback",
            threadPoolKey = "getUserCourses",
            threadPoolProperties = {
                    @HystrixProperty(name="coreSize", value="100"),
                    @HystrixProperty(name="maxQueueSize", value="50"),
            })
    public CoursesDTO getUserCourses(List<Long> courseIds) {
        CoursesDTO coursesDTO = restTemplate.postForObject("http://course-app/course/getByIds", courseIds, CoursesDTO.class);
        return coursesDTO;
    }

    public CoursesDTO getUserCoursesFallback(List<Long> courseIds) {
        return new CoursesDTO();
    }
}
