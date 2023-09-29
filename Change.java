/*
Name: Aniketh Bandlamudi
Assignment:  Change Lab
Date: Sep 20
*/

// import scanner class
import java.util.Scanner;

public class Change
{
    public static void main(String[] args)
    {
        // prompts user to enter an amount of money
        System.out.println("Enter an amount of money to be broken: ");

        // declares a variable, userInput, using the inputted value
        Scanner scan = new Scanner(System.in);
        double userInput = Double.parseDouble(scan.nextLine());

        // calls the makeChange function
        makeChange(userInput);

    }

    // create method here:

    // method to determine number of hundreds
    // precondition: money is positive
    // postcondition: return the amount of hundreds
    public static int hundred(double m) {
        int hundreds = (int) m / 100;
        return hundreds;
    }

    // method to determine number of fifties
    // precondition: money is positive
    // postcondition: return the amount of fifties
    public static int fifty(double m) {
        int fifties = (int) m % 100 / 50;
        return fifties;
    }

    // method to determine number of twenties
    // precondition: money is positive
    // postcondition: return the amount of twenties
    public static int twenty(double m) {
        int twenties = (int) m % 100 % 50 / 20;
        return twenties;
    }

    // method to determine number of tens
    // precondition: money is positive
    // postcondition: return the amount of tens
    public static int ten(double m) {
        int tens = (int) m % 100 % 50 % 20 / 10;
        return tens;
    }

    // method to determine number of fives
    // precondition: money is positive
    // postcondition: return the amount of fives
    public static int five(double m) {
        int fives = (int) m % 100 % 50 % 20 % 10 /5;
        return fives;
    }

    // method to determine number of ones
    // precondition: money is positive
    // postcondition: return the amount of ones
    public static int one(double m) {
        int ones = (int) m % 100 % 50 % 20 % 10 % 5 /1;
        return ones;
    }

    // method to determine number of quarters
    // precondition: money is positive
    // postcondition: return the amount of quarters
    public static int quarter(double m) {
        int quarters = (int) (m % 100 % 50 % 20 % 10 % 5 % 1 / 0.25);
        return quarters;
    }

    // method to determine number of dimes
    // precondition: money is positive
    // postcondition: return the amount of dimes
    public static int dime(double m) {
        int dimes = (int) (m % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 / 0.1);
        return dimes;
    }

    // method to determine number of nickels
    // precondition: money is positive
    // postcondition: return the amount of nickels
    public static int nickel(double m) {
        int nickels = (int) (m % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.1 / 0.05);
        return nickels;
    }

    // precondition: n is a number
    // postcondition: return a rounded version of the entered number
    /*
    This is used because of a floating point roundoff error. For example, if the amount money is $0.77,
    the computer is not able to represent that. Rather it creates a long, inacurate decimal. Java rounds
    down, so this would lead to a missing penny in some cases. This function works by multiplying by 100
    and dividing back by 100 so that it ensures that the number is accurate up till the hundredths place.
    */
    public static double rounded(double n){
        return Math.round(n * 100.0)/100.0;
    }

    // method to determine number of pennies
    // precondition: money is positive
    // postcondition: return the amount of pennies
    public static int penny(double m) {
        int pennies = (int) (rounded(m % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.1 % 0.05) / 0.01);
        return pennies;
    }

    // precondition: money is positive
    // postcondition: prints the amount of each bill / coin type by calling each method created above
    public static int makeChange(double m){
        System.out.println("Hundreds: " + hundred(m));
        System.out.println("Fifties: " + fifty(m));
        System.out.println("Twenties: " + twenty(m));
        System.out.println("Tens: " + ten(m));
        System.out.println("Fives: " + five(m));
        System.out.println("Ones: " + one(m));
        System.out.println("Quarters: " + quarter(m));
        System.out.println("Dimes: " + dime(m));
        System.out.println("Nickels: " + nickel(m));
        System.out.println("Pennies: " + penny(m));

        return 0;
    }



}