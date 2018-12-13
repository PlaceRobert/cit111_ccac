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
public class Canine {
    private int str, agi, vit, kno, chr, lck;
    
    public void strength()
    {
       str = 6;
    }
    
    public void agility()
    {
        agi = 5;
    }
    
    public void vitality()
    {
        vit = 6;
    }
    
    public void knowledge()
    {
        kno = 2;
    }
    
    public void charisma()
    {
        chr = 4;
    }
    
    public void luck()
    {
        lck = 6;
    }
    
    public void knightMe(Canine x)
    {
        x.str = x.str + 3;
        x.agi = x.agi - 1;
        x.vit = x.vit + 2;
        x.kno = x.kno + 1;
        x.chr = x.chr + 2;
        x.lck = x.lck + 1;
    }
    
    public void theifMe(Canine x)
    {
        x.str = x.str + 1;
        x.agi = x.agi + 3;
        x.vit = x.vit - 1;
        x.kno = x.kno + 1;
        x.chr = x.chr + 2;
        x.lck = x.lck + 2;
    }
    
    public void mageMe(Canine x)
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
        System.out.println("Strong, fast, and inordinately lucky. Canines are"
                + "rather simple-minded and not particularly charming, but their"
                + " strength, agility, and luck make them invaluable.");
        System.out.println("Strength: " + str);
        System.out.println("Agility: " + agi);
        System.out.println("Vitality: " + vit);
        System.out.println("Knowledge: " + kno);
        System.out.println("Charisma: " + chr);
        System.out.println("Luck: " + lck);
    }
}
