/*
    Name: Garrett Dodd
    Date: 24 February 2022
    Professor: Dr. Herath
    Course: CIS-315-01
*/
import java.util.Scanner;
class ClimateAnalyzer{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the snowfall in inches: ");
        double input = keyboard.nextDouble();
        if(input < 3.5){
            System.out.println("The snowfall is acceptable.\n\rCheck it again in 30 minutes.");
        } else{
            System.out.println("The snowfall is too high. Possibility of reservoir freezing.\n\rWait for 30 minutes and re-enter the snowfall.");
        }

        keyboard.close();
    }
}