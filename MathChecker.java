/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathchecker;
import java.util.Scanner;
/**
 *
 * @author robert.pl
 */
public class MathChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input, attempts = 3;
        boolean solved = false;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("**Math Checker**");
        
        while(attempts > 0 && solved == false)
        {
            System.out.println("Solve the following: (28 / 4) - 3");
            input = scan.nextInt();
        
            if(input < 1)
            {
                System.out.println("Incorrect. Your answer is too low.");
                attempts = attempts - 1;
                System.out.println("You have " + attempts + " attempts left.");
            }
            if(input > 1)
            {
                System.out.println("Incorrect. Your answer is too high.");
                attempts = attempts - 1;
                System.out.println("You have " + attempts + " attempts left.");
            }
            else
            {
                System.out.println("Correct.");
                solved = true;
            }
        }
    }
    
}
