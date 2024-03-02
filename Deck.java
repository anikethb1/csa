import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck(int num) {
        cards = new ArrayList<>();
        String[] suits = {"hearts", "clubs", "spades", "diamonds"};
        String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int n = 0; n < num; n++) {
            for (String suit : suits) {
                for (String rank : ranks) {
                    cards.add(new Card(rank, suit));
                }
            }
        }
    }

    public Deck() {
        this(1);
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public void swap(int i, int j) {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }

    public void shuffle() {
        for (int i = 0; i < 4 * cards.size(); i++) {
            int j = (int) (Math.random() * cards.size());
            int k = (int) (Math.random() * cards.size());
            swap(j, k);
        }
    }
}