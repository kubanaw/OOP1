package com.infoshare.oop.card;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard (String cardName, String cardNumber, BigDecimal balance){
        super(cardName,cardNumber,balance);
    }
    public DebitCard(String cardName, String cardNumber){
        super(cardName,cardNumber);
    }
    @Override
    public void pay() throws Exception {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new Exception("za malo srodkow na karcie debetowej");
        }
        System.out.println("platnosc karta debetowa");
    }
}