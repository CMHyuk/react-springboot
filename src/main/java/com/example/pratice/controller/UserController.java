package com.example.pratice.controller;

import com.example.pratice.dto.UserSaveRequest;
import com.example.pratice.dto.UserSaveResponse;
import com.example.pratice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/save")
    public UserSaveResponse save(@RequestBody @Valid UserSaveRequest request) {
        return userService.saveUser(request);
    }
}
