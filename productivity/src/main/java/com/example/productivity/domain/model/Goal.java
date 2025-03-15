package com.example.productivity.domain.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Goal {
    private Long id;
    @Column(nullable = false, columnDefinition = "varchar(255)")
    private String subject;

    @Column(nullable = false, columnDefinition = "varchar(500)")
    private String content;
    
    // 이미지 최적화 관리하기
    private String image;

    @Column(nullable = false)
    private User userId;
    @Column(nullable = false)
    private Day dayId;
}
