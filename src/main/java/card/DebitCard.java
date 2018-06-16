package card;

import exeption.NotEnoughFundsExeption;

import java.math.BigDecimal;

public class DebitCard extends Card{

    public DebitCard(String name, String number){
        super (name, number);
        System.out.println("debitcard with 2 args was created");
    }

    public DebitCard(String name, String number, BigDecimal balance){

       super (name, number, balance);
        System.out.println("Debit card was created");
    }

    public void pay() throws NotEnoughFundsExeption {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsExeption("Not enouch money on your Debit card");
        }

        System.out.println("Debitcard transaction was created");
    }

}
