package com.hhh.springbootmybatis.pojo;

import java.util.Objects;

public class User {
    String userName;
    String passWord;
    String name;
    String gender;
    int age;
    String phone;
    String email;
    String headImage;
    int money;
    int num;
    int time;

    public User(String userName, String passWord, String name, String gender, int age, String phone, String email, String headImage, int money, int num, int time) {
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.headImage = headImage;
        this.money = money;
        this.num = num;
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                getMoney() == user.getMoney() &&
                getNum() == user.getNum() &&
                getTime() == user.getTime() &&
                Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getPassWord(), user.getPassWord()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getGender(), user.getGender()) &&
                Objects.equals(getPhone(), user.getPhone()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getHeadImage(), user.getHeadImage());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserName(), getPassWord(), getName(), getGender(), getAge(), getPhone(), getEmail(), getHeadImage(), getMoney(), getNum(), getTime());
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", headImage='" + headImage + '\'' +
                ", money=" + money +
                ", num=" + num +
                ", time=" + time +
                '}';
    }
}
