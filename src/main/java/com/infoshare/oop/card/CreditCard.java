package com.infoshare.oop.card;

import com.infoshare.oop.exceptions.NotEnoughFundsException;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private final BigDecimal creditLimit;

    public CreditCard(String name, String number, BigDecimal balance, BigDecimal creditLimit, CustomerType customerType) {
        super(name, number, balance, customerType);
        this.creditLimit = creditLimit;
        System.out.println("Credit card initialization");
    }

    @Override
    public String toString() {
        return super.toString() + ", limit: " + creditLimit + "zł";
    }

    @Override
    public void pay () throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) <=0) {
            throw new NotEnoughFundsException("Zbyt malo srodkow na koncie aby zaplacic karta kredytowa!");
        }

        System.out.println("Platnosc karta kredytowa.");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
}
