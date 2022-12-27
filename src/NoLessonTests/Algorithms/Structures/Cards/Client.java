package NoLessonTests.Algorithms.Structures.Cards;

public class Client {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            System.out.print(deck.dealCard() + "     ");
            if (i % 12 == 0) {
                System.out.println();
            }
        }
    }
}
