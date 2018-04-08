package com.naser.omar.androideitserver.Model;

import java.util.List;

/**
 * Created by OmarNasser on 1/29/2018.
 */

public class Request {
    private String phone;
    private String name;
    private String address;
    private String tooal;
    private String status;
    private List<Order> foods;//list of food order

    public Request() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTooal() {
        return tooal;
    }

    public void setTooal(String tooal) {
        this.tooal = tooal;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }

    public Request(String phone, String name, String address, String tooal, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.tooal = tooal;
        this.foods = foods;
        this.status="0"; //Default is 0 , 0:placed, 1:shipping, 2:Shipped
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
