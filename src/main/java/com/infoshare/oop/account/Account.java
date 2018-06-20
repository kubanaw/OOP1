package com.infoshare.oop.account;

import com.infoshare.oop.card.Product;

public class Account extends Product{
    protected String name;
    protected String number;

    public Account(String id, String name, String number) {
        super(id);
        this.name = name;
        this.number = number;
    }

    public java.lang.String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
    @Override
    public String toString(){
        return super.toString()+", nazwisko: "+name+", numer konta: "+number;
    }
}
