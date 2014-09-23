//hw 04 PART 3
// Alana Corey
// 9/18/14

// The hw prompts a user to input in a 6 digit number. The code then pulls the last two numbers and pulls whether the course was in the
// fall, spring, or summer (1/2). It also takes the first 4 numbers and casts that as the year of which the semester happened. The code
// takes the input, divides it by 100 to get the first 4 digits to get the year. 

import java.util.Scanner;  // We will be using a scanner to input numbers 
    

    public class CourseNumber{   // Opens the code up to the public. Starts the code 
        public static void main(String [] args){  // signature to start up java code
            
            Scanner myScanner;// decares variable of the scanner
            myScanner = new Scanner (System.in);  //The scanner will get information from the following print out
            System.out.print("Enter a six digit number giving the course semester:");// printed statement for scanner
            int nInput= myScanner.nextInt();  // takes user input and declares it a variable

	if (nInput>186510 && nInput<201440){ // if the input is between these two numbers 
	

int spring=10; // int for the spring
int summer=20;// int for the summer 1
int summer2=30;// int for the summer 2
int fall=40; // int for the fall

int nYear= nInput / 100; // divide the input by 100 to get the year
int nSemester= nYear * 100;// multiply the year to get the semester
int nFinal = nInput-nSemester; // subtracting the input from the semester to get the final number needed to declare seasonal 



if(nFinal==10){ // if the final is equal to 10, print the spring and year of which it happened
System.out.println("The course was offered in Spring of "+nYear);
}

if(nFinal==20){ // if the final is equal to 20, print summer1 and year of which it happened
System.out.println("The course was offered in Summer 1 of "+nYear);
}

if(nFinal==30){// if the final is equal to 30, print summer 2 and year of which it happened
System.out.println("The course was offered in Summer 2 of "+nYear);
}

if(nFinal==40){ // if the final is equal to 40, print the fall and year of which it happened
System.out.println("The course was offered in Fall of "+nYear);
}

else {
    System.out.println("Not a legit semester"); // if they user didn't enter 10,20,30,or 40, they recieved this error 
}
}

    

    else{ // if the number was too large or too small, they recieved this error 
    System.out.println("The number was outside of the range [186510, 201440]");
    }

}
}