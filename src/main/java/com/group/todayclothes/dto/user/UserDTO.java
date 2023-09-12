package com.group.todayclothes.dto.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class UserDTO {

    @NotBlank(message = "아이디를 입력해주세요.")
    private String userId;
    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String userPwd;
    @NotBlank(message = "성별을 입력해주세요.")
    private String gender;
    @NotBlank(message = "나이를 입력해주세요.")
    private String age;


}
