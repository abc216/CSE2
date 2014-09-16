//hw 03 PART 3
// Alana Corey
// FourDigits


// this program is going to give you the last four decimal points of an entered number.
// by multiplying the entered number by 100, we can derive the decimal points after by casting
// the doubles to intergers. 

  import java.util.Scanner;
  // tells Java we are going to have the user import information

public class FourDigits{

  public static void main(String[ ] args) {
      //needed for ever java code
      
      
      Scanner myScanner; // displays that we will be using a scanner
      myScanner = new Scanner( System.in ); // initials scanner use
      // tells that we are going to have the user to input information
      System.out.print("Enter a double with 4 decimal places and the computer will show four digits right of the decimal:");
      double nNumber= myScanner.nextDouble(); //gets input from scanner
      
      double nDigit = nNumber * 10; // multiplying the enter number by 10
      int x = (int) nDigit; // casting an double to an int
      int y = (int) nNumber;  //casting an double to an int 
      y = y*10; // multiplying y by 10
      int nFirstDigit = x-y; //  subtracting x from y 
      
      double nDigit2 = nNumber * 100; 
      int a = (int) nDigit2;
      int b = (int) nNumber; 
      b = b*100; 
      x = x*10;
      int nSecondDigit = a-x; 
      
      double nDigit3 = nNumber * 1000; 
      int c = (int) nDigit3;
      int d = (int) nNumber;
      d = d*1000; 
      a = a*10;
      int nThirdDigit = c-a; 
      
      double nDigit4 = nNumber * 10000; 
      int e = (int) nDigit4;
      c = c*10;
      int nFourthDigit = e-c; 
      
      
      System.out.print("The four digits are "+ nFirstDigit+" "+nSecondDigit+" "+nThirdDigit+" "+nFourthDigit );
      // printing out the results of each digit after the decimal 
    
  }
}