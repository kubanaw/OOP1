package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class CreditCard extends Card {
    protected final String creditLimit;

    public CreditCard(String creditLimit, String cardName, String cardNumber, BigDecimal balance) {
        super(cardName, cardNumber, balance);
        this.creditLimit = creditLimit;
        System.out.println("Zadanie 3");

    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }
@Override
    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("za malo srodkow na karcie kredytowej");
        }
        System.out.println("platnosc karta kredytowa");
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
