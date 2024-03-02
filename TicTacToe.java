// imports all classes from the java.util package
import java.util.*;

// Class TicTacToe
public class TicTacToe {
    // private 2D array of characters called board
    private char[][] board;
    // private character called currentPlayer
    private char currentPlayer;
    // private integer called size
    private int size;
    // private boolean called singlePlayer
    private boolean singlePlayer;
    // private integers called wins, losses, and ties
    private int wins, losses, ties;

    // public constructor that takes no arguments for the default board size of 3
    public TicTacToe() {
        this(3);
    }
    
    // public constructor that takes an integer argument for the board size
    public TicTacToe(int size) {
        // initializes the size of the board
        this.size = size;
        // initializes the board as a 2D array of characters
        this.board = new char[size][size];
        // initializes the current player as 'X'
        this.currentPlayer = 'X';
        // initializes the game mode as multiplayer
        this.singlePlayer = false;
        // initializes the wins, losses, and ties as 0
        this.wins = 0;
        // initializes the losses as 0
        this.losses = 0;
        // initializes the ties as 0
        this.ties = 0;
        // calls the initializeBoard method
        initializeBoard();
    }
    
    // public method that takes no arguments and returns nothing
    public void initializeBoard() {
        // nested for loop that iterates through the rows and columns of the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // sets each position of the board to a hyphen
                board[i][j] = '-';
            }
        }
    }
    
    // public method that takes no arguments and returns nothing
    public void printBoard() {
        // nested for loop that iterates through the rows and columns of the board
        for (int i = 0; i < size; i++) {
            // nested for loop that iterates through the columns of the board
            for (int j = 0; j < size; j++) {
                // prints the value of the board at the current position
                System.out.print(board[i][j] + " ");
            }
            // prints a new line after each row
            System.out.println();
        }
    }
    
    // public method that takes no arguments and returns a boolean
    public boolean isBoardFull() {
        // nested for loop that iterates through the rows and columns of the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // checks if the current position of the board is a hyphen
                if (board[i][j] == '-') {
                    // returns false if the board is not full
                    return false;
                }
            }
        }
        // returns true if the board is full
        return true;
    }
    
    // public method that takes no arguments and returns nothing
    public void changePlayer() {
        // checks if the current player is 'X'
        if (currentPlayer == 'X') {
            // changes the current player to 'O'
            currentPlayer = 'O';
        } else {
            // changes the current player to 'X'
            currentPlayer = 'X';
        }
    }
    
    // public method that takes two integer arguments for the row and column and returns a boolean
    public boolean makeMove(int row, int col) {
        // checks if the row and column are within the bounds of the board
        if (row >= 0 && col >= 0 && row < size && col < size) {
            // checks if the current position of the board is a hyphen
            if (board[row][col] == '-') {
                // sets the current position of the board to the current player
                board[row][col] = currentPlayer;
                // returns true if the move was successful
                return true;
                // checks if the current position of the board is not a hyphen
            } else {
                // prints a message if the position is already occupied
                System.out.println("This position is already occupied. Try again.");
            }
        } else {
            // prints a message if the position is invalid
            System.out.println("Invalid position. Try again.");
        }
        // returns false if the move was not successful
        return false;
    }
    // public method that takes no arguments and returns a boolean
    public boolean checkForWin() {
        // Check horizontal lines
        for (int i = 0; i < size; i++) {
            // checks if the current row is a win
            if (checkLineForWin(board[i])) {
                // returns true if the current row is a win
                return true;
            }
        }
    
        // Check vertical lines
        for (int i = 0; i < size; i++) {
            // creates a new array of characters called column
            char[] column = new char[size];
            // nested for loop that iterates through the rows of the board
            for (int j = 0; j < size; j++) {
                // sets the current position of the column to the current position of the board
                column[j] = board[j][i];
            }
            // checks if the current column is a win
            if (checkLineForWin(column)) {
                // returns true if the current column is a win
                return true;
            }
        }
    
        // Check diagonals
        char[] diagonal1 = new char[size];
        char[] diagonal2 = new char[size];
        // nested for loop that iterates through the rows of the board
        for (int i = 0; i < size; i++) {
            // sets the current position of the diagonal1 and diagonal2 to the current position of the board
            diagonal1[i] = board[i][i];
            // sets the current position of the diagonal1 and diagonal2 to the current position of the board
            diagonal2[i] = board[i][size - i - 1];
        }
        // returns true if the current diagonal is a win
        return checkLineForWin(diagonal1) || checkLineForWin(diagonal2);
    }
    
    // private method that takes an array of characters as an argument and returns a boolean
    private boolean checkLineForWin(char[] line) {
        // sets the first character of the line to the first character of the line
        char first = line[0];
        // checks if the first character of the line is a hyphen
        for (char c : line) {
            // returns false if the current character is not the same as the first character or is a hyphen
            if (c != first || c == '-') {
                // returns false if the current character is not the same as the first character or is a hyphen
                return false;
            }
        }
        // returns true if the line is a win
        return true;
    }
    
    // public method that takes no arguments and returns nothing
    public void play() {
        // creates a new scanner object called scanner
        Scanner scanner = new Scanner(System.in);
        // prints a message asking the user if they want to play single player
        System.out.println("Do you want to play single player? (y/n)");
        // reads the next line of input from the scanner and stores it in a string called response
        String response = scanner.nextLine();
        // creates a new boolean called newSinglePlayer and sets it to true if the response is "y"
        boolean newSinglePlayer = response.equalsIgnoreCase("y");
    
        // If the game mode has changed, reset the scores
        if (newSinglePlayer != singlePlayer) {
            // sets the singlePlayer to the newSinglePlayer
            singlePlayer = newSinglePlayer;
            // resets the wins, losses, and ties to 0
            wins = 0;
            // resets the losses to 0
            losses = 0;
            // resets the ties to 0
            ties = 0;
        }
    
        // prints a message asking the user if they want to play single player
        while (true) {
            // prints a message asking the user if they want to play single player
            printBoard();
            // creates a new integer called row and sets it to -1
            int row = -1;
            // creates a new integer called col and sets it to -1
            int col = -1;
            // creates a new boolean called moveMade and sets it to false
            boolean moveMade = false;
            // prints a message asking the user if they want to play single player
            while (!moveMade) {
                // checks if the current player is 'X' or if the game mode is multiplayer
                if (currentPlayer == 'X' || !singlePlayer) {
                    // prints a message asking the user if they want to play single player
                    System.out.println("Player " + currentPlayer + ", enter a row and column ex: \" 1 1 \"");
                    // creates a new integer called row and sets it to -1
                    try {
                        // reads the next integer from the scanner and stores it in a variable called row
                        row = scanner.nextInt() - 1;
                        // reads the next integer from the scanner and stores it in a variable called col
                        col = scanner.nextInt() - 1;
                        // sets moveMade to the result of the makeMove method with the row and col as arguments
                    } catch (InputMismatchException e) {
                        // prints a message if the input is invalid
                        System.out.println("Invalid input. Please enter integers.");
                        // reads the next line of input from the scanner and stores it in a string called response
                        scanner.next();
                        // continues to the next iteration of the loop
                        continue;
                    }
                    // sets moveMade to the result of the makeMove method with the row and col as arguments
                } else {
                    // creates a new integer called row and sets it to -1
                    row = new Random().nextInt(size);
                    // creates a new integer called col and sets it to -1
                    col = new Random().nextInt(size);
                }
                // sets moveMade to the result of the makeMove method with the row and col as arguments
                moveMade = makeMove(row, col);
            }
    
            // checks if the current player has won
            if (checkForWin()) {
                // prints the board
                printBoard();
                // prints a message saying the current player has won
                System.out.println("Player " + currentPlayer + " wins!");
                // increments the wins if the current player is 'X' or the losses if the current player is 'O'
                if (currentPlayer == 'X') {
                    // increments the wins if the current player is 'X'
                    wins++;
                    // increments the losses if the current player is 'O'
                } else {
                    // increments the losses if the current player is 'O'
                    losses++;
                }
                // breaks out of the loop
                break;
                // checks if the board is full
            } else if (isBoardFull()) {
                // prints the board
                printBoard();
                // prints a message saying the game is a tie
                System.out.println("The game is a tie!");
                // increments the ties
                ties++;
                // breaks out of the loop
                break;
            }
            // changes the current player
            changePlayer();
        }
    
        // prints a message asking the user if they want to play again
        System.out.println("Do you want to play again? (y/n)");
        // reads the next line of input from the scanner and stores it in a string called playAgain
        String playAgain = scanner.next();
        // checks if the user wants to play again
        if (playAgain.equalsIgnoreCase("y")) {
            // initializes the board
            initializeBoard();
            // play method
            play();
            // prints the final scores
        } else {
            System.out.println("Total wins: " + wins);
            System.out.println("Total losses: " + losses);
            System.out.println("Total ties: " + ties);
        }
    }
    
    // main method
    public static void main(String[] args) {
        // creates a new TicTacToe object called game
        TicTacToe game = new TicTacToe();
        // calls the play method on the game object
        game.play();
    }

}