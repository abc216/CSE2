//hw 04 PART 2
// Alana Corey
// 9/18/14


//  The user inputs a number of a month into the code. All months BESDIES February print the amount of days in the month that has been asked for.
// If February is prompted, then the user enters a year, and the code deciphers what years are leap years and what years are not. It then 
// prints whether or not February has 28 days, or 29 days. 

import java.util.Scanner;  // We will be using a scanner to input numbers 
    

    public class Month {  // Opens the code up to the public. Starts the code 
        public static void main(String [] args){  // signature to start up java code
            
            
        
            Scanner myScanner; // decares variable of the scanner
            myScanner = new Scanner( System.in ); //The scanner will get information from the following print out
            System.out.println("Enter an interger giving the number of the month (1-12)");// printed statement for scanner
            int nInput= myScanner.nextInt();  // takes user input and declares it a variable
            
       boolean x; // declares true and false


	if (nInput==1){ // if the input is equal to 1 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 31 days");
	}

	
	else if (nInput==2){ // if the input is equal to 2 and is true, the output prints the next command
	x=true;
	System.out.print("Enter an int giving the year:"); 
	
	int nYear = myScanner.nextInt(); // scanner's input will be declared nYear
	int sdg = nYear%4; // We figure out the leap year by dividing the year by 4
	if (sdg==0)	{ //if the remainder of the division is 0, then it is a leap year and will print 29 days 
	System.out.println("The month has 29 days.");  
	}
	else{ // if it is not a leap year, it will print 28 days
	System.out.println("The Month has 28 days.");
	} 
	}



	else if (nInput==3){ // if the input is equal to 3 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 31 days");
	}


else if (nInput==4){ // if the input is equal to 4 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 30 days");
	}


else if (nInput==5){ // if the input is equal to 5 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 31 days");
	}


else if (nInput==6){ // if the input is equal to 6 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 30 days");
	}


else if (nInput==7){ // if the input is equal to 7 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 31 days");
	}

else if (nInput==8){ // if the input is equal to 8 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 31 days");
	}


else if (nInput==9){ // if the input is equal to 9 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 30 days");
	}

else if (nInput==10){ // if the input is equal to 10 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 31 days");
	}


else if (nInput==11){ // if the input is equal to 11 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 30 days");
	}

else if (nInput==12){ // if the input is equal to 12 and is true, the output prints the days of the month
	x=true;
	System.out.println("The month has 31 days");
	}

else{
                System.out.println("You did not enter an a month between 1 and 12"); // this will print
                return; // if the input is not between 1 and 12, the output prints the error statement and then concludes the program
				}	
	}
}
