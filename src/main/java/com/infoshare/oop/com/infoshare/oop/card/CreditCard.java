package com.infoshare.oop.com.infoshare.oop.card;

import com.infoshare.oop.Exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private final BigDecimal creditLimit;

    public CreditCard (String name, String number,BigDecimal balance, BigDecimal creditLimit) {
        super(name,number,balance);
        this.creditLimit = BigDecimal.ZERO;

    };

    public BigDecimal getCreditLimit() {
        return creditLimit;
        }

    @Override
    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("Zbyt mało środków na koncie do wykonania płatności Karta Kredytową!");
        }
        System.out.println("Platność kartą kredytową");
    }
//    @Override                                          ****** DO POPRAWY!
//    public String super toString(){
//        String daneKarty = creditLimit;
//        return super daneKarty;
//

}
