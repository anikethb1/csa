/*
Name: Aniketh Bandlamudi
Project: Casino Simulator Lab
Date: Oct 18 2023
*/

// imports the Math class from the default java.lang package
import java.lang.Math;
public class CasinoSimulator
{
    public static void main(String[] args)
    {
        //Call methods here or in the interaction

        // calls the simulate method with the number of game simulations set to 100
        simulate(100);

        // calls the blackjack method with the current amount of money set to $100, the goal set to $200, and the...
        // ... amount bet each time set to $10
        blackjack(100, 200, 10);

        // calls the simulatePlayBlackjack method with the current amount of money set to $100, the goal set to...
        // ... $200, and the amount bet each time set to $10
        simulatePlayBlackjack(100, 200, 10);
    }

  /*Method 1: blackjack
  Precondition: None
  Postcondition: returns the int value representing if the round was won (1), lost (-1), or tied (0)
  */

    public static int blackjack() {

        // defines the variable per to a random value
        double per = Math.random();

        // represents a 50% chance of losing
        if (per >= 0.5) {
            return -1;

        // represents a 42% chance of winning
        } else if (per >= 0.08 && per < 0.5) {
            return 1;

        // the remaining 8% is a tie
        } else {
            return 0;
        }
    }

  /*Method 2: simulate
  Precondition: the argument for the num parameter is a positive integer
  Postcondition: no value is returned, however, the method prints the percentage wins, losses, and ties
  */

    public static void simulate(int num) {

        // organization in the console
        System.out.println("----------------------------");
        System.out.println("\"Simulate Method\"");
        System.out.println("");
        System.out.println("");


        // declares 3 variables to represent the number of wins, losses, and ties
        int wins = 0;
        int ties = 0;
        int losses = 0;

        // simulates "num" rounds of blackjack
        for (int i = 0; i <= num; i++) {

            // the status of the round (ie win) in each iteration of the for loop
            int play = blackjack();

            // if the round results in the value of -1, it is counted as a loss
            if (play == -1) {
                losses += 1;

            // if the round results in the value of 1, it is counted as a win
            } else if (play == 1) {
                wins += 1;


            // if the round results in the value of 0, it is counted as a tie
            } else {
                ties += 1;
            }
        }



        // the total amount of rounds is found by adding the number of wins ties and losses
        // this could also be found using a counter variable
        int total = wins + ties + losses;

        // since the percentages have to add to 100%, the number of wins is reduced by 1 to ...
        // ... account for a slight inconsistency where the percentages add up to 101%
        if (total > num) {
            wins--;
        }

        // dividing by 100.0 results in a decimal value that matches the example output given
        System.out.println("Number of trials: " + num);
        System.out.println("Win: " + wins / 100.0 + "%");
        System.out.println("Tie: " + ties / 100.0 + "%");
        System.out.println("Loss: " + losses / 100.0 + "%");
        System.out.println("");


    }

  /*Method 3: playBlackjack
  Precondition: The arguments passed through the money parameter, goal parameter, and bet parameter are postive
  Postcondition: No value is returned, however, the method prints the values of the 3 parameters after each
  iteration of the loop. The status at the end (reached goal or lost all of the money) and the number of rounds
  is also printed.
  */


    // declaring 3 ints to be used to count the number of wins, losses, and ties
    // the variables can be accessed throughout the code.
    static int winCount = 0;
    static int lossCount = 0;
    static int tieCount = 0;

    // blackjack method with 3 parameters representing the amount of money at the beginning, the goal, and ...
    // ... the amount of money bet on each round
    public static void blackjack(double money, double goal, double bet) {

        // organization in the console
        System.out.println("----------------------------");
        System.out.println("\"Blackjack Method (Method 3)\"");
        System.out.println("");
        System.out.println("");

        // prints the arguments pased through each of the 3 parameters
        System.out.println("Initial Value: $" + money + " End Goal: $" + goal + " Bet per round: $" + bet);

        // counter variable to count the number of iterations
        int count = 0;

        System.out.println("");

        // while loop which runs repeatedly while the amount of money is less than the goal and the amount ...
        // ... of money is positive
        while (money < goal && money > 0) {

            // for each iteration of the loop, the value of round stat is determined ...
            // ... if the round was won (1), lost (-1), or tied (0)
            int roundStat = blackjack();

            // if the round was won
            if (roundStat == 1) {

                // the money increases by the bet amount for one round
                money += bet;

                // the static variable winCount is increased by 1
                winCount++;

                // the current value of the money is printed (after each iteration)
                System.out.println("Win!  | Balance: $" + money);
                System.out.println("");

            // if the round was lost
            } else if (roundStat == -1) {

                // the amount of money decreases by the bet amount for one round
                money -= bet;

                // the static variable lossCount is increased by 1
                lossCount++;

                // the current value of the money is printed (after each iteration)
                System.out.println("Loss! | Balance: $" + money);
                System.out.println("");

            // else is used because the only other value possible is 0, which represents a tie
            } else {

                // this is not necessary but is there to clear any possible confusion of what is happening
                // at this step
                money = money;

                // the static variable tieCount is increased by 1
                tieCount++;

                // the current value of the money is printed (after each iteration)
                System.out.println("Tie!  | Balance: $" + money);
                System.out.println("");
            }


            // the count is increased after each iteration
            count++;

        }

        // if the value of money reached 0, it prints that you lost all your money :(
        if (money == 0) {
            System.out.println("Sorry, after " + count + " rounds, you only have $0.0 left. Better luck next time!");

        // if the value of money reached the goal :)), it lets you know in the console
        } else if (money == goal) {
            System.out.println("Congrats! After " + count + " rounds, you reached your end goal of $" + goal);
        }

        System.out.println("");
        System.out.println("----------------------------");


    }



    /*
  Method 4: simulatePlayblackjack
  Precondition: The arguments passed through the money parameter, goal parameter, and bet parameter are postive
  Postcondition: No value is returned when the method is called. However, the method prints the number of won,
  lost, and tied sessions.
  */

    // simulatePlayBlackjack method with 3 parameters representing the amount of money at the beginning, the ...
    // ... goal, and the amount of money bet on each round
    public static void simulatePlayBlackjack(double money, double goal, double bet) {

        // formula
        //  (start * win – start*(num-win))

        // these variables are used to break down the steps of the formula to avoid mistakes
        double v1 = (winCount + lossCount + tieCount)-winCount;
        double v2 = money * winCount;
        double v3 = money * v1;
        double netWinLoss = v2 - v3;

        // organization in the console
        System.out.println("\"Simulating multiple rounds of Blackjack Method (Method 4)\"");
        System.out.println("");
        System.out.println("");

        // prints the number of winning sessions
        System.out.println("Number of winning sessions: " + winCount);

        // prints the number of losing sessions
        System.out.println("Number of losing sessions: " + lossCount);

        // prints the number of tied sessions
        System.out.println("Number of tied sessions: " + tieCount);

        // prints the net win/loss which is stored in the variable netWinLoss
        System.out.println("Net win/loss: " + netWinLoss);

    }


}
