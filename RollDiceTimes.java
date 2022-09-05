import java.util.Random;
import java.util.Scanner;

public class RollDiceTimes{
    public static void main(String[] args){

        Random rand = new Random();
        int dice1, dice2;
        char continueChoice = 'Y';
        Scanner keyboard = new Scanner(System.in);
        while(continueChoice == 'Y'){
            for(int i = 0; i < 6; i++){
                dice1 = rand.nextInt(6) + 1;
                dice2 = rand.nextInt(6) + 1;
                System.out.printf("Rolling the dice..%s", i+1);
                System.out.println("\n\rTheir values are:");
                System.out.printf(dice1 + " " + dice2);
                System.out.println();
            }
            System.out.print("Roll them again (y = yes)?");
            continueChoice = Character.toUpperCase(keyboard.next().charAt(0));
        }

        keyboard.close();

    }
}