/*
Alana Corey
10/18/14
Hw 07

This program takes a for loop, a while loop, and do while loop, and prints the same answer on a given input.
For the for loop, each variable controls the rows, coloums, and spacing. The while loop is when
the current number printed is less than the number inputed, and then runs the program. The do while loop
is similiar to the while loop, however rows needs to be incrimented and the inital while statement has to be moved to 
the bottom of the code. Rows is equal to the counter, cNum.
*/



import java.util.Scanner;
 // tells Java we are going to have the user import information

public class NumberStack{
    public static void main(String [] args){
        //opening to any java code
        
        Scanner myScanner;
        myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
        System.out.println("Enter a number between 1 and 9:");
        int nInput= myScanner.nextInt(); //number system receives from user
        int j;
        
        System.out.println("Using for loops:");// prints statement
        
     

        
        
        for (int i = 1; i <= nInput; i++) { // whatever i is becomes the number printed out
           
           for (int k = 0; k < i; k++){ // separates groups for the cubes of the numbers, and distinguises rows
            for (int m = 0; m < (nInput - i); m++) System.out.print(" "); // creates spacing by pushing the numbers forward
            
        for (j = 0; j < ((2*i)-1); j++) System.out.print(i); // prints the physical number out
         System.out.println(""); // enters to the next line of code
        if(k==(i-1)){ // test to see if it is the last row needed
            for (int q = 0; q < (nInput - i); q++) System.out.print(" "); // prints spacing
        for (int n = 0; n < ((2*i)-1); n++) System.out.print("-"); // if last row not needed, print dash
        }
         } System.out.println();// puts everything onto a new line
        }
        
        
        System.out.println("Using while loops:");// prints statement
        // variable list
        
        int cNum = 1; // current number printed
        int rows; // rows in the print
        
        

        while(cNum <= nInput){ // while the current number printed is less than the number inputed
            rows = cNum; // setting rows to cNum
            while(rows > 0){ // while the rows are greater than 0,
                int x = 0; // counter variable for while loop
                while(x< nInput - cNum){System.out.print(" "); x++;} // prints spaces
                int y = 0; // counter varible for while loop
                while(y< ((2*cNum) -1) ){System.out.print("" + cNum); y++;} // prints numbers
            if(rows == 1){ // if you're on the last row of the specific number
                System.out.println(""); // prints new line
                int z= 0; // variable for spaces
                int a = 0; // variable for spaces
                while(a< nInput - cNum){System.out.print(" "); a++;} // print spaces
                while(z< ((2*cNum) -1) ){System.out.print("-" ); z++;}//print dashes

                
                
            }
            
            System.out.println(""); // prints new line
            rows--;  // decreases number of rows
                
            }
            cNum++; // increases printed number for next set
        }
        
        
        System.out.println("Using do while loops:");
        cNum = 1; // set the counter to one
        do{
            rows = cNum; // makes every number have correct number of rows, ex 2 has two rows
            while(rows > 0){ // when rows are greater than one(which is most)
                int x = 0; // variable for spaces
                int y = 0; // variable for spaces
                while(x< nInput - cNum){ // when the input minues the counter is greater than x
                    System.out.print(" "); x++;// prints spaces if x is less than the input minues the counter
                } 
                while(y< ((2*cNum) -1) ){ // two times the counter minues 1
                    System.out.print("" + cNum); y++;// prints dashes
                }
            if(rows == 1 ){ // when rows are equal to 1
                System.out.println(""); // prints to next line
                int z= 0; // variable for spaces
                int a = 0; // variable for spaces
                while(a< nInput - cNum){// prints space if x is less than the input minues the counter
                    System.out.print(" "); // space
                    a++; // incriment a
                    
                } // prints spaces
                while(z< ((2*cNum) - 1) ){ // two times the counter minues 1
                    System.out.print("-" );  // space
                    z++; // incirment z
                    
                } // prints dashes
              cNum++;  // increase number of printed for next set

                
            }
            
             System.out.println(""); // prints each lines above the dashes 
            rows--; // decreases rows
                 
            }
        } while(cNum <= nInput); // when the counter is less than or equal to the input
        
        
    } // end main void 
} // end class