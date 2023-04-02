/*
 * Name of program: Binary Search Program
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 09, 2022
 */

//Grouped class stucture, needed to resolve warnings
package binarysearchprogram;

public class BinarySearchProgram {
    //INPUT -- Declared list to be searched though later
    private static int[] searchList = new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70};
    
    //PROCESSING -- Completes binary searches for numbers 17 and 45 against the declared list
    public static void main(String[] args)
    {		
    	if (binarySearch(searchList, 17)) //Searches for 17 in the declared list
        { 
    	   System.out.println("The number 17 was found in the list!"); //OUTPUT -- Success
        } 
        else 
        {
            System.out.println("The number 17 was NOT found in the list!"); //OUTPUT -- Failure
        }
        
        if (binarySearch(searchList, 45)) //Searches for 45 in the declared list
        { 
            System.out.println("The number 45 was found in the list!"); //OUTPUT -- Success
        } 
        else 
        {
            System.out.println("The number 45 was NOT found in the list!"); //OUTPUT -- Failure
        }
    }
    
        //PROCESSING -- Generates a function to perform a binary search lookup
    	private static boolean binarySearch (final int[] array, final int search)
    	{
    		int first = 0;
    		int last = array.length - 1;
    		int middle = (first + last) / 2;
    		
    		while (first <= last) //Loops section until all values have been exhausted in a defined list "array"
    		{
    			if (array[middle] < search) //If the middle value of "array" is less than a defined value "search", then the search area is positively incremented
    			{
    			  first = middle + 1;
    			}
    			else if (array[middle] == search) //Returns a True value if a defined value "search" is found in "array"
    			{
    			  return true;
    			} 
    			else //If the middle value of "array" is more than a defined value "search", then the search area is negatively incremented
    			{
    				last = middle -1;
    			}
    			
    			middle = (first + last) / 2; //Cuts the search area in half to begin next loop
    		}
    		return false; //Returns a False value if a defined value "search" is NOT found in "array"
    	}
}