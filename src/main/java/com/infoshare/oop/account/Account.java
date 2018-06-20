package com.infoshare.oop.account;

import com.infoshare.oop.Product;

public class Account extends Product {

    protected String name;
    protected int number;

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {

    }
}
