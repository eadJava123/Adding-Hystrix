package com.example.courseinformation.service.impl;

import com.example.courseinformation.model.Course;
import com.example.courseinformation.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public interface CourseService {
    List<Course> findAll();
//    List<Course> findAllByTitleContainingIgnoreCase(String filter);
    Course findById(Long id);
//    void save(Course course);
//    void deleteById(Long id);
}