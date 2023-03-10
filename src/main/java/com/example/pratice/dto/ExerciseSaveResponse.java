package com.example.pratice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ExerciseSaveResponse {

    private final Long id;
    private final String title;
    private final String content;
    private final String loginId;

    @Builder
    public ExerciseSaveResponse(Long id, String title, String content, String loginId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.loginId = loginId;
    }
}
