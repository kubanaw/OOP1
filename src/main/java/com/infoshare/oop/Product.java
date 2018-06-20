package com.infoshare.oop;

public abstract class Product {
    protected String id;

    protected Product() {
        id = "0";
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return getId();
    }
}
