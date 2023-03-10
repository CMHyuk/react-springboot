package com.example.pratice;

import javax.persistence.*;

@Entity
public class Exercise {

    @Id @GeneratedValue
    @Column(name = "exercise_id")
    private Long id;

    private String title;

    @Lob
    private String content;

}
