package com.infoshare.oop.card;

public class Card {

    //fields:

    protected String name;
    protected String cardNumber;

    //constructor:

    public Card(String name, String cardNumber) {

        this.name = name;
        this.cardNumber = cardNumber;
        System.out.println("Check your card!");
    }

    //methods


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
