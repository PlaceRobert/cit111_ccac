/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.util.Scanner;
/**
 *
 * @author Robert
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input;
        char[] answer;
        Canine canine = new Canine();
        Dwarf dwarf = new Dwarf();
        Elf elf = new Elf();
        Feline feline = new Feline();
        Human human = new Human();
        Reptile reptile = new Reptile();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Races:");
        System.out.println("1: Human");
        System.out.println("2: Elf");
        System.out.println("3: Dwarf");
        System.out.println("4: Feline");
        System.out.println("5: Canine");
        System.out.println("6: Reptile");
        System.out.println("Select your race: ");
        input = scan.nextInt();
        
        if(input == 1)
        {
            System.out.println("Class List:" );
            System.out.println("1: Knight");
            System.out.println("2: Theif");
            System.out.println("3: Mage");
            System.out.println("Select your class: ");
            input = scan.nextInt();
            switch(input)
            {
                case 1:
                    human.knightMe(human);
                    human.description();
                
                case 2:
                    human.theifMe(human);
                    human.description();
                
                case 3:
                    human.mageMe(human);
                    human.description();
                
                default:
                    System.out.println("Invalid input");
            }
                
        }
        if(input == 2)
        {
            System.out.println("Class List:" );
            System.out.println("1: Knight");
            System.out.println("2: Theif");
            System.out.println("3: Mage");
            System.out.println("Select your class: ");
            input = scan.nextInt();
            switch(input)
            {
                case 1:
                    elf.knightMe(elf);
                    elf.description();
                
                case 2:
                    elf.theifMe(elf);
                    elf.description();
                
                case 3:
                    elf.mageMe(elf);
                    elf.description();
                
                default:
                    System.out.println("Invalid input");
            }
                
        }
        if(input == 3)
        {
            System.out.println("Class List:" );
            System.out.println("1: Knight");
            System.out.println("2: Theif");
            System.out.println("3: Mage");
            System.out.println("Select your class: ");
            input = scan.nextInt();
            switch(input)
            {
                case 1:
                    dwarf.knightMe(dwarf);
                    dwarf.description();
                
                case 2:
                    dwarf.theifMe(dwarf);
                    dwarf.description();
                
                case 3:
                    dwarf.mageMe(dwarf);
                    dwarf.description();
                
                default:
                    System.out.println("Invalid input");
            }
        }
        if(input == 4)
        {
            System.out.println("Class List:" );
            System.out.println("1: Knight");
            System.out.println("2: Theif");
            System.out.println("3: Mage");
            System.out.println("Select your class: ");
            input = scan.nextInt();
            switch(input)
            {
                case 1:
                    feline.knightMe(feline);
                    feline.description();
                
                case 2:
                    feline.theifMe(feline);
                    feline.description();
                
                case 3:
                    feline.mageMe(feline);
                    feline.description();
                
                default:
                    System.out.println("Invalid input");
            }
        }
        if(input == 5)
        {
            System.out.println("Class List:" );
            System.out.println("1: Knight");
            System.out.println("2: Theif");
            System.out.println("3: Mage");
            System.out.println("Select your class: ");
            input = scan.nextInt();
            switch(input)
            {
                case 1:
                    canine.knightMe(canine);
                    canine.description();
            
                case 2:
                    canine.theifMe(canine);
                    canine.description();
            
                case 3:
                    canine.mageMe(canine);
                    canine.description();
                
                default: 
                    System.out.println("Invalid input");
            }
        }
        if(input == 6)
        {
            System.out.println("Class List:" );
            System.out.println("1: Knight");
            System.out.println("2: Theif");
            System.out.println("3: Mage");
            System.out.println("Select your class: ");
            input = scan.nextInt();
            switch(input)
            {
                case 1:
                    reptile.knightMe(reptile);
                    reptile.description();
                
                case 2:
                    reptile.theifMe(reptile);
                    reptile.description();
                
                case 3:
                    reptile.mageMe(reptile);
                    reptile.description();
                
                default:
                    System.out.println("Invalid input");
            }
        }
    }
    
}
