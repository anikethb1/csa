/* Introduction:
      Random Number Practice
      Complete the implementation of each method below:
      The return values are currently set to default values {0, 0.0, false, ""}
 */

 /*To Test Code: call each method from interaction tab:
      Remember leave off ; when in interaction page to 'see' the result

   To call a STATIC method:
      className.methodName(args)

    For example:
      RandomNumbers.randGPA()
      RandomNumbers.randBetween(3,5)

      Name: Aniketh Bandlamudi
      Date: Oct 5, 2022 */

import java.lang.Math; //This gives us access to Math.random()
public class RandomNumbers
{

    //returns a random GPA from [0.00-4.00)
    //Postcondition:
    public static double randGPA()
    {
        return Math.round((Math.random() * 4) * 100) / 100.0;
    }

    //returns a random int from {0,1,2...,9}
    public static int randDigit()
    {
        return (int) (Math.random()*10);
    }

    //returns a random percent from {0,1,2...,100} formatted as an int
    public static int randPercent()
    {
        return (int) (Math.random()*100);
    }

    //returns a random gradeLevel from {9, 10, 11, 12}
    public static int randGradeLevel()
    {
        return (int) (Math.random() * 4 + 9);
    }



    /*returns a random int from {start, start+1, start+2, ... stop} inclusive of start and stop.
    Examples:    randBetween(4,10) returns one of: {4, 5, 6, ... ,9, 10}
                  randBetween(12,15) returns one of: {12, 13, 14, 15} */
  /* Precondition: stop >= start.
   Precondtion: start and stop are  positive
   Postcondition: Each of the random values occurs with equal probability. */
    public static int randBetween(int start , int stop)
    {
        return (int) (Math.random() * (stop - start + 1)) + start;
    }

    /*returns a random int from {start, start+step, start+2*step,...,  stop}
    Examples: randBetween(4, 10, 2) returns one of the following with equal probability
          {4, 6, 8, 10}
    randBetween(3, 29, 4) returns one of the following with equal probability
          {3, 7, 11, 15, 19, 23, 27} */
    //Precondition: stop >= start.
    //Precondtion: start, stop, step are positive
    public static int randBetween(int start, int stop, int step)
    {
        return (int) (Math.random() * ((stop - start + 1) / step) + 1) * step + start;
    }

   /*Below this point requires knowledge from Unit 3 - Conditionals
   ------------------------------------------------------------- */

    /*returns a random vowel with equal prob.
    returns one of the following: {a, e, i, o, u} each with 20% probability of occuring */
    public static String randVowel()
    {
        int randomNumber = (int) (Math.random() * 5);

        if (randomNumber == 0) {
            return String.valueOf('a');
        }

        else if (randomNumber == 1) {
            return String.valueOf('e');
        }

        else if (randomNumber == 2) {
            return String.valueOf('i');
        }

        else if (randomNumber == 3) {
            return String.valueOf('o');
        }

        else if (randomNumber == 4) {
            return String.valueOf('u');
        }

        else {
            return String.valueOf('a');
        }
    }

    //retunrs a random true or false with equal prob.
    public static boolean randBool()
    {
        int randomNumber = (int) (Math.random() * 2);

        if (randomNumber == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    //Giannis' Career free throw percentage is 72%
    //Create a method to simulate Giannis shooting a free throw:
    //returns true (made FT) 72% of time
    //returns false (missed FT) 28% of time
    public static boolean freeThrow()
    {
        int randomNumber = (int) (Math.random() * 100);

        if (randomNumber <= 72) {
            return true;
        }

        else {
            return false;
        }
    }

    //Generalize the previous method to work for a method  'per'
    // percentTrue(.2);  provides a random boolean with 20% probability of true, 80% probability of false
    // percentTrue(.99); provides a random boolean with 99% probability of true, 1% probability of false
    public static boolean percentTrue(double per)
    {
        int randomNumber = (int) (Math.random() * 100);

        if (randomNumber <= per) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(randGPA());
        System.out.println(randDigit());
        System.out.println(randPercent());
        System.out.println(randGradeLevel());
        System.out.println(randBetween(randPercent(), randPercent()));
        System.out.println(randBetween(randPercent(), randPercent(), randDigit()));
        System.out.println(randVowel());
        System.out.println(randBool());
        System.out.println(freeThrow());
        System.out.println(percentTrue(randPercent()));
    }
}