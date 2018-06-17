package com.infoshare.oop;

public enum CustomerType {

    KLIENT_INDYWIDUALNY("Klient indywidualny"),
    FIRMA("Firma");

     private final String name;

    CustomerType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
