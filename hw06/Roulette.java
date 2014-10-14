// hw 06
// Alana Corey
// 10/10/14

/*This program takes an input of a number between 1 and 38. A random number between 1 and 38 is also
generated 100 times. The input number and the random number are then compared 100 times. This is 1 trial.
If the input and the random number are equal, a win is added. Once 3 wins hit, a profit is gained. If 
three wins are not hit, the profit is not gained. */


import java.util.Scanner;  // We will be using a scanner to input numbers 
    

public class Roulette{ // creates an open domain for other users to see
    public static void main(String [] args){ // signature to start up java code
    
    System.out.println("We are going to test the number of times your number comes up in 100 spins."); 
    System.out.println("Please input your number between 1 and 38:"); // statements that are printed so user enters correct input
    
    Scanner myScanner;  // decares variable of the scanner
    myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
    int luckyNumber= myScanner.nextInt(); //number system receives from player
    
    int profit=0; // if you win game 3 or more times ; wins*$36
    int rolls=1; //number of rolls of bets
    int randomNum;// random number
    int overallWins=0; // number of times you win the bet
    int loss=0; //number of times you lose the bet
    int trials=0; // number of trials that happens

    while (trials<1000){ // performing the trials less than 1000 times 
        int wins = 0; // we start at 0 wins before any trials have begun
    
        while (rolls<101){ // we roll the input 100 times 
        
        
             randomNum = ((int)(Math.random()*38+1));// random number between 1 and 38
             
             if (randomNum== luckyNumber){ // if the random number between 1 and 38 match the input
                
                wins++; // then we add a win
                overallWins++;//and add a win overall
                } 
    
        rolls++; // we also add a roll, because we rolled ocne 
        }
    
   if (wins>=3){ // if the wins are greater or equal to three
       profit++; // we gain a profit
   }
   if(wins < 3 && wins >= 0){ // if we have no wins
   loss++; // add to the losses 
    }
    rolls = 0; // resets rolls to 0
    trials++; // adds to the trials that have been done for the next roll
    }
    
  
    System.out.println("The total number of winnings is: " + overallWins) ; 
    System.out.println("The total number of profitible trials is : " + profit);
    System.out.println("The total number of winless trials is: " + loss);    
// final print statements that display the number of total wins, the profits, and the loss
    }
    }// close the class and main to end the program
