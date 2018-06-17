package card;

import exeption.NotEnoughFundsExeption;

import java.math.BigDecimal;

public class CreditCard extends Card {

    protected final BigDecimal creditLimit;

    public CreditCard(String name, String number, BigDecimal balance, BigDecimal creditLimit, CustomerType customerType) {
        super(name, number, balance, customerType);
        this.creditLimit = creditLimit;
        System.out.println("Twoja karta kredytowa");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void pay() throws NotEnoughFundsExeption {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsExeption("Not enouch money on your CreditCard");
        }

        System.out.println("Transaction with creditcard finished succesfully");
    }
    @Override
    public String toString()
    {
        return super.toString()+""+creditLimit.toString();    }



}
