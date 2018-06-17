package com.infoshare.oop;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class PrepaidCard extends Card implements CanTransferTo{

    private boolean gift;

    protected PrepaidCard(String cardName, String cardNumber, BigDecimal saldo, CustomerType typklienta, boolean gift) {
        super(cardName, cardNumber, saldo, typklienta);
        this.gift = gift;
    }

    public boolean getGift() {
        return gift;
    }

    @Override
    public void pay() throws NotEnoughFundsException {

    }

    @Override
    public String toString() {
        return super.toString() + ", czy jest podarunkiem" + getGift();
    }

    public void transferToCard(BigDecimal amount) {
        System.out.println("Na tą kartę można przelać środki");
    }

}
