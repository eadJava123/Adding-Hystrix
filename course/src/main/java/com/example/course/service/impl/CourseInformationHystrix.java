package com.example.course.service.impl;

import com.example.course.model.Course;
import com.example.course.model.UserCourse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseInformationHystrix implements com.example.course.service.CourseInformationHystrix {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    @HystrixCommand(
            fallbackMethod= "getByIdFallback",
            threadPoolKey= "getById",
            threadPoolProperties= {
                    @HystrixProperty(name="coreSize", value="100"),
                    @HystrixProperty(name="maxQueueSize", value="50"),

            })
    public List<Course> getById(Long userId) {
        UserCourse userCourses = restTemplate.getForObject("http://course-information/course/info" + userId, UserCourse.class);
        if(userCourses == null){
            return null;
        }
        return userCourses.getCourses();
    }

    public List<Course> getByIdFallback(Long userId){
        UserCourse userCourse = new UserCourse();
        userCourse.setUserId(userId);
        userCourse.setCourses(new ArrayList<>());
        return userCourse.getCourses();
    }

}
