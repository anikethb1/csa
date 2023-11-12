import java.lang.Math;

public class Card {
    private String suit;
    private String rank;
    private int value;
    private int totalCards;

    public Card() {
        suit = "spade";
        rank = "ace";
        value = 1;
        totalCards++;
    }

    public Card(String s, String a, int v) {
        suit = s;
        rank = a;
        value = v;
        totalCards++;
    }

    public int compareTo(Card other) {
        return value - other.value;
    }
}