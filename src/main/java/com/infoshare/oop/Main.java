package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.card.DebitCard;
import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Card newCREDIT = new CreditCard("15", "KARTA11", "1", new BigDecimal(8));
        DebitCard newDEBIT = new DebitCard("kartadebetowa", "123213");
        System.out.println(newCREDIT.toString());

        try {
            newCREDIT.pay();
            newDEBIT.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
