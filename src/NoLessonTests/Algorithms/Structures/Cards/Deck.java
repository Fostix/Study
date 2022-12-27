package NoLessonTests.Algorithms.Structures.Cards;

import java.util.Random;

public class Deck {
    private Card[] deck;
    private static int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumber = new Random();

    public Deck() {
        currentCard = 0;
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight",
        "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[NUMBER_OF_CARDS];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % faces.length], suits[i / faces.length]);
        }
    }

    public void shuffle() {
        for (int i = 0; i < deck.length; i++) {
            int second = randomNumber.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[i];
            deck[i] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}
