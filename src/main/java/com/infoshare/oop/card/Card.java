package com.infoshare.oop.card;

import com.infoshare.oop.NotEnoughFundsException;
import javafx.scene.layout.BackgroundImage;

import java.math.BigDecimal;

public abstract class Card extends Product {

    //fields:

    protected String name;
    protected String cardNumber;
    protected BigDecimal balance;
    protected CustomerType customerType;

    //constructors:



    protected Card(String cardNumber, String name, String id) {
        super (id);
        this.cardNumber = cardNumber;
        this.name = name;
        this.balance = BigDecimal.ZERO;
        System.out.println("I am a constructor wit 2 arguments");

    }

    protected Card(String cardNumber, String name, BigDecimal balance, CustomerType customerType, String id) {

        this(cardNumber, name, id);
        this.balance = balance;
        this.customerType =customerType;
        System.out.println("I am constructor with 4 arguments");
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

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString())
                .append("Name: ").append(name).append("\n")
                .append("Card number: ").append(cardNumber).append("\n")
                .append("Balance: ").append(balance).append("\n")
                .append("Customer type: ").append(customerType).append("\n");
        return stringBuilder.toString();



//      return super.toString()+", Name: "+name + ", Card number: " + cardNumber + ", Balance: " + balance.toString()+", Customer type: "+customerType.toString();

        //we can also without .toString() on balance and customerType:
        //return "Name: "+name + ", Card number: " + cardNumber + ", Balance: " + balance+", Customer type: "+customerType;

    }
}
