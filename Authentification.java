/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentification;
import java.util.Scanner;
/**
 *
 * @author robert.pl
 */
public class Authentification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input, password = "Joshua";
        int currentAttempt = 0, attempts = 5, attemptsRemaining = 5;
        boolean accessGranted = false;
        Scanner scan = new Scanner(System.in);
        
        while(currentAttempt < attempts && accessGranted == false)
        {
            System.out.println("What's the password? ");
            input = scan.next();
            
            if(input.equals(password))
            {
                System.out.println("Lucky guess");
                accessGranted = true;
            }
            else
            {
                System.out.println("Incorrect password.");
                attemptsRemaining = attemptsRemaining - 1;
                System.out.println("Attempts remaining: " + attemptsRemaining);
                currentAttempt++;
            }
        }
        
        if(accessGranted == false)
        {
            System.out.println("Access Denied");
            System.out.println("System locked");
            System.out.println("Better luck next time");
        }
    }
    
}
