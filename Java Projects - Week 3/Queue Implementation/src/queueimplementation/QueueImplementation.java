//Grouped class stucture, needed to resolve warnings
package queueimplementation;

/*
 * Name of program: Queue Implementation
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 12, 2023
 */

//Provides this program with linked list and queue functionality
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        //Create a queue named "applications"
        Queue<String>applications = new LinkedList<>();
        
        //Adds six items to the queue we just created
        applications.add("Google Chrome");
        applications.add("Microsoft Word");
        applications.add("Adobe Acrobat");
        applications.add("Spotify");
        applications.add("Slack");
        applications.add("McAfee");

        //Prints the current queue to the terminal
        System.out.println("Applications in queue: " + applications);

        //Prints the first item in the queue to the terminal using element
        System.out.println("First application in queue (element): " + applications.element());

        //Adds item to the queue if it is not full (only useful in finite queues)
        if (applications.offer("Mozilla Firefox"))
            System.out.println("Mozilla Firefox was added to the queue.");
        else
            System.out.println("The queue is full.");

        //Prints the first item in the queue to the terminal using peek
        System.out.println("First application in queue (peek): " + applications.peek());

        //Removes the first item in the queue, then prints what was removed to the terminal
        System.out.println(applications.poll() + " was removed from the queue.");

        //Prints the final queue to the terminal
        System.out.println("Applications in queue: " + applications);
    }
}
