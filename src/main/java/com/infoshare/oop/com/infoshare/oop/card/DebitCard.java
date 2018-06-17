package com.infoshare.oop.com.infoshare.oop.card;

import com.infoshare.oop.Exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class DebitCard extends Card {

    private final BigDecimal debtLimit;

    public DebitCard (String name, String number, BigDecimal balance, BigDecimal debtLimit, CustomerType customerType) {
        super(name, number, balance, customerType);
        this.debtLimit = BigDecimal.ZERO;
    }

    @Override
    public String toString(){
        String komunikat = "Platnosc karta debetową: " +  debtLimit + " " + super.toString();
        return komunikat;

    }
    @Override
    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("Zbyt mało środków na koncie do wykonania platności Karta Debetowa!");
        }
        System.out.println("Platność kartą debetową");
    }

}
