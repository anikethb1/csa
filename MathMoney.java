/*
Aniketh Bandlamudi
*/


import java.lang.Math;
import java.util.Scanner;

public class MathMoney {
    public static void main(String[] args) {
        // call your methods here
        // sets the amount of time needed to calculate market return
        double time = setTime();
        // sets the amount of money being placed into the market
        double principle = setPrincipal();
        // prints the amount after
        System.out.println(calcMarketReturn(principle, time));
        // prints the monthly mortgage cost
        System.out.println(calcMonthly());

    }

    // set time method
    public static double setTime() {
        Scanner scan = new Scanner(System.in);
        // promts the user to enter a value
        System.out.println("How long do you want to save money, enter years, months, and days:\nYears: ");
        // the amount of years
        double y = scan.nextInt();
        System.out.println("Months: ");
        // amount of months
        double m = scan.nextInt();
        System.out.println("Days: ");
        // amount of days
        double d = scan.nextInt();


        double time = y + (m/12) + (d/365); //update formula here
        double newTime = truncate(time, 5); // call the truncate method here
        // returns the truncated value of time
        return newTime;
    }

    // setPrincipal method
    public static double setPrincipal() {
        Scanner scan = new Scanner(System.in);
        // prompts the user to enter a value
        System.out.print("How much money would you like to save? $");
        // sets the inputted value to the variable principal
        double principal = scan.nextDouble();
        // returns the value entered
        return principal;
    }

    //calcMarketReturn method
    public static double calcMarketReturn(double principal, double time) {
        // sets the exponent to a variable to make the next line more clear
        double exponent = 0.07*time;
        // the formula in the instructions
        double money = principal * (Math.exp(exponent));
        // truncates the money to 2 decimal places
        money = truncate(money, 2);
        //returns the value of money
        return money;
    }

    //truncate method
    public static double truncate(double num, int place) {
        // rounds num to the number of places specified
        double truncated = (double)(Math.round(num * place)) / place;
        // returns the truncated value
        return truncated;
    }

    //calcMonthly method
    public static double calcMonthly() {
        Scanner scan = new Scanner(System.in);
        // prompts the user to enter info
        System.out.print("How much money would you like to borrow? $");
        double principal = scan.nextDouble();
        System.out.print("How many years would you like to borrow the money? ");
        int years = scan.nextInt();
        System.out.print("What is the current APR? ");
        double apr = scan.nextDouble();

        // apr is annual so this splits it into monehts
        double r = apr/12;

        // the loan term is monthly not yearly so the value is multiplied by 12
        int n = years*12;

        // the mortgage formula in the instructions
        double m = principal * ((r*(Math.pow((1+r),n))))/(Math.pow((1+r),n)-1);
        // returns the value of m
        return m;

    }



}