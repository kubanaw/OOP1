package com.infoshare.oop.card;

import java.math.BigDecimal;

public class DebitCard extends Card{

    //fields:



    //constructors (base on Card's constructors):

    public DebitCard (String cardNumber, BigDecimal balance){

        super(cardNumber,balance);
    }


    public DebitCard(String name, String cardNumber, BigDecimal balance){

        super (cardNumber, name, balance);

    }


    //methods:
    @Override

    public void pay(){

        System.out.println("You paid with Visa DEBIT card!");
    }




}
