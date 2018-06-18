package com.infoshare.oop;

import com.infoshare.oop.account.Account;
import com.infoshare.oop.card.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Card creditCard = new CreditCard("Child", "111222333",
                new BigDecimal(-23), new BigDecimal(100), CustomerType.COMPANY, "22");

        System.out.println("method .pay() in Card class' object:");
        System.out.println("method .pay() in CreditCard object:");

        try {
            creditCard.pay();

        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("CreditCard class object to String: " + creditCard.toString());

        Card debitCard = new DebitCard("Nowak", "99988887777",
                new BigDecimal(-9), CustomerType.INDIVIDUAL, "78");

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

        PrepaidCard prepaidCard = new PrepaidCard("283782728", "Kierepka",
                new BigDecimal(87737), CustomerType.COMPANY, "11", true);

        System.out.println("method .pay() in PrepaidCard object:");

        try {
            prepaidCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());

        }
        System.out.println("PrepaidCard class object to String: " + prepaidCard.toString());

        prepaidCard.transferToCard(BigDecimal.valueOf(700));

        //downcasting:
        ((CreditCard) creditCard).transferToCard(BigDecimal.valueOf(1000));

        //anonymous inner class - exercise 18:

        CanTransferTo myPrepaidCard = new CanTransferTo() {

            public void transferToCard(BigDecimal amount) {
                System.out.println("I am anonymous inner class!");


            }
        };

        myPrepaidCard.transferToCard(BigDecimal.valueOf(100));

        Account account = new Account("Karaś", "1111400287737222222", "100");
        System.out.println(account.toString());


    }
}
