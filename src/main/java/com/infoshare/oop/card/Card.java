package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public abstract class Card extends Product {
    protected final String name;
    protected final String number;
    protected BigDecimal balance;
    protected CustomerType customerType;

    protected Card(String id, String name, String number, CustomerType customerType) {
        super(id);
        this.name = name;
        this.number = number;
        this.balance = BigDecimal.ZERO;
        this.customerType = customerType;
        System.out.println("Card initialization - constructor with 2 arguments");
    }

    protected Card(String id, String name, String number, BigDecimal balance, CustomerType customerType) {
        this(id, name, number, customerType);
        this.balance = balance;
        System.out.println("Card initialization - constructor with 3 arguments");
    }

    @Override
    public String toString() {
        return super.toString()+name + ", " + "number: " + number + ", balance: " + balance + "zł, typ klienta: " + customerType;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public abstract void pay() throws NotEnoughFundsException;
}