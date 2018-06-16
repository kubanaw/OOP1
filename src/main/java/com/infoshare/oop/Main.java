package com.infoshare.oop;

import java.math.BigDecimal;



public class Main {
    public static void main(String[] args) {


        CreditCard kartakredytowa1 = new CreditCard("Karta kredytowa1", "11213212", BigDecimal.valueOf(0), BigDecimal.valueOf(66665));





        System.out.println(kartakredytowa1.toString());

        DebitCard kartadebetowa1 = new DebitCard("Karta debetowa1", "1232121", BigDecimal.valueOf(0), BigDecimal.valueOf(532532));
        try {
            kartadebetowa1.pay();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        try {
            kartakredytowa1.pay();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        kartadebetowa1.toString();


    }
}
