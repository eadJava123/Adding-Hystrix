package com.example.course.controller;


import com.example.course.model.Course;
import com.example.course.model.CourseList;
import com.example.course.model.Rating;
import com.example.course.service.CourseInfoService;
import com.example.course.service.CourseRatingService;
import com.example.course.service.impl.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseListController {

    @Autowired
    private CourseInfoService courseInfoService;

    @Autowired
    private CourseRatingService courseRatingService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/{userId}")
    public ResponseEntity<?> getCourseList(@PathVariable Long userId){
        List<Course> userCourses = courseInfoService.getUserCourses(userId);

        List<CourseList> userCourseList = new ArrayList<>();
        for(Course course: userCourses){
            CourseList courseList = new CourseList();
            courseList.setCourseId(course.getId());
            courseList.setTitle(course.getTitle());
            courseList.setPrice(course.getPrice());
            courseList.setDescription(course.getDescription());

            Rating rating = courseRatingService.getCourseRating(course.getId());
            courseList.setRating(rating.getRating());
            userCourseList.add(courseList);
        }
        return ResponseEntity.ok(userCourseList);
    }

    @GetMapping("/getById")
    public ResponseEntity<?> getCoursesById(@RequestParam("id") Long courseIds) {
        return ResponseEntity.ok(courseService.getCoursesById(courseIds));
    }

    @PostMapping("/getByIds")
    public ResponseEntity<?> getCoursesByIdList(@RequestBody() List<Long> courseIds) {
        return ResponseEntity.ok(courseService.getCoursesByIds(courseIds));
    }
}
