package com.infoshare.oop.com.infoshare.oop.card;

import java.math.BigDecimal;

public class DebitCard extends Card {

    private final BigDecimal debtLimit;

    public DebitCard (String name, String number, BigDecimal balance, BigDecimal debtLimit) {
        super(name, number, balance);
        this.debtLimit =BigDecimal.ZERO;
    }

    @Override
    public String toString(){
        String komunikat = "Platnosc karta debetową: " + name + " " + number + " " + balance + " " + debtLimit;
        return komunikat;

    }
//    @Override
//    public void pay(){
//        System.out.println("Platność kartą debetową");
//    }

}