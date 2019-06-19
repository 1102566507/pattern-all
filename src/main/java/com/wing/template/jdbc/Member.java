package com.wing.template.jdbc;


public class Member {

    private String userName;
    private String passWord;


    private int age;
    private String nickName;
    private String addr;


    public Member(String userName, int age, String nickName, String addr) {
        this.userName = userName;
        this.age = age;
        this.nickName = nickName;
        this.addr = addr;
    }

    public Member() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
