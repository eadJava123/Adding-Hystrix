package com.example.courserating.controller;

import com.example.courserating.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{courseId}")
    public Rating getRatingByBookId(
            @PathVariable("courseId") String courseId) {

        return new Rating(courseId, 5);
    }
}