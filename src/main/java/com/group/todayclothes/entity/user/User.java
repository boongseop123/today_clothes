package com.group.todayclothes.entity.user;
//user객체를 만들어서 실제로 저장
public class User {
    private String id;
    private String password;
    private Integer age;
    private String name;
    private String gender;

    public User(String id, String password, Integer age, String name, String gender){
        if(id==null||id.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 id(%s)형식입니다",id));
        }
        this.id=id;
        this.password=password;
        this.age=age;
        this.name=name;
        this.gender=gender;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public String gener(){
        return gender;
    }
}
