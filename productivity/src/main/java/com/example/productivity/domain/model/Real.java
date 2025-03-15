package com.example.productivity.domain.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Real {
    private Long id;
    @Column(nullable = false, columnDefinition = "varchar(255)")
    private String subject;

    @Column(nullable = false, columnDefinition = "varchar(500)")
    private String content;
    private String image;

    @Column(nullable = false)
    private User userId;

    @Column(nullable = false)
    private Day dayId;
}
