import card.Card;
import card.CreditCard;
import card.CustomerType;
import card.DebitCard;
import exeption.NotEnoughFundsExeption;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Card creditCard = new CreditCard("Welter", "987654", new BigDecimal(0), new BigDecimal(-34), CustomerType.COMPANY);


<<<<<<< HEAD
        Card debitCard = new DebitCard("Słowik", "234");//w nawiasie mamy argumenty
        boolean test = debitCard instanceof CreditCard; //should return false         //obiekt

||||||| merged common ancestors
        Card debitCard = new DebitCard("Kowalski", "200", new BigDecimal(0));
        Card debitCard1 = new DebitCard("Słowik", "234");
        boolean test = debitCard instanceof CreditCard; //should return false
=======
        Card debitCard = new DebitCard("Kowalski", "200", new BigDecimal(0), CustomerType.COMPANY);
        Card debitCard1 = new DebitCard("Słowik", "234");
        boolean test = debitCard instanceof CreditCard; //should return false
>>>>>>> 5c74538b19d2ae240c9a51d7c76eb5bd58a56b16
        System.out.println(test);
        System.out.println(" ");
        try {
            creditCard.pay();

        } catch (NotEnoughFundsExeption e) {
            System.out.println(e.getMessage());
        }

        try {

            debitCard.pay();
        } catch (NotEnoughFundsExeption e) {
            System.out.println(e.getMessage());
        }


        System.out.println(creditCard.toString());
        System.out.println(debitCard.toString());


    }
}
