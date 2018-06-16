package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import jdk.nashorn.internal.runtime.regexp.joni.ast.CClassNode;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Card card = new Card("1928938833948", "Kowalski",new BigDecimal(9384883));
        System.out.println(card);




    }
}
