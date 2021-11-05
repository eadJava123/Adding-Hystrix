package com.example.courseuser.repository;

import com.example.courseuser.model.UserCourse;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Registered
public interface UserCourseRepository extends JpaRepository<UserCourse, Long> {
    List<UserCourse> getUserCourseByUserId(Long userId);
}
