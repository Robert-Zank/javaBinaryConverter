package javaBinaryConverter;
import java.util.Scanner;

/**
 * Class: RobertZankProject3Problem1
 * 
 * @author Robert Zank
 * @version 1.0 Course : CSE 274 Fall 2023 Written: October 18, 2023
 *
 *          Class description - This class is designed to check the
 *          validity of mathematical equations
 *
 *          Purpose: – This class can be used by anyone to check if
 *          an equation is valid
 **/

public class RobertZankPart1Main {

    /**
     * This method will prompt the user to enter the equation, keep prompting
     * them until they enter the key to stop, and output whether the equation
     * is balanced or not.
     * 
     * @param args an array associated with the main method
     */
    public static void main(String args[]) {
        // scanner to get inputs from the user
        Scanner key = new Scanner(System.in);

        String input = "a";

        // loop to keep prompting the user for equations
        while (!input.equals("-1") && !input.equals("")) {
            System.out.print("Please enter an equation (or -1 to exit): ");
            input = key.nextLine();
            boolean check = false;
            // pass the input to a method that checks validity
            check = RobertZankProject3Problem1.checkValidity(input);
            // outputs whether the equation is balanced or not based off check
            if (check && !input.equals("") && !input.equals("-1")) {
                System.out.println("Equation is balanced.");
            } else if (!input.equals("") && !input.equals("-1")) {
                System.out.println("Equation is not balanced.");
            } else {
                System.out.println("Good bye.");
            }
        }
        // closes the scanner that reads user inputs
        key.close();
    }
    
}
