package com.infoshare.oop.card;

import com.infoshare.oop.NotEnoughFundsException;

import java.math.BigDecimal;

public class CreditCard extends Card {

    //fields
    protected final BigDecimal creditLimit;

    //constructors

    public CreditCard(String name, String cardNumber, BigDecimal balance, BigDecimal creditLimit, CustomerType customerType) {

        super(cardNumber, name, balance, customerType);
        this.creditLimit = creditLimit;
        System.out.println("I am a child class constructor!");
    }


    //methods:


    public BigDecimal getCreditLimit() {
        return creditLimit;
    }


    @Override
    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Your balance on credit card is under 0");
        }
        System.out.println("You paid with Visa CREDIT card!");

    }

    @Override

    public String toString() {

        return super.toString() + ", " + " limit: " + creditLimit.toString();
    }
}
