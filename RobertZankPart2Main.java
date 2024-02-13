package javaBinaryConverter;
import java.util.Scanner;
import java.util.Stack;

/**
 * Class: RobertZankProject3Problem2
 * 
 * @author Robert Zank
 * @version 1.0 Course : CSE 274 Fall 2023 Written: October 20, 2023
 *
 *          Class description - This class takes an integer and converts that
 *          into its binary base 2
 *
 *          Purpose: – This class can be used to convert integer into base 2
 *          binary
 **/

public class RobertZankPart2Main {

    /**
     * This is the main class responsible for driving the process
     * @param args an array associated with the process
     */
    public static void main(String[] args) {
        // scanner to get inputs from the user
        Scanner key = new Scanner(System.in);

        // List for the number
        Stack<Integer> nums = new Stack<>();

        int input = 0;

        // loop to keep prompting the user for numbers
        while (input >= 0) {
            System.out.print(
                    "Please enter a positive number (or -1 to exit): ");
            input = key.nextInt();
            if (input >= 0) {
                RobertZankProject3Problem2.convertToBinary(input, nums);
            } else {
                System.out.println("Good bye.");
            }
        }
        // closes the scanner that reads user inputs
        key.close();
    }
    
}
