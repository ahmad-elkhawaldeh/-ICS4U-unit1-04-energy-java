/*
* The GuessingGame code
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-11-23
*/

import java.util.*;

/**
* This is the calculating heating time program.
*/
public class Guess1 {
    /**
    * constants.
    */
    public static int count = 0;
    /**
    * constants.
    */
    public static int highNumber = 6;

    /**
    * The starting function.
    *
    * @param args No args will be used
    */
    public static boolean checkGuess(int userGuess, int number) {
    count+=1;

    if (userGuess > highNumber) {
        System.out.println("\nError input a number between 1-6");
        return false;

    } else if (userGuess == number) {
        System.out.println("\nYou are Correct!");
        System.out.println("It took you "+count+" tries.");
        return true;

    } else if (userGuess < number) {
      System.out.println("You guessed too low.");
      System.out.println("Guess again.\n");
      return false;

    } else if (userGuess > number) {
      System.out.println("You guessed too high.");
      System.out.println("Guess again.\n");
      return false;
    }
     return false;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rand = 1 + random.nextInt(6);
        boolean res;
 
        try {
            do{
                System.out.print("Guess a number between 1 to 6: ");
                int userGuess = sc.nextInt();
                res = checkGuess(userGuess, rand);
            } while(!res);
        } catch(InputMismatchException e) {
              System.out.println("Only integers values are allowed");
        }
    }
}
