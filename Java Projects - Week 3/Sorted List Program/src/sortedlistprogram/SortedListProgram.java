/*
 * Name of program: Sorted List Program
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 16, 2022
 */

//Grouped class stucture, needed to resolve warnings
package sortedlistprogram;

//Provides Java with linked list functionality
import java.util.LinkedList;

public class SortedListProgram {
    public static void main(String[] args) {
		//Creates a linked list named "citiesList"
        LinkedList<String> citiesList = new LinkedList<>();
		
		//INPUT -- Adds elements to the linked list created above
		citiesList.add("Seattle");
		citiesList.add("San Antonio");
		citiesList.add("Dayton");
		citiesList.add("Richmond");
		citiesList.add("Miami");
		
		//1: OUTPUT -- Prints the original contents of the linked list to terminal
		System.out.println("Original List: " + citiesList);

		//2: PROCESSING -- Adds an element to a specific location in the linked list
		citiesList.add(4,"Topeka");

        //3: OUTPUT -- Prints the updated contents of the linked list to terminal
		System.out.println("List w/ Added City: " + citiesList); 
		
		//4: PROCESSING -- Removes an element from a specific location in the linked list
		citiesList.remove(1);

		//5: OUTPUT -- Prints the updated contents of the linked list to terminal
		System.out.println("List w/ Removed City: " + citiesList);
    }
}