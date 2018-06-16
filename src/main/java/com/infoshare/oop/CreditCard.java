package com.infoshare.oop;

import java.math.BigDecimal;

public class CreditCard extends Card {
    protected BigDecimal creditLimit;

    public CreditCard(String cardName, String cardNumber, BigDecimal saldo, BigDecimal creditLimit) {
        super(cardName, cardNumber, saldo);
        this.creditLimit = creditLimit;
        System.out.println("Utworzyłeś kartę kredytową");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

}
