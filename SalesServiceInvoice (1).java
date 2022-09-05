/* 
Name: Garrett Dodd
Email: gdodd1@una.edu
Program  Source  File  Name: SalesServiceInvoice.java
Due Date: Feb. 7, 2022
Course Information: CIS-315-01
Program Description: Asks user for name, total service cost, address, and mode of payment and provides a full invoice
Sources  Consulted: N/A
Honor Code Statement: In keeping with the honor code policies of the University of North Alabama, the School of Business, and the Department of Compute r Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.    ... My Signature is on File. */
import java.util.Scanner;

public class SalesServiceInvoice{
    public static void main(String[] args){
        //Declaring all variables
        String name;
        String address;
        double cost;
        double total;
        String mode = "";
        Scanner keyboard = new Scanner(System.in);


        //All inputs are gathered here
        //Printing invoice
        System.out.println("\n\nAcr-zSales Sales As A Service - INVOICE\n-----------------------------");

        System.out.print("\nCustomer Name: ");
        name = keyboard.nextLine();

        System.out.print("\nCustomer Address: " );
        address = keyboard.nextLine();

        System.out.print("\nMode of Payment: " );
        mode = keyboard.nextLine();

        System.out.print("\n\nCost of Sales Service: \t\t$");
        cost = keyboard.nextDouble();
        total = (1500 + cost);

        System.out.println("\nService Fee: \t\t\t$1500.00");
        System.out.println("\nTax Rate: 7%");
        double tax = total * 0.07;
        System.out.println("\nTax Amount: \t\t\t$" + tax);
        total += tax;
        System.out.println("\n\t\t\t---------------------------\nTotal Payment: \t\t\t$" + total);


        keyboard.close();
    }
}
