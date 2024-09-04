package org.example.model;

import java.util.ArrayList;

public class Customer  {
    private String name;

    private String phoneNumber;
    private Integer walletAmount;

    ArrayList<Product> cart;


    public Customer(String name,  String phoneNumber, Integer walletAmount) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.walletAmount = walletAmount;
        cart = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(Integer walletAmount) {
        this.walletAmount = walletAmount;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", walletAmount=" + walletAmount +
                ", cart=" + cart +
                '}';
    }
}

