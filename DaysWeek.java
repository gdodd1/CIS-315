/*
    Name: Garrett Dodd
    Course: CIS 315 - Advanced Object Oriented Programming
    Date: 15 Feb. 2022
*/
import java.util.Scanner;

class DaysWeek{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select a day of the week. Enter the first letter: ");
        char input = keyboard.next().charAt(0);

        if(input == 'M' || input == 'm'){
            System.out.println("The day that begins with m or M is Monday.");
        }   else if(input == 'T' || input == 't'){
            System.out.println("The days that begin with the letter t or T are Tuesday and Thursday");
        }   else if(input == 'W' || input == 'w'){
            System.out.println("The day that begins with w or W is Wednesday");
        }   else if(input == 'F' || input == 'f'){
            System.out.println("The day that begins with f or F is Friday.");
        }   else if(input == 'S' || input == 's'){
            System.out.println("The days that begin with s or S are Saturday and Sunday");
        }   else{
            System.out.println("There is no day that begins with this letter.");
        }
        keyboard.close();
    }
}