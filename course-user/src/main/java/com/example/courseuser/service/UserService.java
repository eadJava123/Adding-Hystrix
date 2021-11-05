package com.example.courseuser.service;

import com.example.courseuser.model.Course;
import com.example.courseuser.model.CoursesDTO;
import com.example.courseuser.model.CustomUser;
import com.example.courseuser.model.UserCourse;
import com.example.courseuser.repository.UserCourseRepository;
import com.example.courseuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserCourseRepository userCourseRepository;
    @Autowired
    private CourseService courseService;


    public List<Course> getUserCourses(String username) {
        CustomUser user = userRepository.getUserByUsername(username);

        List<UserCourse> userCourseList = userCourseRepository.getUserCourseByUserId(user.getId());

        List<Long> courseIds = new ArrayList<>();

        for (UserCourse userCourse : userCourseList) {
            courseIds.add(userCourse.getCourseId());
        }

        CoursesDTO coursesDTO = courseService.getUserCourses(courseIds);
        return coursesDTO.getCourses();
    }
}
