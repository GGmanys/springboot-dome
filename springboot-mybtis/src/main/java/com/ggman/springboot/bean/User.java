package com.ggman.springboot.bean;

/**
 * 用户表
 */
public class User {
    private  long id;
    private  String UserName;
    private  String UserPassword;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public User() {
    }

    public User(long id, String userName, String userPassword) {
        this.id = id;
        UserName = userName;
        UserPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                '}';
    }
}
