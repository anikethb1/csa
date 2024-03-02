/* Date: January 4 2024
Name: Aniketh Bandlamudi
ArrayListPractice

*/

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice
{
   /* Ccompleted Method: printArrayList(ArrayList arrli)
   
   public static void printArrayList(ArrayList arrli) {
      for (int i=0; i<arrli.size(); i++)
      {
         System.out.print(arrli.get(i));
         if (i<arrli.size()-1)
         {
            System.out.print(",");
         }
      }
      System.out.println();
   }
   


   
   public static void main(String[] args) {
      //The following is code to test the flip method.
      ArrayList<Boolean> lights = new ArrayList<Boolean >();//Creates an ArrayList of Boolean type, called lights
      lights.add(true); //puts a value in the list
      lights.add(true); //puts a value in the list
      lights.add(false); //puts a value in the list
      printArrayList(lights); //calls printArrayList to print the original values
      flip(lights); // calls the flip method
      printArrayList(lights); //calls printArrayList toprints the new values
   }
  
    /* Method 0: flip
    * Inputs an ArrayList of Boolean
    * Modifies ArrayList by changing all values of true to false and vice-versa  
    * No return
   */ 
   public static void flip(ArrayList<Boolean> arrli) {
      for (int i=0; i<arrli.size(); i++)
      {
         if (arrli.get(i)==true)
         {
            arrli.set(i, false);
         }
         else
         {
            arrli.set(i, true);
         }
      }
   }

   /* Method 1: negate
    * Inputs an ArrayList of Integer
    * Modifies ArrayList by multiplying all values of arrli by -1
    * No return
   */
   public static void negate(ArrayList<Integer> arrli) {
    for (int i=0; i<arrli.size(); i++)
      {
         arrli.set(i, arrli.get(i)*-1);
      }
   }
  
   /* Method 2: removeNegatives
    * Inputs an ArrayList of Integer
    * Modifies ArrayList by removing all values of arrli that are negative
    * No return
   */
   public static void removeNegatives(ArrayList<Integer> arrli) {
      for (int i=0; i<arrli.size(); i++)
      {
         if (arrli.get(i)<0)
         {
            arrli.remove(i);
            i--;
         }
      }
   }
   
   /* Method 3: longestWord
    * Inputs an ArrayList of String
    * Does not modify the ArrayList
    * Returns the longest word in the ArrayList
   */
  
   public static String longestWord(ArrayList<String> arrli) {
        for (int i=0; i<arrli.size(); i++) {
            if (arrli.get(i).length() > arrli.get(i+1).length()) {
                return arrli.get(i);
            }
        
        }
        return null;
   }
   
   /*Method 4: counter
    * Inputs an ArrayList of String
    * Does not modify the ArrayList
    * Returns the number of occurrences of let in all of the strings in arrli
   */
    public static int counter(ArrayList<String> arrli, String let) {
        int count = 0;
        for (int i=0; i<arrli.size(); i++) {
            if (arrli.get(i).equals(let)) {
                count++;
            }
        }
        return count;
    }

    /*Method 5: odds
    * Inputs an int to represent the largest possible odd number
    * Creates and returns an ArrayList of odd ints, starting at 1 going up to and possible including max
    * odds(10) would create and return an ArrayList of {1,3,5,7,9} 
    * odds(15) would create and return an ArrayList of {1,3,5,7,9,11,13,15}
    */
    public static ArrayList<Integer> odds(int max) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i=1; i<=max; i+=2) {
            oddNumbers.add(i);
        }
        return oddNumbers;
    }

    /*Method 6: wordSplitter
    * Inputs a String of multiple words
    * Creates and returns an ArrayList of String with each word split (and the spaces removed)
    Example: wordSplitter("This is a sentence") would create and return an ArrayList of {"This", "is", "a", "sentence"}
    */
    public static ArrayList<String> wordSplitter(String sentence) {
         ArrayList<String> words = new ArrayList<>();
         String[] splitWords = sentence.split(" ");
         for (int i=0; i<splitWords.length; i++) {
               words.add(splitWords[i]);
         }
         return words;
    }
   
}