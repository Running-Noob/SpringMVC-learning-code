package com.f.springmvc.pojo;

/**
 * @author fzy
 * @date 2024/2/4 22:06
 */
public class User {
    private String uname;
    private int uage;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }

    public User() {
    }

    public User(String uname, int uage) {
        this.uname = uname;
        this.uage = uage;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }
}
