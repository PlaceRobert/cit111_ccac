/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiletest;
import java.util.Scanner;
/**
 *
 * @author robert.pl
 */
public class WhileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxLoops, numLoops = 0, loopRate;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many loops would you like to run? ");
        maxLoops = scan.nextInt();
        System.out.println("Enter rate of increase: ");
        loopRate = scan.nextInt();
        
        while(numLoops <= maxLoops)
        {
            System.out.println("Loop " + numLoops);
            numLoops = numLoops + loopRate;
        }
    }
    
}
