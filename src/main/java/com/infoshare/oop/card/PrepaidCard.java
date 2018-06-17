package com.infoshare.oop.card;


import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class PrepaidCard extends Card implements CanTransferTo {
    private boolean gift;

    public PrepaidCard(String cardName, String cardNumber, BigDecimal balance, CustomerType customerType, boolean gift){
        super(cardName, cardNumber, balance, customerType);
        this.gift = gift;
    }

    @Override
    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("za malo srodkow na karcie kredytowej");
        }
        System.out.println("platnosc karta kredytowa");
    }

    @Override
    public String toString(){
        return super.toString() + ", czy jest podarunkiem "+ gift;
    }

    public void transferToCard(BigDecimal amount) {
        System.out.println("doladowanie prepaid");
    }

    public boolean isGift(){
        return gift;
    }
}

