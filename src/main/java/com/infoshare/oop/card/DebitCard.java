package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard (String cardName, String cardNumber, BigDecimal balance, CustomerType customerType){
        super(cardName,cardNumber,balance, customerType);
    }
    public DebitCard(String cardName, String cardNumber){
        super(cardName,cardNumber);
    }
    @Override
    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("za malo srodkow na karcie debetowej");
        }
        System.out.println("platnosc karta debetowa");
    }
}