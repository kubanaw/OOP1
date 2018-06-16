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
        System.out.println("your card has been created");
    }

    public Card(String name, String number, BigDecimal balance) {
        this(name, number);
        this.balance = balance;
    }
    public java.lang.String getName() {
        return name;
    }

    public String getNumber()    {
        return number;

    }
}
