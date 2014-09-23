//hw 04 PART 4
// Alana Corey
// 9/18/14

// the code takes an input number and then divides it up where it needs to go. First, by dividing by 3600, we get the hours.
// Then, mutiplying the hours by 3600, and then taking away what is left over, we eventually get down to how many minutes and seconds we have left.
// to end the program, padding is needed to support where the seconds and minutes are less than 0. Padding is then applied to where it is needed. 

import java.util.Scanner;  // We will be using a scanner to input numbers 
    

    public class TimePadding{  // Opens the code up to the public. Starts the code 
        public static void main(String [] args){ // signature to start up java code
            
            Scanner  myScanner; // decares variable of the scanner
            myScanner = new Scanner (System.in);//The scanner will get information from the following print out
            System.out.print("Enter the time in seconds:");// printed statement for scanner
            int nSeconds= myScanner.nextInt();  // takes user input and declares it a variable

	int nHours= nSeconds/3600; //3600 gets us the hours
	int x= nHours*3600; // x is the remaining numbers of both seconds and hours 
	int nMinutes =nSeconds-x; //seconds minus the hours 
	int y= nMinutes/60; // takes the minutes and divides it by 60
	nSeconds = nMinutes-(y*60); // takes the full number of seconds needed after all other factors are pulled 

if(y<10 && nSeconds<10){ // if pads for BOTH the minutes and seconds 
    
System.out.println(nHours+":"+"0"+y+":"+"0"+nSeconds);
return;// terminates once done
} 


if(y<10){ // if pads are needed for ONLY the minutes
    
System.out.println(nHours+":"+"0"+y+":"+nSeconds);
return;// terminates once done
}

if(nSeconds<10){ // if pads are needed for ONLY the seconds 
    
System.out.println(nHours+":"+y+":"+"0"+nSeconds);
return;// terminates once done
}


System.out.println(nHours+":"+y+":"+nSeconds); // prints if no pads are needed

}
}


