package com.infoshare.oop.card;

import com.infoshare.oop.NotEnoughFundsException;

import java.math.BigDecimal;

public class DebitCard extends Card{

    //fields:



    //constructors (base on Card's constructors):

    public DebitCard (String cardNumber, String name){

        super(cardNumber,name);
    }


    public DebitCard(String cardnumber, String name, BigDecimal balance){

        super (cardnumber, name, balance);

    }


    //methods:

    @Override
    public void pay () throws NotEnoughFundsException {
        if(balance.compareTo(BigDecimal.ZERO)<0){
            throw new NotEnoughFundsException("Your balance on debit card is under 0");
        }
        System.out.println("You paid with Visa CREDIT card!");

    }




}
