/*
Name: Garrett Dodd
Professor: Dr. Herath
Course: CIS 315
Date: 24 January 2022
Due Date: 27 January 2022
*/



import java.util.Scanner;

public class WageCalculator  
{ 
   public static void main(String[] args) 
   { 
   
      // Declare variables for the inputs and output 
 
       String name; 
       double regularWages; 
       double overtimeWages;       
       double totalWages; 
 
//  Create a Scanner object to read input. 
 // TO DO  
        Scanner keyboard = new Scanner(System.in);
// Prompt the user for the employee name 
 // TO DO 
        System.out.println("Input Employee Name: ");
        name = keyboard.nextLine();
 // Prompt the user for the regular wage amount 
 // TO DO 
        System.out.println("Input regular wages: ");
        regularWages = keyboard.nextDouble();
 
//  Prompt the user for overtime amount 
//  TO DO  
        System.out.println("Input overtime wages: ");
        overtimeWages = keyboard.nextDouble();
 // Calculate the total wage amount 
 //  TO DO  
        totalWages = overtimeWages + regularWages;
 // Display the output 
// TO DO  
     System.out.println("Hello " + name);
     System.out.println("Total wages: " + totalWages);
  } 
} 