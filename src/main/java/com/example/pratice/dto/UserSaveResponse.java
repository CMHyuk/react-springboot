package com.example.pratice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserSaveResponse {

    private final Long id;
    private final String email;
    private final String loginId;
    private final String password;

    @Builder
    public UserSaveResponse(Long id, String email, String loginId, String password) {
        this.id = id;
        this.email = email;
        this.loginId = loginId;
        this.password = password;
    }
}
