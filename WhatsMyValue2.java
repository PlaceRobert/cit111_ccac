/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsmyvalue2;

/**
 *
 * @author robert.pl
 */
public class WhatsMyValue2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean tomato = true;
        boolean ginger = false;
        int oregano = 50;
        int fenugreek = 2;
        if(tomato){
            oregano = oregano/fenugreek;
        }else{
            oregano = fenugreek;
        }
        if(ginger && tomato){
            oregano = oregano * fenugreek;
        }
        ginger = !ginger;
        System.out.println("Tomato: " + tomato);
        System.out.println("Ginger: " + ginger);
        System.out.println("Oregano: " + oregano);
        System.out.println("Fenugreek: " + fenugreek);
    }
    
}
