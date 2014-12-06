/* Alana Corey
HW 11
12/3/14
Part 2

The code takes in an input from a user, and then recongizes if the input is acceptable. If it is,
it asks the user to enter a string based on the suit of a card, and then whether it is a king, queen, ace
or jack. It then uses separate methods to output if the entered cards are a special combination of a 
flush, straight, pair, etc.

*/

import java.util.Scanner;// initializes scanner
        

public class PokerHands { // opens class
    public static void main(String[] args){ // main method
        // start to every code
        
         int []hand= new int [5]; // creates new array
         int number = 0; // declares int
         int suit = 0; // declares int
         boolean flag = false; // Sets flag to false
         boolean repeat = true;      // sets repeat to true
         Scanner myScanner; //declares we will use scanner
        myScanner = new Scanner( System.in ); //we are going to be inputing in a new scanner
        while(repeat){ //  while loop opens
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand");// print statement
         
      String x ;// declares screen
      x=myScanner.next();// sets scanner to variable x
    if (x.equals ("y") || x.equals ("Y")){ // if x is equal to string 
       
          for(int counter=0; counter<hand.length-1; counter++){ // starts for loop
           System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");  prints 
           x=myScanner.next();// sets scanner to variable x
           
           if (x.equals ("c") || x.equals("d") || x.equals("h") || x.equals("s")){ // if x is equal to string 
               flag = true; .. flag true
               if (x.equals("c")) suit = 0; // if sets c is equal to 0
               if (x.equals("d")) suit = 1; // if sets d equal to 1
               if (x.equals("h")) suit = 2; // if sets h equal to 2
               if (x.equals("s")) suit = 3; // if sets s equal to 3
               
               System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");// prints 
           x=myScanner.next();// if x is equal to string 
           if(x.equals("2")||x.equals("3")||x.equals("4")||x.equals("5")||x.equals("6")||x.equals("7")||x.equals("8")||x.equals("9")||x.equals("10")){// if x is equal to string 
              number = Integer.parseInt(x);　//　sets num to parse 
              number -= 2;// number decrements by 2
           }
           else if(x.equals("a")||x.equals("k")||x.equals("q")||x.equals("j")){// if x is equal to string
               if(x.equals("a")) number = 12; // if sets a is equal to 12
               if(x.equals("k")) number = 11; // if sets k is equal to 11
               if(x.equals("q")) number = 10;  // if sets q is equal to 10
               if(x.equals("j")) number = 9; // if sets j is equal to 9
           }
           else { 
               System.out.println("WOW. YOU SUCK AT ENTERING NUMBERS"); // error statement
               counter--; // decrement counter
           }
           }
           else{
               System.out.println("You did not enter a valid response");// error statement
               counter--; // decrement counter
           }
            hand[counter] = (13 * suit) + number; // multiply array by 13*suit plus number
            
            for(int i = 0; i < counter; i++){
                if (hand[counter] == hand[i]){ // if counter is equal to i
                    System.out.println("Duplicate card, try again!"); // duplicate found
                    counter--;
                }// end if statement
            }// end for loop
           
              
              }//end of for loop
          }//end of if statement
          else {
              repeat = false;  // set into false
              break;// end
          }
          
          showOneHand(hand); // run  hand in showOneHand
          
          findValue(hand); // run hand in findValue
          
    
          }//end of while loop
          
          
    }//end of main method
    
public static void showOneHand(int hand[]){ // starts method
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "2 ","3 ","4 ","5","6 ","7 ", "8","9 ","10 ","J ","Q ",
  	"K ","A "}; // prints
	String out="";// prints space
	for(int s=0;s<4;s++){ //starts for loop
    	out+=suit[s]; // adds to array
  	for(int rank=0;rank<13;rank++){
    	for(int card=0;card<5;card++){
     	if(hand[card]/13==s && hand[card]%13==rank) // if.. add to rank
      	out+=face[rank];
    	}// closes four loop
  	out+='\n';
	}
	System.out.println(out);
  }

     
}

