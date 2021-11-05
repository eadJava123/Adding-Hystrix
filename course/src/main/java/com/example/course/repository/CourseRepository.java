package com.example.course.repository;

import com.example.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> getCoursesByIdIn(List<Long> ids);
    Course getCourseById(Long id);
}
