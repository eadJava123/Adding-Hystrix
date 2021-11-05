package com.example.course_chat.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseChat {
    private Long id;
    private String name;
    private String courses;
}

