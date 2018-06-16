package com.infoshare.oop.com.infoshare.oop.card;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private BigDecimal creditLimit;

    public CreditCard (String name, String number,BigDecimal balance, BigDecimal creditLimit) {
        super(name,number,balance);
        this.creditLimit = BigDecimal.ZERO;
    };

    public BigDecimal getCreditLimit() {
        return creditLimit;
        }
    @Override
    public void pay(){
        System.out.println("Platność kartą kredytową");
    }

}
