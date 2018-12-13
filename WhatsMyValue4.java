/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackage;

/**
 *
 * @author robert.pl
 */
public class WhatsMyValue4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int australia = 10;
        int chile = 5;
        boolean ecuador = false;
        chile = australia + chile;
        System.out.println("Australia before call: " + australia);
        System.out.println("Ecuador before if: " + ecuador);
        if(!ecuador){
            doSimpleMath(australia);
        }
        System.out.println("Chile: " + chile);
        System.out.println("Ecuador after if: " + ecuador);
    }
    
    public static void doSimpleMath(int numToFlip){
        int result = (numToFlip * -1) + 15;
        System.out.println("Result: " + result);
    }
    
}
