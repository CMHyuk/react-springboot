package com.example.pratice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.REMOVE;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter @Setter
@Table(name = "users")
@NoArgsConstructor(access = PROTECTED)
public class User extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String email;
    private String loginId;
    private String password;

    @OneToMany(mappedBy = "user", cascade = REMOVE)
    private List<Exercise> exercises = new ArrayList<>();

    @Builder
    public User(String email, String loginId, String password) {
        this.email = email;
        this.loginId = loginId;
        this.password = password;
    }
}
