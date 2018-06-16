package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.card.DebitCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[]args) {
        System.out.println("Start");
        Card myCard = new Card("MojaKarta1","8888");
        CreditCard newCREDIT = new CreditCard("15", "KARTA11", "1", new BigDecimal(279));
        myCard.pay();
        System.out.println(myCard.toString());
        System.out.println(newCREDIT.toString());



    }

}
