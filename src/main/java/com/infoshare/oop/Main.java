package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.card.CustomerType;
import com.infoshare.oop.card.DebitCard;
import com.infoshare.oop.exceptions.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        //   Card card = new Card("Karta", "1234");
        CreditCard creditCard = new CreditCard("Karta kredytowa", "123", BigDecimal.ONE, new BigDecimal(200), CustomerType.INDIVIDUAL);

        DebitCard debitCard = new DebitCard("karta debetowa", "5534267345", new BigDecimal(500), CustomerType.COMPANY);


        // card.pay();
        // creditCard.pay();
        //   System.out.println(//card.toString());

        System.out.println(creditCard.toString());

        try {
            creditCard.pay();
            debitCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());


        }

    }
}