package javaBinaryConverter;
import java.util.Scanner;
import java.util.Stack;

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

public class RobertZankProject3Problem1 {
    
    /**
     * This method will decide if an equation is valid
     * 
     * @param input The equations
     * @return boolean value representing the status of validity of the
     *         equation provided by the user
     */
    public static boolean checkValidity(String input) {
        // initialize needed stack
        Stack<Character> vars = new Stack<>();
        
        //Loop through input
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);

            if (temp == '(') {
                vars.push(temp);
            } else if (temp == ')') {
                if (vars.isEmpty() || vars.pop() != '(') {
                    return false; 
                }
            }
        }

        return vars.isEmpty();
    }
}
