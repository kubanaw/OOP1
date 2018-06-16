package com.infoshare.oop;

import java.math.BigDecimal;

public class Card {

    protected String cardName;
    protected String cardNumber;
    protected BigDecimal saldo;

    public Card(String cardName, String cardNumber) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        saldo = BigDecimal.valueOf(0);
        System.out.println("Stworzyłeś nową kartę");
    }

    public Card(String cardName, String cardNumber, BigDecimal saldo) {
        this(cardName, cardNumber);
        this.saldo = saldo;
        System.out.println("Drugi konstruktor");
    }

    public String getName() {
        return cardName;
    }

    public String getNumber() {
        return cardNumber;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setName(String cardName) {
        this.cardName = cardName;
    }

    public void setNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public void pay() {
        System.out.println("Zapłaciłeś kartą");

    }
    
}
