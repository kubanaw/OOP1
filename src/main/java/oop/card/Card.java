package oop.card;

import oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public abstract class Card {
    protected final String cardName;
    protected final String cardNumber;
    protected BigDecimal balance;

    protected Card (String cardName, String cardNumber, BigDecimal balance){
        this(cardName, cardNumber);
        this.balance = balance;
    }

    protected Card (String cardName, String cardNumber) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        System.out.println("CARD INIT");
    }

    @Override
    public String toString() {
        return cardName + ", " + "number:" + cardNumber + "balance " + balance;
    }

    public String getCardName() {
        return cardName;
    }

        public String getCardNumber() {
        return cardNumber;
    }

        public BigDecimal getBalance() {
        return balance;
    }

        public abstract void pay() throws NotEnoughFundsException;

}