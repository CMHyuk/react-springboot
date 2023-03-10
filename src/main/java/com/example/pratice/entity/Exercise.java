package com.example.pratice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter @Setter
@NoArgsConstructor(access = PROTECTED)
public class Exercise extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "exercise_id")
    private Long id;

    private String title;

    @Lob
    private String content;

    @ManyToOne(fetch = LAZY, cascade = PERSIST)
    private User user;

    @Builder
    public Exercise(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.setUser(user);
        user.getExercises().add(this);
    }
}
