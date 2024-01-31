/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author gitanshk
 * @date Modified: 2024-01-30
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the card you want to find (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of the card you want to find (0-3): ");
        int userSuit = scanner.nextInt();
        Card userCard = new Card(userValue, Card.SUITS[userSuit]);

        // and search magicHand here
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        //Then report the result here
        if (found) {
            System.out.println("Your card was found in the magic hand!");
        } else {
            System.out.println("Your card was not found in the magic hand.");
        }

        // add one luckcard hard code 2,clubs
        Card luckCard = new Card(2, "Clubs");
        System.out.println("The luck card is: " + luckCard);
    }
}