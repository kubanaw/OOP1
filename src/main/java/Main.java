import card.Card;
import card.CreditCard;
import card.DebitCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {




        Card creditCard = new CreditCard("Welter", "987654", new BigDecimal(833545), new BigDecimal(45686482));

        Card debitCard = new DebitCard("Kowalski", "200", new BigDecimal(400));
        Card debitCard1 = new DebitCard("Słowik", "234");
      boolean test = debitCard instanceof CreditCard; //should return false
        System.out.println(test);


        creditCard.pay();

        creditCard.pay();


        System.out.println(creditCard.toString());
        System.out.println(debitCard.toString());

        debitCard.pay();


    }
}
