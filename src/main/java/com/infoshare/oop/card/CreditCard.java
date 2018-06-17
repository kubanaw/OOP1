package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class CreditCard extends Card implements CanTransferTo {
    protected final String creditLimit;

    public CreditCard(String creditLimit, String cardName, String cardNumber, BigDecimal balance, CustomerType customerType) {
        super(cardName, cardNumber, balance, customerType);
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

    public void transferToCard(BigDecimal amount) {
        System.out.println("splata karty kredytowej");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
