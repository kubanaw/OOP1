package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.card.DebitCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        //   Card card = new Card("Karta", "1234");
        CreditCard creditCard = new CreditCard("Karta kredytowa", "123", BigDecimal.ONE, new BigDecimal(200));

        DebitCard debitCard = new DebitCard("karta debetowa", "5534267345");
        // card.pay();
        // creditCard.pay();

        //   System.out.println(//card.toString());
        System.out.println(creditCard.toString());

        try {
            creditCard.pay();
            debitCard.pay();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}