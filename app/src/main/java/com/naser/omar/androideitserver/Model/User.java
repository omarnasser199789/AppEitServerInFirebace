package com.naser.omar.androideitserver.Model;

/**
 * Created by OmarNasser on 1/23/2018.
 */

public class User {
    private String Name;
    private String Password;
    private String Phone;


    public User() {

    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public User(String name, String password) {

        Name = name;
        Password = password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }
}
