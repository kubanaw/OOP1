package com.infoshare.oop.card;

import java.math.BigDecimal;

public class CreditCard extends Card {

    //fields
    protected final BigDecimal creditLimit;

    //constructors


    public CreditCard(String name, String cardNumber, BigDecimal balance, BigDecimal creditLimit) {

        super(cardNumber, name, balance);
        this.creditLimit = creditLimit;
        System.out.println("I am a child class constructor!");
    }


    //methods:


    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    @Override

    public void pay() {
        System.out.println("You paid with Visa CREDIT card!");
    }
    @Override

    public String toString(){

        return super.toString()+", "+" limit: "+creditLimit.toString();
    }
}
