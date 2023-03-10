package com.example.pratice.service;

import com.example.pratice.dto.UserSaveRequest;
import com.example.pratice.dto.UserSaveResponse;
import com.example.pratice.entity.User;
import com.example.pratice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserSaveResponse saveUser(UserSaveRequest request) {
        User user = User.builder()
                .email(request.getEmail())
                .loginId(request.getLoginId())
                .password(request.getPassword())
                .build();

        User saveUser = userRepository.save(user);

        return UserSaveResponse.builder()
                .id(saveUser.getId())
                .email(saveUser.getEmail())
                .loginId(saveUser.getLoginId())
                .password(saveUser.getPassword())
                .build();
    }
}
