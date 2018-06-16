package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import jdk.nashorn.internal.runtime.regexp.joni.ast.CClassNode;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Card card = new Card("1928938833948", "Kowalski",new BigDecimal(9384883));

        CreditCard creditCard = new CreditCard("Child", "111222333", new BigDecimal(10000), new BigDecimal(100));

        System.out.println("method .pay() in Card class' object:");
        card.pay();
        System.out.println("method .pay() in CreditCard object:");
        creditCard.pay();

        System.out.println("Card class object to String:"+card.toString());
        System.out.println("CreditCard class object to String:"+creditCard.toString());




    }
}
