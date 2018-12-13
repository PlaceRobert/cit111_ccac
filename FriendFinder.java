
package friendfinder;
import java.util.*;
/**
 *
 * @author robert.pl
 */
public class FriendFinder {
    static int score = 0; //Declaring variable "score"
    /**
     * @param args the command line arguments
     */
    public static int scoreFinder(int input)  //Creating class "scoreFinder"
    {
     //This class will increase the player's score depending on their answers
        if(input == 1)  //Beginning "if" statement
        {
            score = score + 10;  //Increasing value of variable "score"
        }
        else  //Beginning "else" statement
        {
            score = score + 5;  
        }
        return score; //Returning variable score.
    }
    
    public static int otherScoreFinder(int input) 
//Creating class "otherScoreFinder"
    {
        if(input == 0)
        {
            score = score + 10;
        }
        else
        {
            score = score + 5;
        }
        return score;
    }
    public static void main(String[] args) //Creating main class
    {
        /**
        * This class will run the "FriendFinder" program, and determine whether
        *the user and I could be friends
        */
        int input;  //Declaring variable "input"
        
        Scanner scan = new Scanner(System.in);  //Creating scanner
        
        System.out.println("Do you like video games?(0=no/1=yes)"); 
        //Prompting user
        input = scan.nextInt(); //Reading user input
        scoreFinder(input); //Sending user input to class "scoreFinder"
        
        System.out.println("Do you like movies?(0=no/1=yes)");
        input = scan.nextInt();
        scoreFinder(input);
        
   System.out.println("Do you like talking about the aforementioned things?");
        input = scan.nextInt();
        scoreFinder(input);
        
        System.out.println("Do you like dogs more than cats?");
        input = scan.nextInt();
        otherScoreFinder(input); //Sending input to class "otherScoreFinder"
        
        System.out.println("Are you afraid of trying new things?");
        input = scan.nextInt();
        otherScoreFinder(input);
        
        System.out.println("Are you afraid of expressing how you feel?");
        input = scan.nextInt();
        otherScoreFinder(input);
        
        System.out.println("You got: " +score+ " points."); 
        //Printing final score
        
        if(score >= 35 && score <= 40)
        {
            System.out.println("This probably won't work out.");
        }
        else if(score > 40 && score <= 60)
        {
            System.out.println("We can definitly be friends!");
        }
        
    }
    
}
