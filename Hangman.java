/*
    Aniketh Bandlamudi
    AP Computer Science A
    Arneja, 5th Period
*/

// imports the Scanner class from the java.util package
import java.util.Scanner;

// class declaration
public class Hangman {

    // variable to store the secret word
    private String secretWord;
    // array to store the blanks and letters
    private char[] blanks;
    // variable to store the number of guesses
    private int numOfGuesses;
    // variable to store the maximum number of guesses
    private int maxGuesses = 6;
    // variable to store the used letter
    private String usedLetters;
    // variable to store the game status
    private boolean gameOver;

    // empty constructor that randomly selects a word from the words array
    public Hangman() {
        // new String array to store the words
        String[] words = {"java", "computer", "computer science", "python", "linux", "apple", "windows", "microsoft", "integrated development environment", "blackberry"};
        // randomly selects a word from the words array
        secretWord = words[(int) (Math.random() * words.length)];
        // creates a new char array with the length of the secret word
        blanks = new char[secretWord.length()];
        // for loop to fill the blanks array with underscores
        for (int i = 0; i < blanks.length; i++) {
            // if the character at the index of i is a space, then the blank at the index of i is a space
            if (secretWord.charAt(i) == ' ') {
                blanks[i] = ' ';
                // otherwise, the blank at the index of i is an underscore
            } else {
                blanks[i] = '_';
            }
        }
        // sets the number of guesses to 0
        numOfGuesses = 0;
        // sets the used letters to an empty string
        usedLetters = "";
        // sets the game status to false
        gameOver = false;
    }

    // constructor that takes a word as a parameter
    public Hangman(String word) {
        // sets the secret word to the word parameter
        secretWord = word.toLowerCase();
        // creates a new char array with the length of the secret word
        blanks = new char[secretWord.length()];
        // for loop to fill the blanks array with underscores
        for (int i = 0; i < blanks.length; i++) {
            // if the character at the index of i is a space, then the blank at the index of i is a space
            if (secretWord.charAt(i) == ' ') {
                blanks[i] = ' ';
                // otherwise, the blank at the index of i is an underscore
            } else {
                blanks[i] = '_';
            }
        }
        // sets the number of guesses to 0
        numOfGuesses = 0;
        // sets the used letters to an empty string
        usedLetters = "";
        // sets the game status to false
        gameOver = false;

    }

    // method to play the game
    // precondition: the game is not over (gameOver = false)
    // postcondition: the game is over (gameOver = true)
    public void game() {
        // creates a new Scanner object
        Scanner input = new Scanner(System.in);

        // while the game is not over
        while (!gameOver) {
            // if the number of guesses is greater than or equal to the maximum number of guesses
            if (numOfGuesses >= maxGuesses) {
                // prints out that the user loses
                System.out.println("You lose :(");
                System.out.println("The word was: " + secretWord);
                // sets the game status to true
                gameOver = true;
                // exits the loop
                break;
            }

            // checks if all the letters have been guessed
            boolean allLettersGuessed = true;
            for (int i = 0; i < blanks.length; i++) {
                if (blanks[i] == '_') {
                    allLettersGuessed = false;
                    break;
                }
            }

            // if all the letters have been guessed then the user wins
            if (allLettersGuessed) {
                System.out.println("You win!! :))");
                gameOver = true;
                break;
            }

            // prints the number of guesses left
            System.out.println("Guesses left: " + (maxGuesses - numOfGuesses));

            // prints " " for spaces and the letters for the blanks array
            for (int j = 0; j < blanks.length; j++) {
                if (blanks[j] == ' ') {
                    System.out.print("  ");
                } else {
                    System.out.print(blanks[j] + " ");
                }
            }

            // new line
            System.out.println();

            // prompts the user to guess a letter
            System.out.println("Guess a letter: ");
            String guessInput = input.next().toLowerCase();
            char guess = guessInput.charAt(0);

            // checks if the letter has already been guessed
            if (usedLetters.contains(String.valueOf(guess))) {
                System.out.println("You already guessed that letter.");
            } else {
                // adds the letter to the used letters
                usedLetters += guess;
                // changes the letter to lowercase
                guess = Character.toLowerCase(guess);
                // if the secret word contains the letter
                if (secretWord.contains(guess + "")) {
                    // changes the corresponding blank to the letter
                    for (int k = 0; k < secretWord.length(); k++) {
                        if (secretWord.charAt(k) == guess) {
                            blanks[k] = guess;
                        }
                    }
                } else {
                    // otherwise, the number of guesses increases by 1
                    numOfGuesses++;
                }
            }
        }
    }



    // main method
    // precondition: none
    // postcondition: the game is played
    public static void main(String[] args) {
        // creates a new Hangman object
        Hangman h1 = new Hangman("I love Java");
        // calls the game method on the Hangman object
        h1.game();

        // prompts the user to play again
        System.out.println("Would you like to play again? Y/N");
        Scanner s = new Scanner(System.in);
        String repeat = s.nextLine();

        // if the user wants to play again, then a new Hangman object is created and the game method is called
        if (repeat.equalsIgnoreCase("y")) {
            // plays from the list of random words
            h1 = new Hangman();
            h1.game();
        }
    }


}


