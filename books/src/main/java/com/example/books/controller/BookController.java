package com.example.books.controller;


import com.example.books.model.Book;
import com.example.books.model.UserBook;
import com.example.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getCourseBooks")
    public ResponseEntity<?> getCourseBooks(@RequestParam("courseId") Long courseId){
        return ResponseEntity.ok(bookService.getByCourseId(courseId));
    }

    @GetMapping("/getCourseBook")
    public ResponseEntity<?> getCoursesWhereUseBook(@RequestParam("bookId") Long bookId){
        return ResponseEntity.ok(bookService.getBookCourse(bookId));
    }
}
