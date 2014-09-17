//hw 03 PART 2
// Alana Corey
// Root
// 9/13/14

// The program takes a number from the user, divides it by three, and then continuously
// multiples it by itself to make it more accurate as to what the cubed root of a number
// is. 

  import java.util.Scanner;
  // tells Java we are going to have the user import information

public class Root{

  public static void main(String[ ] args) {
    // opening up for java 
    
    Scanner myScanner; // show that we are using the scanner 
    myScanner = new Scanner( System.in ); //instance of a scanner 
      System.out.print("Enter a number, and out will appear the cubed root:");
      double nInput = myScanner.nextDouble(); //making the input apart of a scanner input 
      double nCubed = nInput/3; //showing the input is to be divided by 3
      
    // define what guess is, the input, and the forumla   
    
    //the previous answer becomes the double for the next.
 
     double nGuess2 = (2*nCubed*nCubed*nCubed+nInput)/(3*nCubed*nCubed);
     double nGuess3 = (2*nGuess2*nGuess2*nGuess2+nInput)/(3*nGuess2*nGuess2);
     double nGuess4 = (2*nGuess3*nGuess3*nGuess3+nInput)/(3*nGuess3*nGuess3);
     double nGuess5 = (2*nGuess4*nGuess4*nGuess4+nInput)/(3*nGuess4*nGuess4);
     double nGuess6 = (2*nGuess5*nGuess5*nGuess5+nInput)/(3*nGuess5*nGuess5);
     double nGuess7= (nGuess6*nGuess6*nGuess6); //answer to the nGuess6 for easier printing 

    
      System.out.println("The cube root is " + nGuess6+ ": " + nGuess6 + "*" + nGuess6 + "*" + nGuess6 + "=" + nGuess7);

      
  }
}