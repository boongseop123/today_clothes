package com.group.todayclothes.service.user;

import com.group.todayclothes.dto.user.UserDTO;
import com.group.todayclothes.entity.user.User;
import com.group.todayclothes.entity.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class UserService {

    private final UserRepository userRepository;//db통신에 필요한 Repository주입

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Transactional
    public void registerUser(UserDTO userDTO){
        userRepository.save(new User(
                userDTO.getUserId(),
                userDTO.getUserPwd(),
                userDTO.getGender(),
                userDTO.getAge()
        ));
    }
    public ResponseEntity<String> login(String userId, String userPwd) {
        User user = userRepository.findByUserIdAndUserPwd(userId,userPwd);
        if (user != null) {
            // 로그인 성공
            return ResponseEntity.ok("로그인 성공");
        } else {
            // 로그인 실패
            return ResponseEntity.badRequest().body("로그인 실패");
        }
    }
}
