package com.example.courseuser.controller;

import com.example.courseuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserCourses")
    public ResponseEntity<?> getUserCourses(@RequestParam("username") String username) {
        return ResponseEntity.ok(userService.getUserCourses(username));
    }
}
