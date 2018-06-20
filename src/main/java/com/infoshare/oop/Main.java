package com.infoshare.oop;

import com.infoshare.oop.account.Account;
import com.infoshare.oop.card.*;
import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Card creditCard = new CreditCard("1","Karta kredytowa", "123",
                BigDecimal.ONE, new BigDecimal(200), CustomerType.COMPANY);
        Card debitCard = new DebitCard("2", "Karta debetowa", "12345",
                new BigDecimal("500"), CustomerType.INDIVIDUAL);
        CanTransferTo prepaidCard = new PrepaidCard("3", "Karta przedpłacona", "123456",
                new BigDecimal("150"), CustomerType.INDIVIDUAL, true);
        Account account = new Account("4", "Malczewski", "34567899876543");


        try {
            creditCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            debitCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(debitCard.toString());
        System.out.println(creditCard.toString());
        System.out.println(prepaidCard.toString());
        System.out.println(account.toString());

        prepaidCard.transferToCard(BigDecimal.ZERO);

        CanTransferTo canTransferTo = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Transfer to product");
            }
        };
    }
}
