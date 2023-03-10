package com.example.pratice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter @Setter
public class UserSaveRequest {

    @Email(message = "이메일 형식에 맞게 입력하세요.")
    private String email;

    @NotBlank(message = "아이디를 입력하세요.")
    @Pattern(regexp = "^[a-zA-Z]{1}[a-zA-Z0-9]{8,12}$",
            message = "아이디는 영문 + 숫자 조합으로 8 ~ 12자리를 입력해주세요.")
    private String loginId;

    @NotBlank(message = "비밀번호를 입력하세요.")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z]).{8,16}$",
            message = "비밀번호는 영문 + 숫자 조합으로 8 ~ 16자리를 입력해주세요.")
    private String password;
}
