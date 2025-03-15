package com.example.productivity.domain.model;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class User {
    private Long id;

    @Column(unique = true, length = 100, nullable = false)
    private String name;

    @Column(unique = true, length = 100, nullable = false)
    private String nickname;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String phone;

    private String image;
    private LocalDate birth;
    @Column(columnDefinition = "varchar(255) default 'USER'")
    private Role role;
    private Social socialType;
    private String socialMail;
}
