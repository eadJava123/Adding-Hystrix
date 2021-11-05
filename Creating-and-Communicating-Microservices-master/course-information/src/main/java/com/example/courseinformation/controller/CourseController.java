package com.example.courseinformation.controller;

import com.example.courseinformation.model.Course;
import com.example.courseinformation.model.UserCourse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course/info")
public class CourseController {

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserCourses(@PathVariable Long userId){
        List<Course> userCourses = new ArrayList<>();

        userCourses.add(Course.builder().id(1L).title("Math").description("Mathematica").price(100.0).build());

        userCourses.add(Course.builder().id(2L).title("Geo").description("Geography").price(150.0).build());

        userCourses.add(Course.builder().id(3L).title("His").description("History").price(100.0).build());

        return ResponseEntity.ok(new UserCourse(userId, userCourses));
    }
}
