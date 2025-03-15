package com.example.productivity.domain.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Follow {
    private Long id;

    @Column(nullable = false)
    private User following;

    @Column(nullable = false)
    private User follower;
}
