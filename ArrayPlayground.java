/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayplayground;

/**
 *
 * @author robert.pl
 */
public class ArrayPlayground {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] pets = new String[5];
        
        pets[0] = "Cats";
        pets[1] = "Dogs";
        pets[2] = "Birds";
        pets[3] = "Fishes";
        pets[4] = "Lizards";
        
        System.out.println("Pet at array index 0: " + pets[0]);
        System.out.println("Pet at array index 1: " + pets[1]);
        System.out.println("Pet at array index 2: " + pets[2]);
        System.out.println("Pet at array index 3: " + pets[3]);
        System.out.println("Pet at array index 4: " + pets[4]);
    }
    
}
