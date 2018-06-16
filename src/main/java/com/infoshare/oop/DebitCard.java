package com.infoshare.oop;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public BigDecimal limitkartydebetowej;

    public DebitCard(String cardName, String cardNumber, BigDecimal saldo) {
        super(cardName, cardNumber, saldo);

        System.out.println("Utworzyłeś kartę debetową");
    }

    public DebitCard(String cardName, String cardNumber, BigDecimal saldo, BigDecimal limitkartydebetowej) {
        super(cardName, cardNumber, saldo);
        this.limitkartydebetowej = limitkartydebetowej;

        System.out.println("Utworzyłeś kartę debetową");
    }

    @Override
    public void pay() throws NotEnoughFundsException {
        if (saldo.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("Brak środków na koncie");
        }
        System.out.println("Zapłaciłeś kartą debetową");
    }

}
