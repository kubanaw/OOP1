package com.infoshare.oop.com.infoshare.oop.card;

import com.infoshare.oop.Exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class PrepaidCard extends Card implements CanTransferTo {

    /*Deklaracja pryatnego pola*/ private final boolean gift;

    public PrepaidCard(String name, String number, BigDecimal balance, CustomerType customerType , boolean gift) {
        super(name,number,balance,customerType);
        this.gift = gift;
    }

    public boolean isGift() {
        return gift;
    }
    @Override
    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("Zbyt mało środków na koncie do wykonania platności!");
        }
        System.out.println("Platność kartą przedplaconą");

    }
    @Override
    public String toString() {
        return super.toString() + "Czy podarunek " + gift;
    }


    public void transferToCard(BigDecimal amount) {
        System.out.println(" Doładowanie karty PrePaid");
    }
}
