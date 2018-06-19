package com.infoshare.oop.card;

import com.infoshare.oop.NotEnoughFundsException;

import java.math.BigDecimal;

public class PrepaidCard extends Card implements CanTransferTo {

    //fields
    private boolean gift;

    //constructors

    public PrepaidCard(String cardNumber, String name, BigDecimal balance, CustomerType customerType, String id, boolean gift) {
        super(cardNumber, name, balance, customerType, id);
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

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString())
                .append("Has gift: ").append(gift).append("\n");
        return stringBuilder.toString();
//        return "Name: "+name + ", Card number: " + cardNumber + ", Balance: " + balance+", Customer type: "+customerType+", Has gift: "+gift;

    }

    public void transferToCard(BigDecimal amount){
        System.out.println("Amount on Prepaid Card: "+amount);
    }

}
