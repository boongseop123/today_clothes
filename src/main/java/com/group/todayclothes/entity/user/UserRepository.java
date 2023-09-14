package com.group.todayclothes.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;

//jpa인터베이스 상속--><entity클래스와 PK타입>
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserIdAndUserPwd(String userId, String userPwd);
}
