/* Alana Corey
HW 10 
11/17/14

The purpose of the program is to find duplicates from an input. The program prompts the user to enter 10
intergers. It then puts the intergers into an array, and assesses if any are the same. The main method is 
primarily used to print out whether or not the numbers have a duplicate. The list array method
lists the numbers and assigns the inputs to the array. The hasDup method using a flag to test if 
there is a duplicate. The exactlyOneDup method tests to see if there is only one duplicate inside 
of having a duplicate.

*/




import java.util.Scanner;// initiates scanner 
public class FindDuplicates{// starts class
  public static void main(String [] arg){ // opens main method 
    Scanner scan=new Scanner(System.in); // scaners scanner 
    int num[]=new int[10]; // declares an array of 10 numbers 
    String answer=""; // sets string anger to a space 
    do{
      System.out.print("Enter 10 ints- "); // print this 
      for(int j=0;j<10;j++){ // for loop to show less than10 
        num[j]=scan.nextInt(); // look in array j
      }
      String out="The array "; // string out is called "the Array "
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ // if methods runs 
        out+="has ";  // print 'has'
      }// close if statement 
      else{ // else 
        out+="does not have ";// print "does not have"
      }// close else 
      out+="duplicates.";// print "duplicates"
      System.out.println(out); // print 'out'
      out="The array "; // print "The Array"
      out+=listArray(num);     //return a string of the form "{2, 3, -9}"  
      if(exactlyOneDup(num)){ // if the 
        out+="has "; // print "Has"
      }// close if statement
      else{ //else 
        out+="does not have "; // print "does not have"
      } // close else 
      out+="exactly one duplicate."; // print "exactly one duplicate"
      System.out.println(out); // print out 
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // print statement
      answer=scan.next(); // answer input 
    }while(answer.equals("Y") || answer.equals("y")); // if answer is equal to Y or y, run again 
  }

  public static String listArray(int num[]){ // returns a string as it opens method and looks into array num
    String out="{";// print {
    for(int j=0;j<num.length;j++){ // for j is equal to see, measure number length 
      if(j>0){ // if the number length is greater than 0
        out+=", "; // print this
      } // close if
      out+=num[j]; // add to array
    }// close for loop
    out+="} "; // add to out and print
    return out; // return new out
  }



public static boolean hasDups(int num[]){// opens method hasDups
    boolean flag = false;// sets flag to false
    for (int i=0; i<=num.length-1; i++){ // iterates i from 0 to num.length
        for (int j=i+1; j<=num.length-1; j++){// iterates j from i to num.length
             if (num[i] == num[j]){ // if the numbers are the same
                 flag = true; // flag is true 
             }//close if statement
        
        }// close inner for loop
       
    }// close outer for loop
    
    return flag; // return is flag is true or false
     
}

public static boolean exactlyOneDup(int num[]){ // opens methods exactlyOneDup
    boolean flag = false;// sets flag to false
    int counter = 0; // sets flag to true
    for (int i=0; i<=num.length-1; i++){ // iterates i from 0 to num.length
        for (int j=i+1; j<=num.length-1; j++){// iterates j from i to num.length
             if (num[i] == num[j]){ // if the numbers are the same
                 flag = true; // flag is true 
                 counter++; // increments counter
             }// close if statement
        
        }// close inner for loop 
       
    }// close outer for loop
    
    return (flag && counter == 1); // return flag and counter and sets to 1
    
}// close exactly one dup method

}//end class