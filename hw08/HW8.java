/*Alana Corey
HW 08
10/26/14

The program takes in several methods. The first part is the table of contents. The latter 3 methods are
the pages that the intial method refers to. The latter methods take in either a string, a char, and the scanner,
and then reports back to the main method in order to create an output. If the user enters an incorrect 
input that is not programed, the program fails to run. 

*/


import java.util.Scanner; // states we will use a scanner
public class HW8{ // declare class 
  public static void main(String []arg){ // opening MAIN method
		char input; // declare char 
		Scanner scan=new Scanner(System.in); // introducing the scanner and declaring it
		System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); // print for 1st method, just to start program
		input=getInput(scan,"Cc"); // input for above statement
		System.out.println("You entered '"+input+"'"); // states the input to the user
		System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // prompts the user with second method
		input=getInput(scan,"yYnN",5); //give up after 5 attempts
		if(input!=' '){ // if the input is not = to Y,y, n, or N
	   	System.out.println("You entered '"+input+"'"); // states the input to the user
		}
		input=getInput(scan,"Choose a digit.","0123456789"); // input a digit
		System.out.println("You entered '"+input+"'"); // show input
  } // closes main method
	
	
		public static char getInput(Scanner x, String y){ // method opening
		char z; // declare 
			while(true){ // opening while statement
			  if(x.hasNext()){ 
			  	z=x.next().charAt(0);  // assign char an input
			  		if (z == 'C' || z == 'c' ){ //if input is equal to C or c, we are testing true
				break; // kicks us our of while loop
				} // closing if statement 
			  }
			
		  // closes the if statement
		} // closes the while loop
		return z; // moves to next method
		} // method closing

	
		
	public static char getInput(Scanner x, String a, int q){ //method opening
	char z= x.next().charAt(0); // assign char an input
	int p=0; // declare p=0
	while(p<q){ // opening while statement
			if (z == 'y' || z == 'Y' || z == 'n' || z == 'N'){ //if input is equal to Y, y, N, n we are testing true
			break; // kicks us our of while loop
			} // closes if statement
			else{ 
			System.out.println("You did not enter a character from the list 'yYnN'; try again"); // prints error and prompts new input
			}// closes else statement
			p++;
	}// closes the while loop
	return z; // moves to next method
	}// closes method
		
		
		
		
	public static char getInput(Scanner x, String y, String z){ // method opening
		char f; // declare 
		System.out.println(y);// print the opening statement
		while(true){	// opening while loop
		f = x.next().charAt(0);  // assign char an input
				if(f=='9' || f== '8' || f==  '7' || f==  '6' || f==  '5' || f==  '4' ||  f== '3' || f==  '2' || f==  '1'){ // if input is greater than 1
	
				
		break;// kicks us our of while loop
	
		}// closes second if statement, x.length 
		else{ // else
		System.out.println("You did not enter an acceptable character"); // error statement
		}// error statement
		 
		}// closes while loop
		return f;  // moves to next method
}// closes method

}// closes public class