package com.example.courseinformation.controller;

import com.example.courseinformation.model.Course;
import com.example.courseinformation.repository.CourseRepository;
import com.example.courseinformation.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CourseController {

    @Autowired
    private CourseServiceImpl courseServiceImpl;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
//        Iterable<Course> courses;
//        courses = courseServiceImpl.findAll();
        List<Course> counts = new ArrayList<>();
        courseServiceImpl.findAll().forEach(counts::add);
        return counts;
//        return courseServiceImpl.findAll();
    }



    @GetMapping(path="/all")
    public @ResponseBody Iterable<Course> getAllUsers() {
        // This returns a JSON or XML with the users
        return courseRepository.findAll();
    }
//    @GetMapping("/courses/{title}")
//    public Iterable<Course> allCoursesByTitle(@PathVariable String title) {
//        Iterable<Course> courses;
//        courses = courseServiceImpl.findAll(title);
//        return courses;
//    }
    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable int id) {
        Course course;
        course = courseServiceImpl.findById(id);
        return course;
    }


}
