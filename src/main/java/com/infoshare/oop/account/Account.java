package com.infoshare.oop.account;

import com.infoshare.oop.card.Product;

public class Account extends Product {

    //fields:
    protected String name;
    protected String number;

    //constructor:

    public Account (String name, String number, String id){
        super(id);
        this.name = name;
        this.number = number;
        System.out.println("I am an Account constructor!");
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString())
                .append("Account name: ").append(name).append("\n")
                .append("Account number: ").append(number).append("\n");
        return stringBuilder.toString();

//        return super.toString()+", Account name: "+name+", Account number: "+number;
    }
}
