package com.infoshare.oop;

import com.infoshare.oop.Exception.NotEnoughFundsException;
import com.infoshare.oop.com.infoshare.oop.card.*;

import java.math.BigDecimal;

public class Main {
    public static void main (String[] args ) {
        System.out.println("_____________");
        System.out.println(" NOWE KARTY ");
        System.out.println("-------------");

        //Deklaracja obiektu typu Card o nazwie Visa - Inicjalizacja
     //   Card visa = new Card("Visa Ultron","3322432423");
      //  Card masterCard = new Card ("MasterCard","43242432",new BigDecimal("32221144"));
        //UWAGA! BigDECIMAL - deklarujemy poprzez: new BigDecimal(liczba)
        Card pko = new CreditCard("Visa" , "432432432", new BigDecimal("-111"), new BigDecimal("433"), CustomerType.COMPANY);
        Card debCard = new DebitCard("Debetowa", "32133" ,new BigDecimal(-330), new BigDecimal( 300), CustomerType.INDIVIDUAL);
        Card prepaidCard = new PrepaidCard("Prepaid", "44444", new BigDecimal(21) , CustomerType.INDIVIDUAL, true);

      //CanTransferTo prepaidCard = new PrepaidCard("VISA",new BigDecimal(4354), new BigDecimal(44), CustomerType.COMPANY);
      //WYSWIETLANIE
//        System.out.println("Nazwa :"+ visa.getName() );
//        System.out.println("Numer :" + visa.getNumber());
//       //Reszta - MasterCard z Balance
//        System.out.println("Nazwa :" + masterCard.getName());
//        System.out.println("Numer :" + masterCard.getBalance());
//        System.out.println("Rachunek :" + masterCard.getBalance());
//        //PKO
        //WYWOŁANIE METODY NA OBIEKCIE PKO

        try {
            pko.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        } finally {

        }

        try {
            debCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        } finally {

        }

        try {
            prepaidCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        } finally {

        }

       // pko.pay();  //PKO to obiekt klasy CreditCard - więc wyświetli "Platnosc karta kredytowa"
//        visa.toString();
    //WYSWIETLANIE dla obiektu z kalsy Card, masterCard, metody toString, nadpisanej z Object
//        System.out.println(masterCard.toString());
    // WYŚWIETLENIE DLA OBIEKTU z KLASY DebitCard.java, metoda toString nadpisana
        System.out.println("####### Wyswietlanie DebitCard - poprzez nadpisanie toString - zebranie komunikatów");
        System.out.println(debCard.toString());
        System.out.println(pko.toString());
        System.out.println(prepaidCard.toString());

        CanTransferTo newObj = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Implement");
            }
        };


    }
}
