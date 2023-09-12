package com.group.todayclothes.entity.user;

import lombok.Builder;

import javax.persistence.*;

@Entity//테이블과 링크될 클래스를 의미
//@Getter-->클래스 내 모든 필드의 getter 메소드 자동 생성
public class User {
    @Id//해당 테이블의 pk필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)//pk생성규칙-auto_increment
    private Long id;
    @Column(name="user_id")
    private String userId;
    @Column(name="user_pw")
    private String userPwd;
    @Column(name="user_gender")
    private String gender;
    @Column(name="user_age")
    private Integer age;

    protected User(){}//기본생성자 필요한 이유-공부하기//@NoArgsConstructor

    public Long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }
    @Builder//빌더클래스/생성자 주입--settter와 차이점은?
    public User(String userId, String userPwd, String gender, Integer age ){
        this.userId=userId;
        this.userPwd=userPwd;
        this.age=age;
        this.gender=gender;
    }
}
