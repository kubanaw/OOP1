package com.infoshare.oop.card;

public abstract class Product {
    protected String id;

    protected Product (String id) {
        this.id = id;
    }
public String getId() {
        return id;
    }
    @Override
    public String toString () {
        return "id: "+id+", ";
    }

}
