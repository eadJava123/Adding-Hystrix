package com.example.books.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBook {
    private Long courseId;
    private List<Book> books;

}
//@Data
//@NoArgsConstructor
//@Getter
//@Setter