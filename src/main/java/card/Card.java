package card;

import exeption.NotEnoughFundsExeption;

import java.math.BigDecimal;

public abstract class Card { //klasa
    protected final String name; //pole
    protected final String number;
    protected BigDecimal balance;
    protected CustomerType customerType;

    protected Card(String name, String number) { //konstruktor, nazwa taka jak klasy, String name to parametr
        this.name = name;
        this.number = number;
        this.balance = this.balance.ZERO;
        this.customerType = this.customerType.COMPANY;
        System.out.println("your card has been created, 2 argm");
    }

    protected Card(String name, String number, BigDecimal balance, CustomerType customerType) {
        this(name, number);
        this.balance = balance;
        this.customerType = customerType;
        System.out.println("your card has been created, 3 argm");
    }


    public java.lang.String getName() {
        return name;
    }

    public String getNumber() {
        return number;

    }

    public abstract void pay() throws NotEnoughFundsExeption;
    @Override
    public String toString(){
        return name+" "+number+" "+balance.toString();

    }
}
