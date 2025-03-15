package com.example.productivity.domain.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Day {
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(columnDefinition = "default 'FAIR'")
    private Satisfaction satisfaction;

    @Column(nullable = false)
    private User userId;
}
