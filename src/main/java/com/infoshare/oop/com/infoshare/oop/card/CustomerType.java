package com.infoshare.oop.com.infoshare.oop.card;
/*Enum jest singletonem*/
/*Singleton to wzorzec projektowy którego wykorzystuje się tylko raz*/
public enum CustomerType {
    /*w pamięci jest tylko jeden obiekt company*/
    COMPANY("Firma"),
    INDIVIDUAL("Klient indywidualny");

    private final String name;

    CustomerType(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }


}
