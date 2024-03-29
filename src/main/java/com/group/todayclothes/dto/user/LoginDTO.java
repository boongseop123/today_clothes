package com.group.todayclothes.dto.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginDTO {
    @NotEmpty(message="아이디를 입력하세요")
    private String userId;
    @NotEmpty(message = "비밀번호를 입력하세요")
    private String userPwd;
}
