/*  
    Name:   Garrett Dodd
    Student ID: LL00711756 
    Email: gdodd1@una.edu
    Course Information: <CIS 315-03>
    Program Source File Name:  <CustomerLabTesting.java>
    Programming Assignment:  Project 3
    Program Description: <Lab Testing Application>
    References: 
    Due Date:     3 May 2022
 
   In keeping with the honor code policies of the University of University of North Alabama, the 
School of Business, and the Department of Computer Science and Information Systems, I 
affirm that I have neither given nor received on this programming assignment. This 
assignment
represents my individual, original effort.
 ... My Signature is on File.
         
*/ 
import java.util.Scanner;

public class CustomerLabTesting {

    

	public static void main(String[] args) throws InterruptedException {
        
		//create scanner object to accept keyboard inputs
		Scanner keyboard = new Scanner (System.in);

		//inputs the number of patients
		System.out.println("Welcome to the Lab! Please input the number of patients that will be seen today:");
		int numPatients = keyboard.nextInt();

		//calls the customer constructor and its methods once per person per input above
		for (int i = 0; i < numPatients; i++) {
			System.out.println("Welcome to the lab!");
			Customer customer = new Customer(i);
			customer.addLabTest();
			customer.payBalance();
			System.out.println(customer.toString());
			System.out.println("Thank you for coming! Have a great day!");
			System.out.println();
			System.out.println();
		}
		keyboard.close();
	}

}

class Customer {

	//declaring variables
	private String firstName = "", lastName = "", customerID="", setID="", labs="";
	private char labDept;
	private int setNum;
	private final int labCost = 120;
	private int balance = 0;

	//create scanner object to accept keyboard inputs
	Scanner keyboard = new Scanner (System.in);

	Customer(int iteration){
		System.out.println("Please input your first name: ");
		firstName = keyboard.nextLine();

		System.out.println("Please input your last name: ");
		lastName = keyboard.nextLine();

		System.out.println("The following are the departments and their corresponding ID's:");
		System.out.println("ID: 1 - Microbiology");
		System.out.println("ID: 2 - Virology");
		System.out.println("ID: 3 - Hematology");
		System.out.println("ID: 4 - Parasitology");
		System.out.println("Please input the ID for the department you need:  ");
		labDept = keyboard.next().charAt(0);

		setCustomerID(iteration);
	}

