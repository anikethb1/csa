/*Complete each method below. Each question MUST have a loop to recieve credit
To call a method:
   ClassName.methodName(arguments);
Example:
   LoopPrac.evens(15);
   LoopPrac.countUp(5);
   LoopPrac.numBetween(2,100);
*/

public class LoopPrac {
    
    /*Print each number between [0,num] inclusive
    //Example: LoopPrac.countUp(3)
       0
       1
       2
       3
     */
    //Precondition: max>0
    public static void countUp(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    //Prints each int between num and 0 in a new line
    //Precondition: max>0
    public static void countDown(int max) {
        while (max > 0) {
            System.out.println(max);
            max -= max;
        }
    }

    //Print each even number lower than and possibly including num, method can go in either order 0 -> num or num ->0
    //Precondition: num>0
    public static void evens(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Print each odd number lower than and possibly including num
    //Precondition: num>0
    public static void odds(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    /*Prints each number between start and stop on its own line
    Each number goes up by 1
    Example: LoopPrac.numBetween(3,7)
       3
       4
       5
       6
       7
       */
    //Precondition: start >0 && stop >0 && stop >= start
    public static void numBetween(int start, int stop) {
        for (int i = start; i <= stop; i++) {
            System.out.println(i);
        }
    }

    /*Prints one number per line, beginning at start, increasing by step, going up to and possibly including stop
    Each number goes up by step
    Example: LoopPrac.numBetween(4, 25, 3)
       4
       7
       10
       13
       16
       19
       22
       25
       */
    //Precondition: start >0 && stop >0 && step >0 && stop >= start
    public static void numBetween(int start, int stop, int step) {
        for (int i = start; i <= stop; i += step) {
            System.out.println(i);
        }
    }


    /*Prints the first five multiples between of the mult
    Example: LoopPrac.multiples(4);
       4
       8
       12
       16
       20
       */
    public static String multiples(int mult) {
        String multiples = "";
        for (int i = 1; i <= 5; i++) {
            multiples += mult * i + "\n";
        }
    return multiples;
}

    /*Prints each multiple between, and possibly including, min and max.
   Example: LoopPrac.multiplesOfBetween(8, 4, 60)
      8
      16
      24
      32
      40
      48
      56
      */
    //Precondition: mult >0 && stop >0 && start >0 && stop >= start
    public static void multiplesOfBetween ( int mult, int start, int stop){
        for (int i = start; i <= stop; i++) {
            if (i % mult == 0) {
                System.out.println(i);
            }
        }
    }

    /*Prints each letter of str on a new line.
    //Example: LoopPrac.letters("buddy");
    b
    u
    d
    d
    y
    */
    public static void letters (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    /*
    Returns a String in its reverse order
    Example: LoopPrac.letters("buddy");
    prints  yddub
    returns yddub
    */
    public static String reverse (String str){
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }


        //To receive full credit, you must call  the reverse method in the implementation for isPalindrome

    public static boolean isPalindrome (String str) {
        String reversedStr = reverse(str);
        return str.equals(reversedStr);
    }

    /* Returns the number of words in str
    Example: LoopPrac.wordCount("Hello my name is Mr. Arneja"); //returns 6
    */
    public static int wordCount (String str){
        int wordCount = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }

    /*Returns the number of occurences of target in str
     Examples: LoopPrac.substringCounter("mississippi", "ss"); //returns 2
               LoopPrac.substringCounter("mississippi", "i"); //returns 4
    */
        //Precondition: target.length() <= str.length()
    public static int substringCounter (String str, String target){
        int count = 0;
        int index = str.indexOf(target);
        while (index >= 0) {
            count++;
            index = str.indexOf(target, index + target.length());
        }
        return count;
    }

}
