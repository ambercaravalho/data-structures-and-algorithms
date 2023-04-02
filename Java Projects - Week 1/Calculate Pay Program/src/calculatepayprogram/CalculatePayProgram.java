//Grouped class stucture, needed to resolve warnings
package calculatepayprogram;

/*
 * Name of program: Calculate Pay Program
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: December 19, 2022
 */

//Provides text parsing capabilities to this program
import java.util.Scanner;

public class CalculatePayProgram {
        private static final String DECIMALVALUE = "%,.2f"; //String declaration, needed to resolve warnings
        public static void main(String[] args) {

            //Variable declarations
            double hoursWorked = 0;
            double overtimeWorked = 0;
            double grossPay = 0;
            double rateOfPay = 0;
            double federalTax = 0.15;
            double stateTax = 0.0307;
            double medicareTax = 0.0145;
            double socialSecurityTax = 0.062;
            double unemploymentTax = 0.0007;
            double deductionTotal = 0;
            double netPay = 0;
            String employeeName;
            
            try (Scanner userInput = new Scanner(System.in)) { //Prevents memory leaks, needed to resolve warnings
                //User input -> employeeName variable
                System.out.println ("Enter An Employee's Name:");
                employeeName = userInput.nextLine();
                
                //User input -> rateOfPay variable
                System.out.println ("Enter Their Rate of Pay (Hourly):");
                try {
                    rateOfPay = userInput.nextDouble();

                    //User input -> hoursWorked variable
                    System.out.println ("Enter Number of Hours Worked During This Period:");
                    try {
                        hoursWorked = userInput.nextDouble();
                    }
                    catch (Exception exception) { //Error printed to terminal if non-numeric value entered.
                        System.out.println ("Error! Enter numeric values only.");
                        System.exit(0); //Exits the program
                    }
                }
                catch (Exception e) { //Error printed to terminal if non-numeric value entered.
                    System.out.println ("Error! Enter numeric values only.");
                    System.exit(0); //Exits the program
            }
            
            //Prints first set of user inputs (variables) to terminal
            System.out.println ();
            System.out.println ("Employee Name: " + employeeName);
            System.out.println ("Rate of Pay: $" +  String.format(DECIMALVALUE, rateOfPay) + "/hour");
            System.out.println ("Hours Worked: " + hoursWorked);

            //Caculates pay based on no overtime
            if (hoursWorked <= 40) { //Less than or equal to 40
                grossPay = hoursWorked * rateOfPay;
            }
            //Calculates pay based on overtime
            else { //More than 40
                overtimeWorked = hoursWorked - 40.0;
                grossPay = overtimeWorked * rateOfPay * 1.5;
            }
            
            //Calcuates net pay based on declared decutions
            if (grossPay > 0) {
                deductionTotal = (federalTax * grossPay) + (stateTax * grossPay) + (medicareTax * grossPay) + (socialSecurityTax * grossPay) + (unemploymentTax * grossPay);
                netPay = (grossPay - deductionTotal);
            }
            
            //Prints second set of user inputs (variables) to terminal
            System.out.println ("Overtime Worked (Hours): " + overtimeWorked);
            System.out.println ("Gross Pay: $" + String.format(DECIMALVALUE, grossPay));
            System.out.println ("Deductions: $" + String.format(DECIMALVALUE, deductionTotal));
            System.out.println ("Net Pay: $" + String.format(DECIMALVALUE, netPay));
        }
    }
}