import card.Card;
import card.CreditCard;
import card.DebitCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Card cardBalance = new Card("Welter", "23456734567", new BigDecimal(234567));

        CreditCard creditCard = new CreditCard("Welter", "987654", new BigDecimal(833545), new BigDecimal(45686482));

        DebitCard debitCard = new DebitCard("Kowalski", "200", new BigDecimal(400));
        DebitCard debitCard1 = new DebitCard("Słowik", "234");

        creditCard.pay();
        cardBalance.pay();
        creditCard.pay();

        System.out.println(cardBalance.toString());
        System.out.println(creditCard.toString());
        System.out.println(debitCard.toString());

        debitCard.pay();


    }
}
