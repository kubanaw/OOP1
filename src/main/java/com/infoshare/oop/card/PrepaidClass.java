package com.infoshare.oop.card;

import com.infoshare.oop.NotEnoughFundsException;

import java.math.BigDecimal;

public class PrepaidClass extends Card {

    //fields
    private boolean gift;

    //constructors

    public PrepaidClass(String cardNumber, String name, BigDecimal balance, CustomerType customerType, boolean gift) {
        super(cardNumber, name, balance, customerType);
        this.gift = gift;

    }

    //methods

    //getters and setters

    public boolean isGift() {
        return gift;
    }

    @Override

    public void pay() throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Your balance on debit card is under 0");
        }
        System.out.println("You paid with Visa PREPAID card!");

    }

    @Override
    public String toString(){
        return "Name: "+name + ", Card number: " + cardNumber + ", Balance: " + balance+", Customer type: "+customerType+", Has gift: "+gift;

    }

}
