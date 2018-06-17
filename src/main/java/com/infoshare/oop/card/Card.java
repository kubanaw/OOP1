package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public abstract class Card {
    protected final String cardName;
    protected final String cardNumber;
    protected BigDecimal balance;
    protected CustomerType customerType;

    protected  Card (String cardName, String cardNumber, BigDecimal balance, CustomerType customerType){
       this(cardName, cardNumber);
       this.balance = balance;
       this.customerType = customerType;

    }

    protected Card (String cardName, String cardNumber)  {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        System.out.println("CARD INIT");
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }
    public abstract void pay () throws NotEnoughFundsException;

    @Override
    public String toString() {
        String daneKarty = cardName + cardNumber + balance + customerType;
        return daneKarty;

    }

}

