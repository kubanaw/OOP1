package card;

import java.math.BigDecimal;

public class CreditCard extends Card {

    protected BigDecimal creditLimit;

    public CreditCard(String name, String number, BigDecimal balance, BigDecimal creditLimit) {
        super(name, number, balance);
        this.creditLimit = creditLimit;
        System.out.println("Twoja karta kredytowa");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
@Override
    public void pay(){
        System.out.println("Transaction with creditcard finished succesfully");
    }
}
