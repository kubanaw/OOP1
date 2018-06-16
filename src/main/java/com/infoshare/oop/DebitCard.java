package com.infoshare.oop;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public BigDecimal limitkartydebetowej;

    public DebitCard(String cardName, String cardNumber, BigDecimal saldo) {
        super(cardName, cardNumber, saldo);

        System.out.println("Utworzyłeś kartę debetową");
    }

    public DebitCard(String cardName, String cardNumber, BigDecimal saldo, BigDecimal limitkartydebetowej) {
        this(cardName, cardNumber, saldo);
        this.limitkartydebetowej = limitkartydebetowej;

        System.out.println("Utworzyłeś kartę debetową");
    }

    @Override
    public void pay() {
        System.out.println("Zapłaciłeś kartą debetową");
    }

}
