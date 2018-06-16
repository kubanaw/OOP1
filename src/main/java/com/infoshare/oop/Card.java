package com.infoshare.oop;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public abstract class Card {

    protected String cardName;
    protected String cardNumber;
    protected BigDecimal saldo;

    protected Card(String cardName, String cardNumber) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        saldo = BigDecimal.valueOf(0);
        System.out.println("Stworzyłeś nową kartę");
    }

    protected Card(String cardName, String cardNumber, BigDecimal saldo) {
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

    public abstract void pay() throws NotEnoughFundsException;

    @Override
    public String toString() {
        String wynik = getSaldo().toString() + " " + getName() + getNumber();
        return wynik;
    }
}