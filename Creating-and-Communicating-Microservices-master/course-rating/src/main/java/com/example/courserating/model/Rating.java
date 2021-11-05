package com.example.courserating.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Rating {
    private String courseId;
    private Integer rating;

    public Rating() {
    }

    public Rating(String courseId, Integer rating) {
        this.courseId = courseId;
        this.rating = rating;
    }
}
