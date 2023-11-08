/* Conditional Practice
   Complete the implementation of each method below:
   The return values are currently set to default values {0, false}
 */

 /*To Test Code: call each method from interaction tab:
      Remember leave off ; when in interaction page to 'see' the result

   To call a STATIC method:
      className.methodName(args)

    For example:
      Conditionals.isEven(4)

Date: Sept/27/2022
Name: Aniketh Bandlamudi
 */

import java.lang.Math;
public class Conditionals
{

    /*Method returns true if num is even
             returns false otherwise
          Ex: isEven(4) --> true      isEven(7) --> false */
    public static boolean isEven(int num)
    {
        if (num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    /*Method returns a positive int as the absolute value:
      use a condition, instead of calling Math.abs
          Ex: abs(-5) --> 5      abs(7) --> 7 */
    public static int abs(int num)
    {
        int pos = 0;
        if (num < 0) {
            pos = Math.abs(num);
        } else {
            pos = num;
        }
        return pos;
    }

    /*Method returns true if b is a multiple of a
           returns false otherwise
      Precondition: b is not 0.
          Ex: isMultiple(25,5) --> true      isMultiple(10,4) --> false */
    public static boolean isMultiple(int a, int b)
    {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }

    }


    // Method returns the smaller int value: a or b
    public static int min(int a, int b)
    {
        if (a < b) {
            return a;
        } else if (b < a) {
            return b;
        } else {
            return a;
        }
    }

    // Method returns the smallest int value: a, b, or c
    public static int min(int a, int b, int c)
    {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else if (a == b) {
            return a;
        } else if (b == c) {
            return b;
        } else if (a == c) {
            return a;
        }


        return 0;
    }
    // Method returns the larger int value: a or b
    public static int max(int a, int b)
    {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return a;
        }
    }

    // Method returns the larger int value: a, b, or c
    public static int max(int a, int b, int c)
    {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else if (a == b) {
            return a;
        } else if (b == c) {
            return b;
        } else if (a == c) {
            return a;
        }

        return 0;
    }

    /* Method returns true if the two larger numbers are both a multiple of the smallest number
       returns false otherwise.
       You must call the MIN method in the implementation of this method.

       Example1: isMultiple(10, 5, 20) returns true,
          because the smallest number is 5 and 10 and 20 are multiples of 5

       Example2: isMultiple(2, 21, 28) returns false,
          because the smallest number is 2 but 21 is not a multiple of 2

       Precondition: a, b, and c are positive
       Postcondition: The order in which the arguments a, b, and c are provided do NOT effec the result.
    */
    public static boolean isMultiple(int a, int b, int c)
    {
        int min = min(a, b, c);
        if (a % min == 0 && b % min == 0 && c % min == 0) {
            return true;
        } else {
            return false;
        }

    }

    // Method returns the longest String: a or b
    public static String longest(String a, String b)
    {
        if (a.length() > b.length()) {
            return a;
        } else if (a.length() < b.length()) {
            return b;
        } else {
            return a;
        }
    }

    // Method returns the longest String value: a, b, or c
    public static String longest(String a, String b, String c)
    {
        if (a.length() > b.length() && a.length() > c.length()) {
            return a;
        } else if (b.length() > a.length() && b.length() > c.length()) {
            return b;
        } else if (c.length() > a.length() && c.length() > b.length()) {
            return c;
        } else if (a.length() == b.length()) {
            return a;
        } else if (b.length() == c.length()) {
            return b;
        } else if (a.length() == c.length()) {
            return a;
        }

        return "";
    }




    /*Returns true if String str has a vowel at index i, false otherwise
    If the index i is out of bounds, return false
    */
    public static boolean isVowel(String str, int i)
    {
        if (i <= str.length() && i >= 0) {
            char charAt = str.charAt(i);
            if ("AEIOUaeiou".contains(String.valueOf(charAt))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(abs(-5));
        System.out.println(isMultiple(9, 3));
        System.out.println(min(5, 3));
        System.out.println(min(5, 1, 3));
        System.out.println(max(2, 5));
        System.out.println(max(2, 4, 1));
        System.out.println(isMultiple(5, 3, 20));
        System.out.println(longest("hello", "mr. arneja"));
        System.out.println(longest("i", "am", "tired"));
        System.out.println(isVowel("hello", 1));

    }

}
