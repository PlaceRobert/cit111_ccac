/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordercalculator;
import java.util.Scanner;
/**
 *
 * @author robert.pl
 */
public class OrderCalculator {

    /**
     * @param args the command line arguments
     */
    private static int burgersOrdered;
    private static int chickenOrdered;
    
    public static int orderBurgers(int order)
    {
        burgersOrdered = burgersOrdered + order;
        return burgersOrdered;
    }
    
    public static int orderChicken(int order)
    {
        chickenOrdered = chickenOrdered + order;
        return chickenOrdered;
    }
    
    public static void displayOrderTotals()
    {
        System.out.println(burgersOrdered + " burgers have been ordered.");
        System.out.println(chickenOrdered + " chicken sandwiches have been ordered.");
    }
    public static void main(String[] args) {
        for(int order = 0; order < 4; order++)
        {
            int burgers, chicken;
            Scanner scan = new Scanner(System.in);
            System.out.println("How many burgers? ");
            burgers = scan.nextInt();
            orderBurgers(burgers);
            System.out.println("How many chicken sandwiches? ");
            chicken = scan.nextInt();
            orderChicken(chicken);
            displayOrderTotals();
        }
    }
    
}
