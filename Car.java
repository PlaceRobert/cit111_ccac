/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmodel;

/**
 *
 * @author robert.pl
 */
public class Car {
    /**
     * @param args the command line arguments
     */
    int year, gear;
    String makeModel;
    private boolean isEngineRunning, roofDown;
    private double speed;
    
    public void startEngine()
    {
        isEngineRunning = true;
        System.out.println("...crank...crank...vroom!");
    }
    
    public void stopEngine()
    {
        isEngineRunning = false;
        System.out.println("...grblllll...shldunk");
    }
    
    public boolean checkEngineStatus()
    {
        return isEngineRunning;
    }
    
    public double getCurrentSpeed()
    {
        return Math.abs(speed);
    }
    
    public double accelerate(int mphIncrease)
    {
        speed = speed + mphIncrease;
        return speed;
    }
    
    public double decelerate(int mphDecrease)
    {
        speed = speed - mphDecrease;
        if(speed < 0)
        {
            speed = 0;
            System.out.println("The car has stopped.");
        }
        return speed;
    }
    
    public void lowerRoof()
    {
        roofDown = true;
        System.out.println("Lowered the roof.");
        System.out.println("Feel the sun on your face and the wind in your "
                + "hair");
    }
    
    public void raiseRoof()
    {
        roofDown = false;
        System.out.println("Put the roof back up.");
        System.out.println("Nevermind. It's really cold.");
    }
    
    public int currentGear()
    {
        if( speed < 15 && speed > 0 )
        {
            gear = 1;
        }
        else if( speed > 15 && speed < 35 )
        {
            gear = 2;
        }
        else if( speed > 35 && speed < 70 )
        {
            gear = 3;
        }
        else if( speed > 70 )
        {
            gear = 4;
        }
        return gear;
    }
}
