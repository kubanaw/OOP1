package com.infoshare.oop.account;

import java.math.BigDecimal;

public class SavingAccount extends Account {

    //fields:

    protected BigDecimal transferFee;

    //constructor:

    public SavingAccount (String name, String number, String id, BigDecimal transferFee){
        super (name, number,id);
        this.transferFee =transferFee;
        System.out.println("I am an SavingAccount constructor!");

    }

    public BigDecimal getTransferFee() {
        return transferFee;
    }

    @Override
    public String toString(){
        return super.toString()+", Transfer fee is: "+transferFee;
    }
}
