package com.example.books.controller;


import com.example.books.model.Book;
import com.example.books.model.UserBook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/courseId")
    public ResponseEntity<?> getCourseBooks(@PathVariable Long courseId){
        List<Book> courseBooks = new ArrayList<>();

        courseBooks.add(Book.builder().id(1L).title("Math").description("Mathematica").build());

        courseBooks.add(Book.builder().id(2L).title("Geo").description("Geography").build());

        courseBooks.add(Book.builder().id(3L).title("His").description("History").build());

        return ResponseEntity.ok(new UserBook(courseId, courseBooks));
    }
}
