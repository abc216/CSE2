/* Alana Corey
10/31/13
Hw 09

The program runs on the ideas of flags. If the flag is down, the program runs. If the flag is up, it does not. 
 With the ideas of flags, if the program gets a proper input, the flag stays down and the input
 can sail through the methods. However, if the flag goes up, it is relooped back to the beginning
 over and over until the user puts in a proper input. */




import java.util.Scanner;// says we will use a scanner


public class BlockedAgain{ // main class
    public static void main(String []s){ // main method
        int m;
//force user to enter int in range 1-9, inclusive.
        m = getInt();  // tells us we will use the getInt method
            allBlocks(m); // tells us we will use the allBlocks method using variable m
}// end main method

        
        
        
    public static int getInt(){// start getInt method
     
        Scanner myScanner; // declares scanner 
        
        boolean invalidInput = true; //false as in there is no bad input, creates boolean flag
        //int goodInput = 0;
        
        while (invalidInput = true) {  // sets conditions for flag
        // the invalid input starts as true (we assume it is invalid input), 
        //until we prove it is valid, in which case the boolean becomes false to indicate it is no longer invalid  
        System.out.println("Enter an in int between 1 and 9"); // prints statement 
        myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
        
        String x = myScanner.next();// cast input to a string
        
        if (checkInt(x)) { // if it is a valid interger proceed onward 
            int y = Integer.parseInt(x); // since it is an int, we convert and store in an int variable y
            if (checkRange(y)) {// since it is an int, check the range
                int goodInput = y; // valid range between 0 and 9
                invalidInput = false; // if this is all true, then the flag goes down 
                return goodInput; // it returns as a good input 
            } else { // otherwise
                break; // we start over
            } // close else statement 
            
        } else { // otherwise as indicated by flag
                invalidInput = true; //true as in the input is bad
            } // close else statement
            
        } // close while statement 
        return 0; // should never get to this point, just a check
}// end getInput


public static boolean checkInt(String input){ //opens method checkInt
    
    
    try { // tries to see if the input is an intergetr
        Integer.parseInt(input); // if it parses as an interger
        return true;// return true
    } // closes try
    catch( Exception e ) {// catch filters non-intergers
        System.out.println("You did not enter a value of type int, try again"); // prints statement
        return false;// returns false 
    }// closes catch 
} // end checkInt method


public static boolean checkRange(int q){// opens the checkRange method
        if (q <= 9 &&  q>0){ //if input is between 1-9
        return true; // kicks us our of while loop
        } // closes if statement
        else{ 
        System.out.println("Your int was not in the correct range, try again"); // prints error and prompts new input
        return false;// returns false
        } // end else statement
       
}// end checkRange method



public static int allBlocks(int m){
    
    //todo code for all blocks
    
   int towerInt = m;// declaring a varible 
    if (towerInt != 0) { // if we get a proper input 
        
        block(towerInt); // run block method
          lines(towerInt); // run lines method
         
       
}

    return m;
}// end method allBlocks 


public static int block(int z){ //opens method block

    
    int j; // initializes j
   for (int i = 1; i <= z; i++) { // whatever i is becomes the number printed out
          
          for (int k = 0; k < i; k++){ // separates groups for the cubes of the numbers, and distinguises rows
          
            for (int m = 0; m < (z - i); m++) System.out.print(" "); // creates spacing by pushing the numbers forward
            
       for (j = 0; j < ((2*i)-1); j++) System.out.print(i); // prints the physical number out
       
        System.out.println(""); // enters to the next line of code
      
          }
        System.out.println();// puts everything onto a new line
   } 

    return z;// return the final answer
    
}// end method blocks 

public static int lines(int z){// opens methods lines 
   int m = z;// sets int m from the main method to z
   
      
   for (int i = 1; i <= z ;i++) { // whatever i is becomes the number printed out
 
 for (int n = 0; n < i; n++){  //separates groups for the cubes of the numbers
   if(n==(i-1)){ // test to see if it is the last row needed
   
   for (int q = 0; q < (m - i); q++) System.out.print(" "); // appropriate spacing for each dash 
            for (int s = 0; s < ((2*i)-1); s++) System.out.print("-"); // if last row not needed, print dash
  
       }
         }
       System.out.println();// puts everything onto a new line
       System.out.println(""); // enters to the next line of code
         }
         
        return z; // return the final answer
    
   }// end method lines  
    

}
// end class