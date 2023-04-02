/*
 * Name of program: Recursion Snippets
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 19, 2022
 */

//Grouped class stucture, needed to resolve warnings
package recursionsnippets;

public class BunnyEars2Recursion {
    //Declares a function named "bunnyEars2" to be called on later
    static int bunnyEars2(int bunnies) {
        //Runs until the value of "bunnies" is exhausted
        if (bunnies == 0) return 0;

        //Removes one from "bunnies", then adds three and divides it by two
        return bunnyEars2(bunnies-1)+3-bunnies%2;
    }

    public static void main(String[] args) {
        //Declares integer variables for the input and output
        int number = 24;
        int result;

        while (number > -1) {
            //Processes the factorial of "number"
            result = bunnyEars2(number);

            //Prints the factorial of "number" to the terminal
            System.out.println("The bunny ears of " + number + " is " + result + ".");

            //Removes one from "number"
            number--;
        }
    }
}