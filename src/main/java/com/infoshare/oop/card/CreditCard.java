package com.infoshare.oop.card;

import java.math.BigDecimal;

public class CreditCard extends Card {
    protected String creditLimit;

    public CreditCard (String creditLimit, String cardName, String cardNumber, BigDecimal balance) {
        super(cardName, cardNumber, balance);
        this.creditLimit = creditLimit;
        System.out.println("Zadanie 3");

    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }
    public void pay (){
        System.out.println("platnosc karta");
    }
}
