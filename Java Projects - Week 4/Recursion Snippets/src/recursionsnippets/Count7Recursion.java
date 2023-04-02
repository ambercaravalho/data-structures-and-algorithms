/*
 * Name of program: Recursion Snippets
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 19, 2022
 */

//Grouped class stucture, needed to resolve warnings
package recursionsnippets;

//Provides random number generation capabilities to Java
import java.util.concurrent.ThreadLocalRandom;

public class Count7Recursion {
    //Declares a function named "count7" to be called on later
    static int count7(int n) {
        //Counts the number of sevens in "number"
        int counter = 0;

        //Add one to "counter" when a seven is found in the rightmost digit of "number"
        if(n % 10 == 7) counter++;

        //Provides the value of "counter" to "result" when processing is complete
        if(n / 10 == 0)  return counter;

        //Removes the rightmost digit of "number", runs the function again
        return counter + count7(n/10);
    }

    public static void main(String[] args) {
        //Declares integer variables for the input and output
        int result;
        int countdown = 25;

        while (countdown > -1) {
            //Randomly generates a number
            int number = ThreadLocalRandom.current().nextInt();

            //Processes the factorial of "number"
            result = count7(number);

            //Prints the factorial of "number" to the terminal
            System.out.println("There is/are " + result + " seven(s) in " + number + ".");

            //Removes one from "number"
            countdown--;
        }
    }
}