package com.infoshare.oop.card;

import javafx.scene.layout.BackgroundImage;

import java.math.BigDecimal;

public class Card {

    //fields:

    protected  String name;
    protected   String cardNumber;
    protected   BigDecimal balance;

    //constructors:

    public Card() {

    }


    public Card(String cardNumber, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.balance = BigDecimal.ZERO;
        System.out.println("I am a constructor wit 2 arguments");

    }

    public Card(String cardNumber, String name, BigDecimal balance) {

        this(cardNumber, balance);
        this.name = name;
        System.out.println("I am constructor with 3 arguments");
    }

    //getters and setters:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    //methods:

    public void pay(){

        System.out.println("You paid with Visa card!");
    }

    @Override
    public String toString() {

        return name+", "+cardNumber+", "+balance.toString();

    }
}
