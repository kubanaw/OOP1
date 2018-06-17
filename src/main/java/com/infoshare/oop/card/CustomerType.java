package com.infoshare.oop.card;

public enum CustomerType {

    //declare values
    COMPANY ("Przedsiębiorstwo"), //= String name;
    INDIVIDUAL("Klient indywidualny");// = String name;

    private final String name;

    //enum's constructor is private!
     CustomerType (String name){
        this.name = name;
    }

    @Override

    public String toString(){
         return name;
    }
}