public static void findValue(int hand[]){
    for (int j = 0; j<hand.length; j++) { //sorts array
        for (int k = 0; k < hand.length; k++){
            if (hand[j] < hand[k]) { // if j is smaller than k
                int buffer = hand[j]; // set buffer to j
                hand[j] = hand[k]; // and j to k
                hand[k] = buffer;  // then k to buffer
            }
        }
    }//array sorted
    
    
    // if it's one of these methods, prints respective hand name
    if(isRoyalFlush(hand)){
        System.out.println("Royal Flush");    
    }
    else if(isStraightFlush(hand)){
            System.out.println("Straight Flush");
    }
    else if(isFour(hand)){
        System.out.println("Four of a kind");
    }
    else if(isFullHouse(hand)){
        System.out.println("Full house");
    }
    else if(isFlush(hand)){
            System.out.println("Flush");
    }
    else if(isStraight(hand)){
            System.out.println("Straight");
    }
    else if(is2Pair(hand)){
            System.out.println("Two pair");
    }

    else{
        System.out.println("High Card");
    }
}


 public static boolean isRoyalFlush(int hand[]){
    if(hand[0] % 13 == 8){  // checks to see if first value is 10
        if(hand[1] % 13 == 9 && hand[0] / 13 == hand[1] / 13){ // checks to see if jack in same suit
            if(hand[2] % 13 == 9 && hand[1] / 13 == hand[2] / 13){ // checks to see if queen in same suit
                if(hand[3] % 13 == 10 && hand[2] / 13 == hand[3] / 13){ // checks to see if king in same suit
                    if(hand[4] % 13 == 11 && hand[3] / 13 == hand[4] / 13){  // checks to see if ace in same suit
                        return true;
    }
                }
            }
        }
    }// ends if statement 
    return false;
                }// ends method
    
    public static boolean isStraightFlush(int hand[]){
        if(hand[0] % 13 == 8){  // checks to see if first value is 10
        if(hand[1] % 13 == 9 && hand[0] ){ // checks to see if number is in order
            if(hand[2] % 13 == 9 && hand[1] ){ // checks to see if number is in order
                if(hand[3] % 13 == 10 && hand[2]){ // checks to see if number is in order
                    if(hand[4] % 13 == 11 && hand[3]){  // checks to see if number is in order
                        return true;
                    }
                }
            }
        }
    }// ends if statement 
    return false;
                }// ends method
    
    
      public static boolean isFour(int hand[]){
        if(hand[0] % 13 == 8){  // checks to see if first value is 10
        if(hand[1] % 13 == 9 && hand[0] / 13 == hand[1] / 13){ // checks to see if jack in same suit
            if(hand[2] % 13 == 9 && hand[1] / 13 == hand[2] / 13){ // checks to see if queen in same suit
                if(hand[3] % 13 == 10 && hand[2] / 13 == hand[3] / 13){ // checks to see if king in same suit
                    if(hand[4] % 13 == 11 && hand[3] / 13 == hand[4] / 13){  // checks to see if ace in same suit
                        return true;
                    }
                }
            }
        }
    }// ends if statement 
    return false;
                }// ends method
    
    
     public static boolean isFullHouse(int hand[]){
        if(hand[0] % 13 == 8){  // checks to see if first value is a
        if(hand[1] % 13 == 8 && hand[0] / 13 == hand[1] / 13){ // checks to see if second value is a
            if(hand[2] % 13 == 8 && hand[1] / 13 == hand[2] / 13){ // checks to see if third value is a
                if(hand[3] % 13 == 9 && hand[2] / 13 == hand[3] / 13){ // checks to see if fourth value is b
                    if(hand[4] % 13 == 9 && hand[3] / 13 == hand[4] / 13){  // checks to see if fifth value is a
                        return true;
                    }
                }
            }
        }
    }// ends if statement 
    return false;
                }// ends method
    
     public static boolean isFlush(int hand[]){
        if(hand[0] % 13 == 8){  // checks to see if first value is 10
        if(hand[1] % 13 == 9 && hand[0] / 13 == hand[1] / 13){ // checks to see if jack in same suit
            if(hand[2] % 13 == 9 && hand[1] / 13 == hand[2] / 13){ // checks to see if queen in same suit
                if(hand[3] % 13 == 10 && hand[2] / 13 == hand[3] / 13){ // checks to see if king in same suit
                    if(hand[4] % 13 == 11 && hand[3] / 13 == hand[4] / 13){  // checks to see if ace in same suit
                        return true;
                    }
                }
            }
        }
    }// ends if statement 
    return false;
                }// ends method
    
    
     public static boolean is2pirs(int hand[]){
        if(hand[0] % 13 == 8){  // checks to see if first value is 10
        if(hand[1] % 13 == 9 && hand[0] / 13 == hand[1] / 13){ // checks to see if jack in same suit
            if(hand[2] % 13 == 9 && hand[1] / 13 == hand[2] / 13){ // checks to see if queen in same suit
                if(hand[3] % 13 == 10 && hand[2] / 13 == hand[3] / 13){ // checks to see if king in same suit
                    if(hand[4] % 13 == 11 && hand[3] / 13 == hand[4] / 13){  // checks to see if ace in same suit
                        return true;
                    }
                }
            }
        }
    }// ends if statement 
    return false;
                }// ends method
    
    
}// ends class