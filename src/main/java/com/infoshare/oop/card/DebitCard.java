package com.infoshare.oop.card;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String name, String number, BigDecimal balance) {
        super(name, number, balance);

    }

    public DebitCard(String name, String number) {
        super(name, number);
    }


    @Override
    public void pay() throws Exception{
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Exception("Zbyt malo srodkow na koncie aby zaplacic karta debetowa!");

        }
        System.out.println("Platnosc karta Debetowa.");

    }

}
