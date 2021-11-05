package com.example.courseinformation.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String title;
    @Column(name = "description")
    private String description;

//    public Course(String title, String description) {
//        this.title = title;
//        this.description = description;
//    }

}
