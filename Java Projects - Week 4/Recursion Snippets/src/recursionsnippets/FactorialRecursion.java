/*
 * Name of program: Recursion Snippets
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 19, 2022
 */

//Grouped class stucture, needed to resolve warnings
package recursionsnippets;

public class FactorialRecursion {
    //Declares a function named "factorial" to be called on later
    static int factorial(int n) {
        //Runs until the value of "number" is exhausted
        if (n != 0) 
            //Multiplies "number" by itself, then removes one
            return n * factorial(n-1); 
        else
            return 1;
    }

    public static void main(String[] args) {
        //Declares integer variables for the input and output
        int number = 9;
        int result;

        while (number > -1) {
            //Processes the factorial of "number"
            result = factorial(number);

            //Prints the factorial of "number" to the terminal
            System.out.println("The factorial of " + number + " is " + result + ".");

            //Removes one from "number"
            number--;
        }
    }
}