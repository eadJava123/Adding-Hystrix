package com.example.books.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class Book {
    private Long id;
    private String title;
    private String description;
    private String courses;
}
