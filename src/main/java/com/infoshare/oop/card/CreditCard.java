package com.infoshare.oop.card;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private final BigDecimal creditLimit;

    public CreditCard(String name, String number, BigDecimal balance, BigDecimal creditLimit) {
        super(name, number, balance);
        this.creditLimit = creditLimit;
        System.out.println("Credit card initialization");
    }

    @Override
    public String toString() {
        return super.toString() + ", limit: " + creditLimit + "zł";
    }

    @Override
    public void pay () throws Exception {
        if (balance.compareTo(BigDecimal.ZERO) <=0) {
            throw new Exception("Zbyt malo srodkow na koncie aby zaplacic karta kredytowa!");
        }

        System.out.println("Platnosc karta kredytowa.");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
}
