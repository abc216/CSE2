/*
Alana Corey
10/10/14
hw 06 part 2


The program takes in a input greater than 0 and finds the most accurate square root of it. If a negative number
is entered, the program does not work and the answer is infinitiy. The highest number is the input plus one.
If the highest number minus the lowest number(starting at 0) is greater than .0000001, the program will run.
The mid is defined as the highest and lowest numbers added together divided by two. Then, if the mid number 
multipled by itself if greater than the inital input, the mid becomes the new high. If the mid times itself
is lower than the input, the initial input becomes the new low. The code then prints the initial input
and its square root.*/




import java.util.Scanner;
 // tells Java we are going to have the user import information

public class Root{
    public static void main(String [] args){
        //opening to any java code
        
        Scanner myScanner;
        myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
        System.out.println("Enter a double that is greater than 0:");
        double nInput= myScanner.nextDouble(); //number system receives from user
      
        double nHigh = nInput + 1; // Adds 1 to the input to get the higher interval
        double nMid=0; // Divides the higher interval by two to get the middle interval
        double nLow=0; // declares 0 as the low interval
        
        // New Middle number after the calcluations are complete to become the new input
        
       
        
        while(nHigh-nLow > 0.0000001 ){ // tolerance, so the number never goes lower than .0000001
            
            nMid = ((nLow + nHigh)/2); // The middle number is the highest boundary, plus the lowest, divided by 2 
           
            if (nMid * nMid >nInput){ // if the new middle number, times itself is greater than the input
                  nHigh= nMid; // the high becomes the new mid
            }else if(nMid *nMid <nInput){ // if the middle number times itself is lower than the input
                  nLow= nMid; // the low becomes the new mid
                   }
        }// closes the while statement 
        
        System.out.println("The square root of " + nInput + " is " + nMid);
        // prints the square root of the input
    
    }
}
