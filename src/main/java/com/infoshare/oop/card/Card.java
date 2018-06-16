package com.infoshare.oop.card;

import com.infoshare.oop.NotEnoughFundsException;
import javafx.scene.layout.BackgroundImage;

import java.math.BigDecimal;

public abstract class Card {

    //fields:

    protected  String name;
    protected   String cardNumber;
    protected   BigDecimal balance;

    //constructors:



    protected Card(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
        System.out.println("I am a constructor wit 2 arguments");

    }

    protected Card(String cardNumber, String name, BigDecimal balance) {

        this(cardNumber, name);
        this.balance = balance;
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

    public abstract void pay() throws NotEnoughFundsException; //abstract class

    @Override
    public String toString() {

        return name+", "+cardNumber+", "+balance.toString();

    }
}
