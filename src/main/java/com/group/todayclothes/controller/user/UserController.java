package com.group.todayclothes.controller.user;


import com.group.todayclothes.dto.user.UserDTO;
import com.group.todayclothes.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @PostMapping("/user/register")
    public void registerUser(@RequestBody UserDTO userDTO){

        userService.registerUser(userDTO);
    }
    @PostMapping("/user/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO) {
        return userService.login(userDTO.getUserId(), userDTO.getUserPwd());
    }

}
