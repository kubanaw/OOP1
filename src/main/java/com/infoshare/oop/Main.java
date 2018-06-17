package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.card.CustomerType;
import com.infoshare.oop.card.DebitCard;
import jdk.nashorn.internal.runtime.regexp.joni.ast.CClassNode;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Card creditCard = new CreditCard("Child", "111222333",
                new BigDecimal(-23), new BigDecimal(100), CustomerType.COMPANY);

        System.out.println("method .pay() in Card class' object:");
        System.out.println("method .pay() in CreditCard object:");

        try {
            creditCard.pay();

        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("CreditCard class object to String: " + creditCard.toString());

        Card debitCard = new DebitCard("Nowak", "99988887777",
                new BigDecimal(-9), CustomerType.INDIVIDUAL);

        System.out.println("method .pay() in DebitCard object:");

        try {
            debitCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("DebitCard class object to String: " + debitCard.toString());

        /*try {
            debitCard.pay();
        } catch (NotEnoughFundsException e) {
            throw new IllegalStateException("Message", e);


        }*/


    }
}
