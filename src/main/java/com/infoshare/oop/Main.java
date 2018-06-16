package com.infoshare.oop;

import com.infoshare.oop.com.infoshare.oop.card.Card;
import com.infoshare.oop.com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.com.infoshare.oop.card.DebitCard;

import java.math.BigDecimal;

public class Main {
    public static void main (String[] args ) {
        System.out.println("_____________");
        System.out.println("NOWE KARTY");
        System.out.println("-------------");

        //Deklaracja obiektu typu Card o nazwie Visa - Inicjalizacja
     //   Card visa = new Card("Visa Ultron","3322432423");
      //  Card masterCard = new Card ("MasterCard","43242432",new BigDecimal("32221144"));
        //UWAGA! BigDECIMAL - deklarujemy poprzez: new BigDecimal(liczba)

        Card pko = new CreditCard("Visa" , "432432432", new BigDecimal("3111"), new BigDecimal("433"));
        Card debCard = new DebitCard("Debetowa", "32133" ,new BigDecimal(33323), new BigDecimal( 300));


        //WYSWIETLANIE
//        System.out.println("Nazwa :"+ visa.getName() );
//        System.out.println("Numer :" + visa.getNumber());
//       //Reszta - MasterCard z Balance
//        System.out.println("Nazwa :" + masterCard.getName());
//        System.out.println("Numer :" + masterCard.getBalance());
//        System.out.println("Rachunek :" + masterCard.getBalance());
//        //PKO
        //WYWOŁANIE METODY NA OBIEKCIE PKO
//        visa.pay();
//        pko.pay();  //PKO to obiekt klasy CreditCard - więc wyświetli "Platnosc karta kredytowa"
//        visa.toString();
    //WYSWIETLANIE dla obiektu z kalsy Card, masterCard, metody toString, nadpisanej z Object
//        System.out.println(masterCard.toString());
    // WYŚWIETLENIE DLA OBIEKTU z KLASY DebitCard.java, metoda toString nadpisana
        System.out.println("####### Wyswietlanie DebitCard - poprzez nadpisanie toString - zebranie komunikatów");
        System.out.println(debCard.toString());
    }
}
