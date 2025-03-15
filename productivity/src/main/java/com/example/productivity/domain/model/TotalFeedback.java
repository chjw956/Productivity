package com.example.productivity.domain.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TotalFeedback {
    private Long id;

    @Column(columnDefinition = "default 0")
    private int similarity;

    @Column(columnDefinition = "varchar(500)")
    private String content;

    @Column(nullable = false)
    private User userId;
}
