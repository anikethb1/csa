// Authors: Liam Healy (lhealy1), Frannie Richert (frannier), Evan Tschannen (etschan2)
import java.util.ArrayList;

// Player class
public class Player {
    //
    private ArrayList<Card> hand;

    // constructor
    public Player() {
        // initializes the hand instance variable
        hand = new ArrayList<>();
    }

    // method to take a card from the deck
    public void takeACard(Deck deck) {
        // gets the top card from the deck
        Card drawnCard = deck.getTopCard();
        // checks if the card is not null
        if (drawnCard != null) {
            // adds the card to the hand
            hand.add(drawnCard);
            // if the card is null
        } else {
        }
    }

    // method to compute the points in the hand
    public int computePoints() {
        // initializes the points variable
        int points = 0;
        // loops through the hand
        for (Card card : hand) {
            // adds the value of the card to the points
            points += card.getValue();
        }
        // returns the points
        return points;
    }

    // method to show the hand
    public void showHand() {
        // loops through the hand
        for (Card card : hand) {
            // prints the card
            System.out.print(card + ", ");
        }
        // prints the total points
        System.out.println("Total Points: " + computePoints());
    }

    // method to discard the hand
    public void discardHand() {
        // clears the hand
        hand.clear();
    }
    // method to show the top card
    public String showTopCard() {
        //
        return hand.get(0).toString();
	}

}