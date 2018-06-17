package com.infoshare.oop.card;

public abstract class Product {

    //fields:
    protected String id;

    //consructors:

    protected Product (String id) {
        this.id = id;
    }

    //getters and setters
    public String getId() {
        return id;
    }

    //others methods


    @Override
    public String toString() {
        return "Product ID: "+id;
    }
}
