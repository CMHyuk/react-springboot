package com.example.pratice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ExerciseResponse {

    private final Long id;
    private final String title;
    private final String content;

    @Builder
    public ExerciseResponse(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
