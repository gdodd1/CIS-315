/*
    Name: Garrett Dodd
    Course: CIS 315 - Advanced Object Oriented Programming
    Date: 15 Feb. 2022
*/
import java.util.Scanner;

class DaysWeek1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select a day of the week. Enter the first letter: ");
        char input = keyboard.next().charAt(0);

        switch(input){
            case 'M':   System.out.println("The day that begins with m or M is Monday.");
                        break;
            case 'm':   System.out.println("The day that begins with m or M is Monday.");
                        break;
            case 'T':   System.out.println("The days that begin with the letter t or T are Tuesday and Thursday");
                        break;
            case 't':   System.out.println("The days that begin with the letter t or T are Tuesday and Thursday");
                        break;
            case 'W':   System.out.println("The day that begins with w or W is Wednesday");
                        break;
            case 'w':   System.out.println("The day that begins with w or W is Wednesday");
                        break;
            case 'F':   System.out.println("The day that begins with f or F is Friday.");
                        break;
            case 'f':   System.out.println("The day that begins with f or F is Friday.");
                        break;
            case 'S':   System.out.println("The days that begin with s or S are Saturday and Sunday");
                        break;
            case 's':   System.out.println("The days that begin with s or S are Saturday and Sunday");
                        break;
            default: System.out.println("ERROR: INVALID INPUT");
        }


        keyboard.close();
    }
}