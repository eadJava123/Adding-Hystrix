package com.example.books.service;

import com.example.books.model.Book;
import com.example.books.model.Course;
import com.example.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CourseService courseService;

    public List<Book> getByCourseId(Long courseId) {
        return bookRepository.getBooksByCourseId(courseId);
    }

    public Course getBookCourse(Long bookId) {
        return courseService.getBookCourse(bookId);
    }

    public Book getById(Long id) {
        return bookRepository.getBookById(id);
    }
}
