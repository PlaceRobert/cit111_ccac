
package delorean;


public class Delorean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean timeCircuits = true;
        double speed = 0;
        int gear = 1;
        double plutoniumLevelPercent = 100.0;
        
        if(timeCircuits)
        {
            System.out.println("Ready...");
            speed = ( 1000 / (20 * 5)) + 78;
            
            if(speed >= 88 && gear == 1)
            {
                gear = 4;
            }
            else if(speed < 88 || gear != 4)
            {
                gear = 3;
                timeCircuits = false;
            }
            else
            {
                gear = 2;
            }
            
            plutoniumLevelPercent = plutoniumLevelPercent - speed;
            
            timeCircuits = !timeCircuits;
        }
        else
        {
            System.out.println("Turn on circuits!");
        }
        System.out.println("time Circuits: " + timeCircuits);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
        System.out.println("Plutonium Level: " + plutoniumLevelPercent);
    }
    
}
