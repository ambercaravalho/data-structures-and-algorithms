//Grouped class stucture, needed to resolve warnings
package popandpeekoperations;

/*
 * Name of program: Pop and Peek Operations
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 12, 2023
 */

//Provides stack functionality to the program
import java.util.Stack;

public class PopAndPeekOperations {
    public static void main(String[] args) {
        //Creates a stack named "catBreeds"
        Stack<String> catBreeds = new Stack<>();

        //Adds items to the stack we just created
        catBreeds.add ("Siamese");
        catBreeds.add ("Persian");
        catBreeds.add ("British Shorthair");
        catBreeds.add ("Bombay");
        catBreeds.add ("Siberian");
        catBreeds.add ("Munchkin");

        //Runs operations six times (for the six items in our stack)
        for(int i = 0; i < 6; ++i) {
            //Prints the current stack to the terminal
            System.out.println("Current stack: " + catBreeds);
            
            //Prints the current stack to the terminal
            System.out.println("First item in the stack: " + catBreeds.peek());

            //Removes the first item from the stack, then prints what was removed to the terminal
            System.out.println("Item removed from the stack: " + catBreeds.pop());
        }
    }
}