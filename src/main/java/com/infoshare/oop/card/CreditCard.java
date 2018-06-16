package com.infoshare.oop.card;

import java.math.BigDecimal;

public class CreditCard extends Card {

    //fields
    protected BigDecimal creditLimit;

    //constructors


    public CreditCard(String name, String cardNumber, BigDecimal balance, BigDecimal creditLimit){

        super (cardNumber, name, balance);
        this.creditLimit =creditLimit;
        System.out.println("I am a child class constructor!");
    }


    //methods:


    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
}
