package card;

import java.util.Random;
import java.util.Scanner;

/*
 * @modifier : Kirandeep Kaur
 * Student Number: 991715924
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

       
        for (int i = 0; i < magicHand.length; i++) {
            int number = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)];
            magicHand[i] = new Card(number, suit);
        }

       
        Card luckyCard = new Card(7, "Hearts"); 

     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card number (1-13):");
        int value = scanner.nextInt();
        System.out.println("Enter a suit (Hearts, Diamonds, Clubs, Spades):");
        scanner.nextLine();
        String suit = scanner.nextLine();

       
        boolean found = false, luckyFound = false;
        for (Card card : magicHand) {
            if (card.getNumber() == value && card.getSuit().equalsIgnoreCase(suit)) {
                found = true;
            }
            if (card.getNumber() == luckyCard.getNumber() && card.getSuit().equals(luckyCard.getSuit())) {
                luckyFound = true;
            }
        }

       
        if (found) {
            System.out.println("Your card was found in the magic hand!");
        } else {
            System.out.println("Your card was not found in the magic hand.");
        }

       
        if (luckyFound) {
            System.out.println("The lucky card was found in the magic hand!");
        } else {
            System.out.println("The lucky card was not found in the magic hand.");
        }
    }

    static class Card {
        private final int number;
        private final String suit;

        public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

        public Card(int number, String suit) {
            this.number = number;
            this.suit = suit;
        }

        public int getNumber() {
            return number;
        }

        public String getSuit() {
            return suit;
        }
    }
}

       
       
