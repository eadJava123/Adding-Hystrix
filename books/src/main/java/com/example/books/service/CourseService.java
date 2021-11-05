package com.example.books.service;

import com.example.books.model.Book;
import com.example.books.model.Course;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private BookService bookService;

    @HystrixCommand(
            fallbackMethod = "getBookCourseFallback",
            threadPoolKey = "getBookCourse",
            threadPoolProperties = {
                    @HystrixProperty(name="coreSize", value="100"),
                    @HystrixProperty(name="maxQueueSize", value="50"),
            })
    public Course getBookCourse(Long bookId) {
        Book book = bookService.getById(bookId);

        Course course = restTemplate.getForObject("http://course-app/course/getById?id=" + book.getCourseId().toString(), Course.class);
        System.out.println(course);
        return course;
    }

    public Course getBookCourseFallback(Long bookId) {
        return new Course(-1L, "not found", "not found", 0.0, 0.0);
    }
}