	public String setCustomerID(int iteration){		//needed some way to tell how many patients have already came, variables kept resetting
		setNum = iteration + 1;
		if (setNum < 10) {
			setID = "0000" + String.valueOf(setNum);
		}else {
			setID = "000" + String.valueOf(setNum);
		}
		customerID = String.valueOf(labDept) + setID;
		setNum++;
		return customerID;
	}
	//
	public void addLabTest() {
		String[] microTests = {"Pregnancy Test", "Wound Swab", "Nasal Swab", "Semen Analysis", "Routine Urine Examination"};
		String[] viroTests = {"Rotavirus", "Hepatitis", "Influenza", "Human Immunodeficiency Virus (HIV)", "COVID-19"};
		String[] hemaTests = {"White Blood Cell Count", "Red Blood Cell Count", "Platelet Count", "Hemoglobin Concentration", "Red Blood Cell Indices"};
		String[] parasiteTests = {"Fecal Exam", "Blood Test", "X-ray", "MRI", "CAT scan"};
		//variable to make while loop
		int microChoice = 0, viroChoice = 0, hemaChoice = 0, paraChoice = 0;
		char option = 'Y', choice = 'Y';
		while (option != 'Q') {
			switch(labDept) {
                case '1':	while (Character.toUpperCase(choice) == 'Y') {
                            System.out.println("The Microbiology department offers the following tests: ");
                            System.out.println("ID: 1 - Pregnancy Test");
                            System.out.println("ID: 2 - Wound Swab");
                            System.out.println("ID: 3 - Nasal Swab");
                            System.out.println("ID: 4 - Semen Analysis");
                            System.out.println("ID: 5 - Routine Urine Examination");
                            System.out.println("Please enter the ID for the test you need: ");
                            microChoice = keyboard.nextInt();
                            if(microChoice != 1 && microChoice != 2 && microChoice != 3 && microChoice != 4 && microChoice != 5) {
                                System.out.println("ERROR: Invalid Input - Starting Over");
                                continue;
                            }
                            labs += microTests[microChoice - 1] + ", ";
                            balance += labCost;
                            System.out.println("Do you need another Microbiology test? (Y/N) ");
                            choice = keyboard.next().charAt(0);
                            option = 'Q';
                            }
                case '2':	while (Character.toUpperCase(choice) == 'Y') {
                            System.out.println("The Virology department offers the following tests: ");
                            System.out.println("ID: 1 - Rotavirus");
                            System.out.println("ID: 2 - Hepatitis");
                            System.out.println("ID: 3 - Influenza");
                            System.out.println("ID: 4 - Human Immunodeficiency Virus (HIV)");
                            System.out.println("ID: 5 - COVID-19");
                            System.out.println("Please enter the ID for the test you need: ");
                            viroChoice = keyboard.nextInt();
                            if(viroChoice != 1 && viroChoice != 2 && viroChoice != 3 && viroChoice != 4 && viroChoice != 5) {
                                System.out.println("ERROR: Invalid Input - Starting Over");
                                continue;
                            }
                            labs += viroTests[viroChoice - 1] + ", ";
                            balance += labCost;
                            System.out.println("Do you need another Virology test? (Y/N) ");
                            choice = keyboard.next().charAt(0);
                            option = 'Q';
                            }
                case '3':	while (Character.toUpperCase(choice) == 'Y') {
                            System.out.println("The Hematology department offers the following tests: ");
                            System.out.println("ID: 1 - White Blood Cell Count");
                            System.out.println("ID: 2 - Red Blood Cell Count");
                            System.out.println("ID: 3 - Platelet Count");
                            System.out.println("ID: 4 - Hemoglobin Concentration");
                            System.out.println("ID: 5 - Red Blood Cell Indices");
                            System.out.println("Please enter the ID for the test you need: ");
                            hemaChoice = keyboard.nextInt();
                            if(hemaChoice != 1 && hemaChoice != 2 && hemaChoice != 3 && hemaChoice != 4 && hemaChoice != 5) {
                                System.out.println("ERROR: Invalid Input - Starting Over");
                                continue;
                            }
                            labs += hemaTests[hemaChoice - 1] + ", ";
                            balance += labCost;
                            System.out.println("Do you need another Hematology test? (Y/N) ");
                            choice = keyboard.next().charAt(0);
                            option = 'Q';
                            }
                case '4':	while (Character.toUpperCase(choice) == 'Y') {
                            System.out.println("The Parasitology department offers the following tests: ");
                            System.out.println("ID: 1 - Fecal Exam");
                            System.out.println("ID: 2 - Blood Test");
                            System.out.println("ID: 3 - X-ray");
                            System.out.println("ID: 4 - MRI");
                            System.out.println("ID: 5 - CAT scan");
                            System.out.println("Please enter the ID for the test you need: ");
                            paraChoice = keyboard.nextInt();
                            if(paraChoice != 1 && paraChoice != 2 && paraChoice != 3 && paraChoice != 4 && paraChoice != 5) {
                                System.out.println("ERROR: Invalid Input - Starting Over");
                                continue;
                            }
                            labs += parasiteTests[paraChoice - 1] + ", ";
                            balance += labCost;
                            System.out.println("Do you need another Parasitology test? (Y/N) ");
                            choice = keyboard.next().charAt(0);
                            option = 'Q';
                            }
			}
		}//printing balance
		viewBalance();
	}

	//prints the customers balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + balance);
	}

	//outputs the customer's balance and asks them how much they'd like to pay
	//checks to see if the input is greater than the actual balance and if it is
	//the program will repeat asking how much they'd like to pay until its less than the total
	public void payBalance() {

		viewBalance();
		System.out.println("How much would you like to pay today? ");
		int input = keyboard.nextInt();
		if(input <= balance) {
		balance -= input;
		}
		else if(input > balance) {
			System.out.println("ERROR: Payment can't be larger than your balance");
			viewBalance();
			System.out.println("How much would you like to pay today? ");
			input = keyboard.nextInt();
			balance -= input;
		}
	}

	public String toString() {
		return "\n\rINVOICE" + "\n\rName: " + lastName + ", " + firstName + "\n\rCustomer ID: " + customerID +
				"\n\rDepartment Number: " + labDept + "\n\rTests: " + labs + "\n\rBalance: $" + balance;
	}

}
