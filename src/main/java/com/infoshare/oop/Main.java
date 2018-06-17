package com.infoshare.oop;

import com.infoshare.oop.card.*;
import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Card newCREDIT = new CreditCard("15", "KARTA11", "1", new BigDecimal(8), CustomerType.COMPANY);
        DebitCard newDEBIT = new DebitCard("kartadebetowa", "123213", new BigDecimal(5), CustomerType.INDYVIDUAL);
        System.out.println(newCREDIT.toString());

        CanTransferTo myNewObject = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("anonimow klasy wew");
            }
        };
        try {
            newCREDIT.pay();
            newDEBIT.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
