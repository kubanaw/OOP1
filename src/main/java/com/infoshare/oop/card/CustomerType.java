package com.infoshare.oop.card;

public enum  CustomerType {
    COMPANY("Firma"),
    INDYVIDUAL("Prywatny");

        private final String name;

    CustomerType(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}

