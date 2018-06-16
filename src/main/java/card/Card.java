package card;

import java.math.BigDecimal;

public class Card {
    protected String name;
    protected String number;
    protected BigDecimal balance;


    public Card(String name, String number) { //konstruktor, nazwa taka jak klasy
        this.name = name;
        this.number = number;
        this.balance = balance.ZERO;
        System.out.println("your card has been created, 2 argm");
    }

    public Card(String name, String number, BigDecimal balance) {
        this(name, number);
        this.balance = balance;
        System.out.println("your card has been created, 3 argm");
    }

    public java.lang.String getName() {
        return name;
    }

    public String getNumber() {
        return number;

    }

    public void pay() {
        System.out.println("transaction with card has finished succesfully");
    }
}
