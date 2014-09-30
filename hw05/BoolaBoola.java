/*Alana Corey
hw 05 part 1
9/25/14

The program takes a bunch of boolean statementts and strings, and then assigns a randomness to them. By using the math.random function, one can say if the
random-choice is less than 5, or greater than 5(50/50), then we can create a random true/false like scenario for the booleans to listen to. 
With the randomness, a statement is printed. It has three booleans (true or false, decieded randomly) and 2 conjuctions (&& and ||), randomly. If the
statement has a false in it, provided by the boolean, then the full statement if false. If the statement has no falses, then it is true. If a user enters
a F, for example, and there is a false in the random statement, a print line will show that the input was correct. It does the same if the input
is inncorrect, and there are not falses in the random statement, but the user enters true. 
*/



import java.util.Scanner;
 // tells Java we are going to have the user import information


    public class BoolaBoola{ // Opens the code up to the public. Starts the code 
    public static void main(String [] args){ // signature to start up java code
        
        Scanner myScanner;  // decares variable of the scanner
        myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
        
        
        boolean bool1; // initalizes the boolean statement
        boolean bool2; // initalizes the boolean statement
        boolean bool3;// initalizes the boolean statement
        
        String sign1; // initalizes the string statement for the signs ( && and ||) 
        String sign2;// initalizes the string statement for the signs 
        
        
        /* Math random creates the random-choosing of whether or not the statement is true or false. By giving
        the  randomness for the Boolean statement and String statement, randomly, the statement will come out true
        or false */
        int randomB1 = (int)(Math.random()*10)+1;
        int randomB2 = (int)(Math.random()*10)+1;
        int randomB3 = (int)(Math.random()*10)+1;
        
        int randomS1 = (int)(Math.random()*10)+1;
        int randomS2 = (int)(Math.random()*10)+1;
        
        if (randomB1 < 5) { // if the first boolean is less than 5(50% chance), then the boolean is true. If not, it is false. 
            bool1 = true;
        }else {
            bool1 = false;
        } 
        
        if (randomB2 < 5){ // if the second boolean is less than 5(50% chance), then the boolean is true. If not, it is false.
            bool2 = true;
        }else{ 
            bool2 = false;
        } 
        
        if (randomB3 < 5) { // if the third boolean is less than 5(50% chance), then the boolean is true. If not, it is false.
            bool3 = true;
        }else {
            bool3 = false;
        }
        
        if (randomS1 < 5){// if the first random is less than 5(50% chance), then the string is &&. If not, it is ||.
           sign1 = "&&";
        }else {
            sign1 = "||";
        }
        
        if (randomS2 < 5){ // if the second random is less than 5(50% chance), then the string is &&. If not, it is ||.
            sign2 = "&&";
        }else {
            sign2 = "||";
        }
            
        
        System.out.println("Does "+bool1+" "+sign1+" "+bool2+" "+sign2+" "+bool3+" have the value of true (t/T) or false (f/F)" );
        // prints out the statement that the user will need to respond to
        // the statement pulls randomly from the Math.Random function, whether or not to pull a true, false, && or ||
        String nFirst = myScanner.next(); // initalizes the scanner to take in a the character and call it nFirst
        
        boolean ansCorrect= true; // creates a statement 
        
        if(bool1 == false || bool2 == false || bool3 == false) { // if any booleans are false
            if (nFirst.equals("F") || nFirst.equals("f")) { // and the input is equal to F or f
                ansCorrect = true; // then the boolean statement is TRUE
            }else if (nFirst.equals("T") || nFirst.equals("t")){ // or else, if there are FALSES in the statement and the user inputs T or t
                ansCorrect = false; // then the boolean statement is FALSE
            }else{
                System.out.println("Invalid input, please enter a single character for true or false.");//if an incorrect input was entered, print this statement
                System.exit(0); // terminate 
            }
        }else {
            if (nFirst.equals("T") || nFirst.equals("t")) {  // if the input is T or t (because there were not falses in the random inital print)
                ansCorrect = true; // then the boolean statement is true 
            }else if (nFirst.equals("F") || nFirst.equals("f")){ // if the input is F or f
                ansCorrect = false; // then the answer is false, because there are no falses in the statement 
            }else{
                System.out.println("Invalid input, please enter a single character for true or false.");//if an incorrect input was entered, print this statement
                System.exit(0);// terminate 
            }
        }
        if (ansCorrect) { // if the answer is correct
            System.out.println("Your answer correct.");    //print this
        }else {// if it is not correct
            System.out.println("Your answer is incorrect."); 
        }// prints answer is incorrect
        
        
        
    }
    }// ends the program