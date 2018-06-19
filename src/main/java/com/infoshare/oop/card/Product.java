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

        //more efficient way is to use StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product ID: ").append(id).append("\n");

//        return "Product ID: "+id;
        return stringBuilder.toString();
    }
}
