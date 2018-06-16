package com.infoshare.oop.com.infoshare.oop.card;

import java.math.BigDecimal;

public class Card {
    protected String name;
    protected String number;
    protected BigDecimal balance;

    public Card(String name, String number) {
        this.name = name;
        this.number = number;
        this.balance = BigDecimal.ZERO;
    };
    public Card(String name, String number, BigDecimal balance) {
        this(name,number);
        this.balance = balance;
    }


    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public void pay () {
        System.out.println("Platność kartą");

    }


}
