package com.example.courseinformation.repository;

import com.example.courseinformation.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

//    @Query(value = "SELECT * FROM COURSE", nativeQuery = true)
    List<Course> findAll();

}
