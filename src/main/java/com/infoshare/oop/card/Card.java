package com.infoshare.oop.card;

import java.math.BigDecimal;

public class Card {
    protected final String cardName;
    protected final String cardNumber;
    protected BigDecimal balance;

    public Card (String cardName, String cardNumber, BigDecimal balance){
       this(cardName, cardNumber);
        this.balance = balance;
    }

    public Card (String cardName, String cardNumber)  {
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
    public void pay (){
        System.out.println("platnosc karta");
    }

    @Override
    public String toString() {
        String daneKarty = cardName + cardNumber + balance;
        return daneKarty;

    }
}

