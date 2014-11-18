/* Alana Corey
HW 10 
11/17/14

The program has two parts. First, it choses 5 random cards and organizes it by suit. It does this by creating
and array for 5 cards. It then randomizes 52 cards and ensures that if a card is repeated, it is discarded of and the
next card is picted. It then uses the remainder to determine what card number it is. The second part of the program
basically says that out of a 10000 trials, how often will a certain card be picked. Itcreates a value for each card
in the array hand and then if the card picked has a certain remainder, it will be added to the total
amount of times that card is picked during the trial. 

*/




import java.util.Random; // declares random scanner 
import java.util.Scanner; // declares scanner 
public class PokerOdds{ // opens main class
  public static void main(String [] arg){ // opens main method 
    showHands(); // calls on method show hands
    simulateOdds(); // calls on method stimulate odds 
  }
  
  public static void showHands(){ // starts show hands method
      
        Scanner myScanner;  // decares variable of the scanner
        myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
  
  
  
  
     boolean x = false;       // statements boolean x  as false 
     
     int deck[]=new int[52]; // gives us an array for 52 cards
     int hand[]=new int[5]; // gives us an array for 5 cards
     
     do{
       
       for (int i =0; i<5; i++){ // creates a value for each card in the array hand
       
           hand[i]=(int)(Math.random()*52); // randomizes the card 1-52 for array i
           for (int j = 0; j< i; j++){ // check to make sure the number is not repeated
           
             if(hand[i] == hand[j] && i != 0){ // if it is repeated
               i--; // delete current card and try again
             }// closes if statement 
               
             }// closes middle for loop
           }// closes first for loop
       
       
      
       
      System.out.print("Clubs:"); // prints suit 
      for(int k= 0; k<5; k++){ // runs through all the cards
        if (hand[k]/13 == 0){ //   if the divide is equal to 0
          if (hand[k]%13 == 0 ){ // and if the remainder is 0
            System.out.print("A ");  // print out this number
          }// close if statement
           if (hand[k]%13 == 1 ){ // if the remainder is 1
            System.out.print("K "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 2 ){//if the remainder is 2
            System.out.print("Q "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 3 ){// if the remainder is 3
            System.out.print("J "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 4 ){ // if the remainder is 4
            System.out.print("10 "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 5 ){ // if the remainder is 5
            System.out.print("9 "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 6 ){ // if the remainder is 6
            System.out.print("8 "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 7 ){ // if the remainder is 7
            System.out.print("7 "); // print out this number
          } // close if statement 
           if (hand[k]%13 == 8 ){ // if the remainder is 8
            System.out.print("6 "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 9 ){ // if the remainder is 9
            System.out.print("5 "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 10 ){// if the remainder is 10
            System.out.print("4 "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 11 ){ // if the remainder is 11
            System.out.print("3 "); // print out this number
          }// close if statement 
           if (hand[k]%13 == 12 ){// if the remainder is 12
            System.out.print("2 "); // print out this number
          }// close if statement 
          
          
        }// closes big if statement
        
      }// closes for loop
      System.out.println("");// gives everything its own row
      
      
      
      
    System.out.print("Diamonds:"  );
       
     for(int k= 0; k<5; k++){
        if (hand[k]/13 == 1){
          if (hand[k]%13 == 0 ){
            System.out.print("A ");
          }
           if (hand[k]%13 == 1 ){
            System.out.print("K ");
          }
           if (hand[k]%13 == 2 ){
            System.out.print("Q ");
          }
           if (hand[k]%13 == 3 ){
            System.out.print("J ");
          }
           if (hand[k]%13 == 4 ){
            System.out.print("10 ");
          }
           if (hand[k]%13 == 5 ){
            System.out.print("9 ");
          }
           if (hand[k]%13 == 6 ){
            System.out.print("8 ");
          }
           if (hand[k]%13 == 7 ){
            System.out.print("7 ");
          } 
           if (hand[k]%13 == 8 ){
            System.out.print("6 ");
          }
           if (hand[k]%13 == 9 ){
            System.out.print("5 ");
          }
           if (hand[k]%13 == 10 ){
            System.out.print("4 ");
          }
           if (hand[k]%13 == 11 ){
            System.out.print("3 ");
          }
           if (hand[k]%13 == 12 ){
            System.out.print("2 ");
          }
        
        }
          
     }
        System.out.println("");
        
        
         
        System.out.print("Hearts:"  );
        
       for(int k= 0; k<5; k++){
        if (hand[k]/13 == 2){
          if (hand[k]%13 == 0 ){
            System.out.print("A ");
          }
           if (hand[k]%13 == 1 ){
            System.out.print("K ");
          }
           if (hand[k]%13 == 2 ){
            System.out.print("Q ");
          }
           if (hand[k]%13 == 3 ){
            System.out.print("J ");
          }
           if (hand[k]%13 == 4 ){
            System.out.print("10 ");
          }
           if (hand[k]%13 == 5 ){
            System.out.print("9 ");
          }
           if (hand[k]%13 == 6 ){
            System.out.print("8 ");
          }
           if (hand[k]%13 == 7 ){
            System.out.print("7 ");
          } 
           if (hand[k]%13 == 8 ){
            System.out.print("6 ");
          }
           if (hand[k]%13 == 9 ){
            System.out.print("5 ");
          }
           if (hand[k]%13 == 10 ){
            System.out.print("4 ");
          }
           if (hand[k]%13 == 11 ){
            System.out.print("3 ");
          }
           if (hand[k]%13 == 12 ){
            System.out.print("2 ");
          }
        }
      }
          System.out.println("");
          
        System.out.print("Spades:"  );
        
     for(int k= 0; k<5; k++){
        if (hand[k]/13 == 3){
          if (hand[k]%13 == 0 ){
            System.out.print("A ");
          }
           if (hand[k]%13 == 1 ){
            System.out.print("K ");
          }
           if (hand[k]%13 == 2 ){
            System.out.print("Q ");
          }
           if (hand[k]%13 == 3 ){
            System.out.print("J ");
          }
           if (hand[k]%13 == 4 ){
            System.out.print("10 ");
          }
           if (hand[k]%13 == 5 ){
            System.out.print("9 ");
          }
           if (hand[k]%13 == 6 ){
            System.out.print("8 ");
          }
           if (hand[k]%13 == 7 ){
            System.out.print("7 ");
          } 
           if (hand[k]%13 == 8 ){
            System.out.print("6 ");
          }
           if (hand[k]%13 == 9 ){
            System.out.print("5 ");
          }
           if (hand[k]%13 == 10 ){
            System.out.print("4 ");
          }
           if (hand[k]%13 == 11 ){
            System.out.print("3 ");
          }
           if (hand[k]%13 == 12 ){
            System.out.print("2 ");
          }
      }
   }
            System.out.println("");
          
      x = false;  // x is false 
      System.out.println("Go again? Enter 'y' or 'Y', anything else to quit- y"); // prints statement 
      String y = myScanner.next();  // takes in a string as an answer 
      
      if (y.equals("Y")||y.equals("y")){ // if y input is Y or y, the boolean is true 
        x = true; // x is true
        } 
    } 
     while (x); // while x is true 
     
    
  }// closes show hands method 
  
  
  
  public static void simulateOdds(){ // opens method 
     int hand[]=new int[5]; // makes array hand, and is less than 5
     int cardPair[]=new int[14]; // makes array card Pair and is less than 13
     cardPair[13] = 10000; // card pair 13 will start at 10000 and decrement down 
     int x = 0; // declares x as 0
     
     
     while (x < 10000){ // runs 10000 times 
    
  
      for (int i =0; i<5; i++){ // creates a value for each card in the array hand
       
           hand[i]=(int)(Math.random()*52); // randomizes the card 1-52 for array i
           for (int j = 0; j< i; j++){ // check to make sure the number is not repeated
             
             if(hand[i] == hand[j] && i != 0){ // if it is repeated
          
               i--;
               break;// delete current card and try again
             }// closes if statement 
               
             }// closes middle for loop
           }// closes first for loop
           
           
       if(exactlyOneDup(hand)){ // opens method 
       
         cardPair[13]--; // if there is a pair, the number of non pairs is decremented 
         
         int temp = 0; // decalres interger temp 
         for (int i =0; i<5; i++){ // creates a value for each card in the array hand
       

           for (int j = 0; j< i; j++){ // check to make sure the number is not repeated
            
             if(hand[i]%13 == hand[j]%13 && i != 0){ // if it is repeated
               temp = hand[i]%13; // delete current card and try again
             }// closes if statement 
               
             }// closes middle for loop
           }// closes first for loop
           
           
           if (temp == 0 ){ // if the hand's division is equal to 0
            cardPair[0]++; // pick 0 and increiment it 
          } // close if statement 
           if (temp == 1 ){// if the hand's division is equal to 1
            cardPair[1]++; //pick 1 and increiment it 
          }// close if statement 
           if (temp == 2 ){// if the hand's division is equal to 2
            cardPair[2]++; // pick 2 and increiment it 
          }// close if statement 
           if (temp == 3 ){// if the hand's division is equal to 3
           cardPair[3]++; // pick 3 and increiment it 
          }// close if statement 
           if (temp== 4 ){// if the hand's division is equal to 4
            cardPair[4]++; // pick 4 and increiment it 
          }// close if statement 
           if (temp== 5 ){// if the hand's division is equal to 5
           cardPair[5]++; // pick 5 and increiment it 
          }// close if statement 
           if (temp == 6 ){// if the hand's division is equal to 6
            cardPair[6]++; // pick 6 and increiment it 
          }// close if statement 
           if (temp== 7 ){// if the hand's division is equal to 7
            cardPair[7]++; // pick 7 and increiment it 
          } // close if statement 
           if (temp== 8 ){// if the hand's division is equal to 8
           cardPair[8]++; // pick 8 and increiment it 
          }// close if statement 
           if (temp== 9 ){// if the hand's division is equal to 9
           cardPair[9]++; // pick 9 and increiment it 
          }// close if statement 
           if (temp== 10 ){// if the hand's division is equal to 10
            cardPair[10]++; // pick 10 and increiment it 
          }// close if statement 
           if (temp== 11 ){// if the hand's division is equal to 11
           cardPair[11]++; // pick 11 and increiment it 
          }// close if statement 
           if (temp == 12 ){// if the hand's division is equal to 12
           cardPair[12]++; // pick 12 and increiment it 
          }// close if statement 
           
       }// close if statement 
      
       x++;// closes if statement exactlyOneDup statement
     }// closes while loop
     
     
  System.out.println("rank"+" "+"freq of exactly one pair"); //prints line
  System.out.println("A \t"+cardPair[0]); // prints A and the numbers of pairs of a
  System.out.println("K \t"+cardPair[1]);
  System.out.println("Q \t"+cardPair[2]);
  System.out.println("J \t"+cardPair[3]);
  System.out.println("10 \t"+cardPair[4]);
  System.out.println("9 \t"+cardPair[5]);
  System.out.println("8 \t"+cardPair[6]);
  System.out.println("7 \t"+cardPair[7]);
  System.out.println("6 \t"+cardPair[8]);
  System.out.println("5 \t"+cardPair[9]);
  System.out.println("4 \t"+cardPair[10]);
  System.out.println("3 \t"+cardPair[11]);
  System.out.println("2 \t"+cardPair[12]);
  
  
  System.out.println("----------------------------"); // print
  System.out.println("total not exactly one pair:" + cardPair[13]); // prints total pairs
  

  
}// end of method

public static boolean exactlyOneDup(int num[]){ // starts exactlyoneDup method 
    boolean flag = false;// sets flag to false
    int counter = 0; // sets flag to true
    for (int i=0; i<=num.length-1; i++){ // iterates i from 0 to num.length
        for (int j=i+1; j<=num.length-1; j++){// iterates j from i to num.length
             if (num[i]%13 == num[j]%13){ //changed line
                 flag = true; // flag is true 
                 counter++; // increments counter
             }// ends if statemet
        
        }// end middle for loop
       
    }// end outer for loop
    
    return (flag && counter == 1); // return flag and counter and sets to 1
    
}// end method
}// ends class 



