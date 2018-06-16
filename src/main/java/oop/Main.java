package oop;

import oop.card.Card;
import oop.card.CreditCard;
import oop.card.DebitCard;
import oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        CreditCard creditCard = new CreditCard(new BigDecimal(1234), new BigDecimal(122), "Karta Kredytowa");
        DebitCard debitCard = new DebitCard(new BigDecimal(1234), new BigDecimal(122), "Karta Debetowa");
        try {
            debitCard.pay();
            creditCard.pay();
        }
        catch (NotEnoughFundsException e){
            System.out.println(e.getMessage());
            }
            System.out.println(creditCard.toString());
        }
    }
