/*

Alana Corey
HW 05 part 1
9/25/14


The purpose of this lab is to have the user input one of many letters, prompted by a statement asking for a specific letter. 
Using cases in switch statements, we case chars to strings and print out whatever is the input. If the user
puts in an input that is either not a character, or not a single character prompted in the original print statement, and 
error will occur. 
*/



import java.util.Scanner;
 // tells Java we are going to have the user import information


    public class BurgerKing{ // Opens the code up to the public. Starts the code 
    public static void main(String [] args){ // signature to start up java code
        
        Scanner myScanner;  // decares variable of the scanner
        myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
        System.out.println("Enter a letter to indiciate the choice of Burger(B or b), Soda (S or s), or Fries(F or f)");
        // prints out the statement that the user will need to respond to
        String nFirst = myScanner.next(); // initalizes the scanner to take in a string and call it nFirst
        
       
     
     switch (nFirst){ // takes in code from nFirst to start the switch statement. If the input is not any case, it moves right
                    //  past it
     
        case 'B' + "": // makes char a string
        case 'b' + "": // if input is not B, it will see if it is b  
         
                System.out.println("You ordered a burger"); // prints the statement
                break; // moves to next case (nSecond)
        case 'S' + "":  // makes char a string
        case 's' + "":  // makes char a string    
                System.out.println("You ordered a soda");// prints the statement
                break;// moves to next case (nSecond)
            
        case 'F' + "":// makes char a string
        case 'f' + "":// makes char a string
                 
                System.out.println("What size fries? Large(L,l) or Small (S,s)");
                // prints out the statement that the user will need to respond to
                String nSize=myScanner.next(); // makes a new input from above string directly related to fries 
        case 'l' + "":// makes char a string
            System.out.println("You ordered a small"); //prints the statement
                break;// moves to next case (nSecond)
        case 'L' + "": // makes char a string
             System.out.println("you ordered a large"); // prints the statement
                break;// moves to next case (nSecond)
           
            default: // if none of the above cases are inputed, the error statements follow 
            if (nFirst.length() == 1){ // if the length of the string is not equal to one
            System.out.println("You did not enter B b S s F f"); //you did not enter one of the following inputs
            } else { // else
                System.out.println("You did not enter a single character"); // you did not enter a single character 
            }
            return;
            
            
     }
   
     
       System.out.println("Enter a letter to indiciate the choice of all topings (A or a), Cheese (C or c) or None(N or n)");
       //     // prints out the statement that the user will need to respond to
       String nSecond= myScanner.next(); // initalizes the scanner to take in a string and call it nSecond
        
        switch(nSecond){   
            // takes in code from nSecond to start the switch statement. If the input is not any case, it moves right
            //  past it
        case 'A' + "": // makes char a string
        case 'a' + "": // makes char a string   
                System.out.println("You wanted all the topings");//prints the statement
                break;// moves to next case (nThird)
        case 'C' + "": // makes char a string
        case 'c' + "":  // makes char a string  
                System.out.println("You ordered cheese on your burger");//prints the statement
                break;// moves to next case (nThird)
        case 'N' + "": // makes char a string
        case 'n' + "":  // makes char a string  
                System.out.println("You did not want topings");//prints the statement
                break; // moves to next case (nThird)
       
        
         default: // if none of the above cases are inputed, the error statements follow 
            if (nSecond.length() == 1){  // if the length of the string is not equal to one
            System.out.println("You did not enter A a C c N n");//prints the statement
            } else { // else
                System.out.println("You did not enter a single character");//prints the statement
            }
            return; // terminates program 
            
        }
     
     System.out.println("Do you want a pepsi? P or p");   
     // prints out the statement that the user will need to respond to
     String nThird = myScanner.next(); // initalizes the scanner to take in a string and call it nThird
                
               
            switch(nThird){
                // takes in code from nThird to start the switch statement. If the input is not any case, it moves right
                //  past it
                case 'P' + "":// makes char a string
                case 'p' + "":  // makes char a string  
                  
                    System.out.println("You ordered a pepsi");//prints the statement
                    break;// moves to next case (nFourth)
                    
                default: // if none of the above cases are inputed, the error statements follow 
                 if (nThird.length() == 1){  // if the length of the string is not equal to one
                  System.out.println("You did not enter P or p");//prints the statement
                } else { // else
                System.out.println("You did not enter a single character");//prints the statement
                  }
                  return; // terminates program
                    
            }
            
             System.out.println("Do you want a coke(C or c), sprite(S or s) or mountain dew(M or m)");
                 // prints out the statement that the user will need to respond to
             String nFourth = myScanner.next(); // initalizes the scanner to take in a string and call it nFourth
                    
            switch(nFourth){
                // takes in code from nFourth to start the switch statement. If the input is not any case, it moves right
                //  past it
                    
                    case 'C' + "":// makes char a string
                    case 'c' + "":// makes char a string
                   
                      System.out.println("You wanted a coke");//prints the statement
                      break;  // moves to next case
                
                    
                    case 'S' + "":// makes char a string
                    case 's' + "":  // makes char a string 
                   
                    System.out.println("You wanted a sprite");//prints the statement
                    break; // moves to next case
                    
                   
                    case 'M' + "":// makes char a string
                    case 'm' + "":   // makes char a string
                    
                    System.out.println("You wanted a mountain dew");//prints the statement
                    break; // moves to next case
                
                    
               default: // if none of the above cases are inputed, the error statements follow 
               if (nFourth.length() == 1){  // if the length of the string is not equal to one
              System.out.println("You did not enter etner C c S s M m");//prints the statement
               } else { // else
                System.out.println("You did not enter a single character");
                }//prints the statement
            return;// terminates the program
                
}
}
            }
           
    
    
    