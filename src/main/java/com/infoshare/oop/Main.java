package com.infoshare.oop;

import com.infoshare.oop.com.infoshare.oop.card.Card;
import com.infoshare.oop.com.infoshare.oop.card.CreditCard;

import java.math.BigDecimal;

public class Main {
    public static void main (String[] args ) {
        System.out.println("_____________");
        System.out.println("NOWE KARTY");
        System.out.println("-------------");

        //Deklaracja obiektu typu Card o nazwie Visa - Inicjalizacja
        Card Visa = new Card("Visa Ultron","3322432423");
        Card MasterCard = new Card ("MasterCard","43242432",new BigDecimal("32221144"));
        CreditCard PKO = new CreditCard("Visa" , "432432432", new BigDecimal(), new BigDecimal());






       //WYSWIETLANIE
        System.out.println("Nazwa :"+ Visa.getName() );
        System.out.println("Numer :" + Visa.getNumber());
       //Reszta - MasterCard z Balance
        System.out.println("Nazwa :" + MasterCard.getName());
        System.out.println("Numer :" + MasterCard.getBalance());
        System.out.println("Rachunek :" + MasterCard.getBalance());
        //PKO
        System.out.println(PKO.getCreditLimit() + " " + );

    }
}
