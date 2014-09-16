//hw 03 PART 1
// Alana Corey
// Bicycle


  import java.util.Scanner;
  // tells Java we are going to have the user import information
  
public class Bicycle{

  public static void main(String[ ] args) {
      //opening to any java code
      
       Scanner myScanner;
        myScanner = new Scanner( System.in );
       // declaring the input like an interger  myScanner = new Scanner( System.in );
        System.out.print("Enter number of seconds:") ;
             double nSeconds = myScanner.nextDouble();
        
             //input number
        System.out.print("Enter number of counts:");
            double nCounts = myScanner.nextDouble();
            // input count number
            
            //double statements
            double wheelDiameter=27.0; //diamter of wheel
            double PI=3.14159; //Pi
            int feetPerMile=5280; // feet in a mile
            int inchesPerFoot=12; // inches in a foot
            int secondsPerMinute=60; // seconds in a minute
            double nMiles = (nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile); 
            //miles are number of counts, times the wheel diameter and pi, divided by 12(feet) and 5280(seconds)
         
            double nMinutes = nSeconds/secondsPerMinute;
            double nAvg = (nMiles)/(nMinutes/60);
          
          // to stop the decimals from continuing onwards for nAvg.   
            nAvg = nAvg*100;
            nAvg = (int) nAvg; // casting a double to an int
            nAvg = (double) nAvg; // reverse of above step 
            nAvg/=100;
           
           // to stop decimals from nMiles
            nMiles = nMiles*100;
            nMiles = (int) nMiles;
            nMiles = (double) nMiles;
            nMiles/=100;
           
            // Printing output answers
        System.out.println("The average distance was " +nMiles+ " and took " + nMinutes + " minutes.");
        System.out.println("The average mile per hour was " +nAvg);
  }
}