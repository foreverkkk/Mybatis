package com.zk.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zk
 */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private  String gender;
    private int age;
    private String adress;
    private String qq;
    private String enail;

    public User() {
    }

    public User(int id, String username, String gender, int age, String adress, String qq, String enail) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.adress = adress;
        this.qq = qq;
        this.enail = enail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEnail() {
        return enail;
    }

    public void setEnail(String enail) {
        this.enail = enail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", qq='" + qq + '\'' +
                ", enail='" + enail + '\'' +
                '}';
    }
}
