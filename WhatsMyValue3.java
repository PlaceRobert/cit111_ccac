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
public class WhatsMyValue3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turtle = 4;
        int marmot = 2;
        boolean sloth = false;
        while(marmot <= turtle){
            sloth = !sloth;
            marmot = marmot + 1;
        }
        if(sloth){
            marmot = marmot * marmot;
        }
        System.out.println("Turtle: " + turtle);
        System.out.println("Marmot: " + marmot);
        System.out.println("Sloth: "  + sloth);
    }
    
}
