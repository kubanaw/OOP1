package com.infoshare.oop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Card karta = new Card("Karta Abc", "123456789");
        karta.getName();
        karta.getNumber();


        System.out.println(karta.getName());
        System.out.println(karta.getNumber());

        Card karta2 = new Card("Karta Def", "987654321");
        System.out.println(karta2.getName());
        System.out.println(karta2.getNumber());

        Card karta3 = new Card("Karta Ghj", "103456", BigDecimal.valueOf(111));
        System.out.println(karta2.getName());
        System.out.println(karta2.getNumber());

        CreditCard kartakredytowa1 = new CreditCard("Karta kredytowa1", "11213212", BigDecimal.valueOf(222), BigDecimal.valueOf(66665));

        karta2.pay();
        kartakredytowa1.pay();
        System.out.println(karta2.toString());

        System.out.println(kartakredytowa1.toString());

        DebitCard kartadebetowa1 = new DebitCard("Karta debetowa1", "1232121", BigDecimal.valueOf(333), BigDecimal.valueOf(532532));
        kartadebetowa1.pay();
        kartadebetowa1.toString();
    }
}
