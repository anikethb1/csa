// import java.util.ArrayList;
import java.util.Scanner;

// BlackjackGameDriver class
public class BlackjackGameDriver {
    public static final int PLAYER = 1;
    public static final int DEALER = 2;
    public static final int STAND = 0;
    public static final int BUST = -1;

    // method to determine who wins
    public static int whoWins(Player p1, Player p2) {
        // gets the points of the players
        int p1Points = p1.computePoints();
        // gets the points of the dealer
        int p2Points = p2.computePoints();

        // checks if the points of the players are greater than 21
        if (p1Points > 21 && p2Points > 21) {
            // returns stand
            return STAND; 
            // checks if the points of the player are greater than 21
        } else if (p1Points > 21) {
            // returns dealer
            return DEALER; 
            // checks if the points of the dealer are greater than 21
        } else if (p2Points > 21) {
            // returns player
            return PLAYER;
            // checks if the points of the players are equal
        } else if (p1Points == p2Points) {
            //  returns stand
            return STAND;
            //  checks if the points of the player are greater than the points of the dealer
        } else {
            // if the points of the player are greater than the points of the dealer
            if (p1Points > p2Points) {
                // returns player
                return PLAYER;
                // if the points of the dealer are greater than the points of the player
            } else {
                // returns dealer
                return DEALER;
            }
        }
    }

    // main method
    public static void main(String[] args) {
        // creates a Scanner object
        Scanner scanner = new Scanner(System.in);
        // prints the welcome message
        System.out.println("Welcome to Blackjack!");

        // while the game is running
        while (true) {
            // creates a Deck object
            Deck deck = new Deck();

            Player player = new Player();
            Player dealer = new Player();

            player.takeACard(deck);
            dealer.takeACard(deck);
            player.takeACard(deck);
            dealer.takeACard(deck);

            // prints the hands of the players
            System.out.println("Player's Hand: ");
            // shows the hand of the player
            player.showHand();
            // prints the top card of the dealer
            System.out.println("Dealer's Hand: " + dealer.showTopCard());

            // while the player's points are less than 21
            while (true) {
            
                System.out.print("Enter command (h for hit, s for stand): ");
                // gets the command from the user
                String command = scanner.nextLine().toLowerCase();

                // checks if the command is h
                if (command.equals("h")) {
                    // takes a card from the deck
                    player.takeACard(deck);
                    // prints the hand of the player
                    System.out.println("Player's Hand: ");
                    // shows the hand of the player
                    player.showHand();

                    // checks if the points of the player are equal to 21
                    if (player.computePoints() == 21) {
                        // prints the message
                        break;
                        // checks if the points of the player are greater than 21
                    } else if (player.computePoints() > 21) {
                        // prints the message
                        System.out.println("Player busts.");
                        // prints the message
                        break;
                    }
                    // checks if the command is s
                } else if (command.equals("s")) {
                    // prints the message
                    break;
                }
            }

            // prints the message
            System.out.println("Dealer's turn:");
            // shows the hand of the dealer
            dealer.showHand();
            // while the points of the dealer are less than 17
            while (dealer.computePoints() < 17) {
                // takes a card from the deck
                dealer.takeACard(deck);
                // prints the message
                dealer.showHand();
            }

            // gets the winner
            int winner = whoWins(player, dealer);
            // prints the message
            System.out.println("Game Result: ");
            // prints the hands of the players
            System.out.println("Player's Hand: ");
            // shows the hand of the player
            player.showHand();
            // prints the hands of the players
            System.out.println("Dealer's Hand: ");
            // shows the hand of the player
            dealer.showHand();

            // checks if the winner is the player
            if (winner == PLAYER) {
                // prints the message
                System.out.println("Player wins!");
                // checks if the winner is the dealer
            } else if (winner == DEALER) {
                // prints the message
                System.out.println("Dealer wins!");
            } else {
                // prints the message
                System.out.println("It's a tie!");
            }

            // prints the message
            System.out.print("Enter 'q' to quit, anything else to play another hand: ");
            // gets the command from the user
            String playAgain = scanner.nextLine().toLowerCase();
            // checks if the command is q
            if (playAgain.equals("q")) {
                // prints the message
                break;
            }
        }

        // prints the message
        System.out.println("Thanks for playing Blackjack!");
        // closes the scanner
        scanner.close();
    }
}
