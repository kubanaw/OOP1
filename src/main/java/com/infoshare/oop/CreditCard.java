package com.infoshare.oop;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class CreditCard extends Card  implements CanTransferTo{
    protected BigDecimal creditLimit;

    public CreditCard(String cardName, String cardNumber, BigDecimal saldo, BigDecimal creditLimit, CustomerType typklienta) {
        super(cardName, cardNumber, saldo, typklienta);
        this.creditLimit = creditLimit;
        System.out.println("Utworzyłeś kartę kredytową");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void pay() throws NotEnoughFundsException {
        if (saldo.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("Brak środków na koncie");
        }
        System.out.println("Zapłaciłeś kartą kredytową");
    }

    @Override
    public String toString() {

        return super.toString() + " " + creditLimit.toString();
    }

    public void transferToCard(BigDecimal amount) {
        System.out.println("Na tą kartę można przelać środki");
    }

}
