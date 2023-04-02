/*
 * Name of program: Calculate ROI Program
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 30, 2022
 */

//Grouped class stucture, needed to resolve warnings
package calculateroiprogram;

//Provides list, scanner, and comparison capabilities to Java
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Collections;
import java.util.Comparator;

//Requests user input, then sorts that input by cost ROI and prints to the terminal
public class CalculateROIProgram {
	public static void main(String[] args) {
		//Creates "scanner" scanner - takes input from the system
        Scanner scanner = new Scanner(System.in);
		
        //Creates linked lists to be used later
		LinkedList<String> equipments = new LinkedList<>();
		LinkedList<Double> roiValues = new LinkedList<>();
		
        //Loops three times, adds one to "i" for each run
        for (int i = 0; i < 3; i++) {
            //Prints text to the terminal, reads user input, then appends to "brandName" variable
            System.out.println("\nEnter Information for Equipment #" + (i + 1));
			System.out.print("  Equipment Brand Name: "); 
            String brandName = scanner.nextLine();
			
            //Prints text to the terminal, reads user input, then appends to "gain" variable
            System.out.print("  Cash Received (Gain): $");
			double gain = scanner.nextDouble();
			
            //Prints text to the terminal, reads user input, then appends to "cost" variable
            System.out.print("  Total Equipment Cost: $");
			double cost = scanner.nextDouble();
			
            //Ensures scanner data is appended without issue
            scanner.nextLine();

			//Calculates ROI value and appends it to "roiValues" list
			double tempROIValue = ((gain - cost) /cost) *100;
			roiValues.add(tempROIValue);

			//Appends user entries to the end of the "equipments" list
			equipments.add("Return on Investment (ROI): " + tempROIValue + "%\n" +
			"Equipment Brand Name: " + brandName + "\n" +
			"Cash Received (Gain): $" + gain + "\n" +
			"Total Equipment Cost: $" + cost + "\n");
		}
		
		//Sorts "equipments" by way of "roiValues"
		int[] sortedIndices = IntStream.range(0, roiValues.size())
        	//Sorts "roiValues" list and documents each element's movements
			.boxed().sorted(Comparator.comparing(roiValues::get))
        	.mapToInt(x -> x).toArray();

		//Creates a new list "equipmentSorted" to process data into
		LinkedList<String> equipmentSorted = new LinkedList<>();
		
		//Sorts all data from "equipments", then shifts it into "equipmentSorted"
		for (int i = 0; i < sortedIndices.length; i++) {
    		//"roiValues" list's element movements are carried out on "equipmentSorted"
			equipmentSorted.add(equipments.get(sortedIndices[i]));
		}

		//Reverses "equipmentSorted" so that ROI is listed best to worst
		Collections.reverse(equipmentSorted);
		
		//Prints "Equipment" list after being sorted
        System.out.println("\n-----------------------------------------\n" + 
                            "List of equipment from best to worst ROI:\n" + 
                            "-----------------------------------------\n");
		for (String equipment : equipmentSorted) {
			System.out.println(equipment);
		}
		scanner.close();
		
        //Prints text to the terminal
		System.out.println("The program has finished processing!\n");
	}
}