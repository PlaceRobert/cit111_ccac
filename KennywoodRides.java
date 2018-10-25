/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kennywoodrides;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author robert.pl
 */
public class KennywoodRides {
    /**
     * @param args the command line arguments
     */
    private static int totalRiders=0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    private static final int THRILLHEIGHT = 60, THEMEHEIGHT = 36;
    
    public static void rideBlackWidow( int riders, int avgHeight )
    {
        Random rand = new Random();
        int numSickRiders = rand.nextInt(riders);
        if( avgHeight >= THRILLHEIGHT )
        {
            System.out.println("Riding Black Widow");
            totalRiders = totalRiders + riders;
            totalSickRiders = totalSickRiders + numSickRiders;
        }
        else
        {
            System.out.println( riders + " riders were turned away: too short.");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }
    }
    
    public static void rideMerryGoRound(int riders, int avgHeight)
    {
        Random rand = new Random();
        int numSickRiders = rand.nextInt(riders);
        if( avgHeight >= THEMEHEIGHT )
        {
            System.out.println("Riding MerryGoRound");
            totalRiders = totalRiders + riders;
            totalSickRiders = totalSickRiders + numSickRiders;
        }
        else
        {
            System.out.println( riders + " riders were turned away: too short.");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }
    }
    
    public static void printRideStats()
    {
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Riders Turned Away: " + totalFailedRideAttempts);
        System.out.println("Total Sick Riders: " + totalSickRiders);
    }
    
    public static void main(String[] args) 
    {
        int numRiders, numHeight, ride;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of riders: ");
        numRiders = scan.nextInt();
        System.out.println("Enter average height(inches): ");
        numHeight = scan.nextInt();
        System.out.println("Black Widow(1) or Merry Go Round(2)? " );
        ride = scan.nextInt();
        
        switch(ride)
        {
            case 1:   
                rideBlackWidow(numRiders, numHeight);
                printRideStats();
                break;
            case 2:  
                rideMerryGoRound(numRiders, numHeight);
                printRideStats();
                break;
            default:
                System.out.println("I don't understand.");
        }
    }
    
}
