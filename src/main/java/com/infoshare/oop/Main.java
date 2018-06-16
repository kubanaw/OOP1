package com.infoshare.oop;

import com.infoshare.oop.com.infoshare.oop.card.Card;

public class Main {
    public static void main (String[] args ) {

        System.out.println("NOWE KARTY");
        //Deklaracja obiektu typu Card o nazwie Visa - Inicjalizacja
        Card Visa = new Card();
        Visa.setName("Visa Ultron ");
        Visa.setNumber("3232384939");

        System.out.println(Visa.getName() + "  Nazwa");
        System.out.println(Visa.getNumber() + "  Numer");


    }
}
