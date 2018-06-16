package com.infoshare.oop.card;

import javafx.scene.layout.BackgroundImage;

import java.math.BigDecimal;

public class Card {

    //fields:

    protected String name;
    protected String cardNumber;
    protected BigDecimal balance;

    //constructors:

    public Card(){

    }


    public Card (String cardNumber, BigDecimal balance){
        this.cardNumber =cardNumber;
        balance =BigDecimal.ZERO;
        System.out.println("I am a constructor!");

    }

    public Card (String cardNumber, String name, BigDecimal balance){

        this (cardNumber, balance);
        this.name =name;
    }

public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
