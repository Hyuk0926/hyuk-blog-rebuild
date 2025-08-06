package com.example.hyuk_blog.dto.admin;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminCreateRequestDto {

    @NotBlank(message = "관리자 아이디를 입력해주세요.")
    @Size(min = 4, max = 15, message = "아이디는 4자 이상 15자 이하로 입력해주세요.")
    private String username;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Size(min = 8, message = "비밀번호는 8자 이상으로 입력해주세요.")
    private String password;

    @NotBlank(message = "이름을 입력해주세요.")
    private String name;

    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;
} 