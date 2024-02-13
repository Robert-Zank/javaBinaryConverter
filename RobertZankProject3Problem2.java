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

public class RobertZankProject3Problem2 {
    
    /**
     * This class is responsible for the computation needed
     * 
     * @param input The number being converted
     * @param nums  Stack holding the binary numbers
     */
    public static void convertToBinary(int input, Stack<Integer> nums) {
        int count = 0;
        while (input != 0) {
            count++;
            int hold = input;
            input = input / 2;
            nums.push(hold % 2);
        }

        for (int i = 0; i < count; i++) {
            System.out.print(nums.pop());
        }
        
        System.out.println("");
    }
}
