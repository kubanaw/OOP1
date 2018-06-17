package com.infoshare.oop.com.infoshare.oop.card;

import com.infoshare.oop.Exception.NotEnoughFundsException;

import java.math.BigDecimal;

public abstract class Card {
    protected final String name;
    protected final String number;
    protected BigDecimal balance;
    protected CustomerType customerType; //DODATKOWE POLE DLA ENUMA
// W konstruktorze ( ) wstawiamy nowy parametr: CustomerType customerType
    protected Card(String name, String number,CustomerType customerType) {
        this.name = name;
        this.number = number;
        this.balance = BigDecimal.ZERO;
        this.customerType = customerType;


    };
    protected Card(String name, String number, BigDecimal balance, CustomerType customerType) {
        this(name,number,customerType);
        this.balance = balance;
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

//NADPISANIE metody z klasy OBJECT - toString - i teraz użycie jej w inny sposób:
    @Override
    public String toString(){
        String daneKarty = name + " " + number + " " + balance + " " + customerType;
        return daneKarty;

    }

}
