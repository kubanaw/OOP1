import card.Card;
import card.CreditCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Card cardBalance = new Card("Welter", "23456734567", new BigDecimal(234567));

        CreditCard creditCard = new CreditCard("Welter", "987654", new BigDecimal(833545), new BigDecimal(45686482));

        creditCard.pay();
        cardBalance.pay();
        creditCard.pay();

    }
}
