/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author robert.pl
 */
public class SimpleMethod {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Options: ");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - End this now!");
        System.out.println("Enter an int and press enter: ");
        final int SELECTOR = scan.nextInt();
        switch(SELECTOR){
            case 1:
                printStatement();
                break;
            case 2:
                generateBigNumber();
                break;
            case 3: 
                break;
            default:
                System.out.println("Don't waste my time!");
                break;
        }
    }
    
    public static void printStatement(){
        System.out.println("**********INSIDE printStatement**********");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("*****************************************");
        generateBigNumber();
    }
    
    public static void generateBigNumber(){
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100,r);
        System.out.println("***********INSIDE generateBigNumber**********");
        System.out.println(bigInt);
        System.out.println("*********************************************");
    }
}
