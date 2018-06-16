package com.infoshare.oop.com.infoshare.oop.card;

import java.math.BigDecimal;

public class Card {
    protected final String name;
    protected final String number;
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
//NADPISANIE metody z klasy OBJECT - toString - i teraz użycie jej w inny sposób:
    @Override
    public String toString(){
        String daneKarty = name + " " + number + " " + balance;
        return daneKarty;

    }

}
