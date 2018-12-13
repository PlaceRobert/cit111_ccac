/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Robert
 */
public class Dwarf {
    private int str, agi, vit, kno, chr, lck;
    
    public void strength()
    {
        str = 7;
    }
    
    public void agility()
    {
        agi = 2;
    }
    
    public void vitality()
    {
        vit = 6;
    }
    
    public void knowledge()
    {
        kno = 3;
    }
    
    public void charisma()
    {
        chr = 3;
    }
    
    public void luck()
    {
        lck = 4;
    }
    
    public void knightMe(Dwarf x)
    {
        x.str = x.str + 3;
        x.agi = x.agi - 1;
        x.vit = x.vit + 2;
        x.kno = x.kno + 1;
        x.chr = x.chr + 2;
        x.lck = x.lck + 1;
    }
    
    public void theifMe(Dwarf x)
    {
        x.str = x.str + 1;
        x.agi = x.agi + 3;
        x.vit = x.vit - 1;
        x.kno = x.kno + 1;
        x.chr = x.chr + 2;
        x.lck = x.lck + 2;
    }
    
    public void mageMe(Dwarf x)
    {
        x.str = x.str - 1;
        x.agi = x.agi + 1;
        x.vit = x.vit + 1;
        x.kno = x.kno + 3;
        x.chr = x.chr + 1;
        x.lck = x.lck + 2;
    }
    
    public void description()
    {
        System.out.println("Well-armed and powerful. Dwarves are among the "
                + "strongest of the races. Their strength and vitality can't be"
                + "understated, but they very much lack in speed, intelligence,"
                + " and charisma.");
        System.out.println("Strength: " + str);
        System.out.println("Agility: " + agi);
        System.out.println("Vitality: " + vit);
        System.out.println("Knowledge: " + kno);
        System.out.println("Charisma: " + chr);
        System.out.println("Luck: " + lck);
    }
}
