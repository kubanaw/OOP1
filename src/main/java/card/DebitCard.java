package card;

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

    public void pay() {
        System.out.println("Debitcard transaction was created");
    }

}
