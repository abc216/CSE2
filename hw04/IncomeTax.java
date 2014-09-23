//hw 04 PART 1
// Alana Corey
// 9/18/14


// The purpose if the hw is to prompt the user to enter a interger. Then, the code decides where there number belongs in a series of 
// if statements. Then, the code applies a specific tax to the applied interger based on where it is categorized. 

    import java.util.Scanner; // We will be using a scanner to input numbers 
    

    public class IncomeTax{ // Opens the code up to the public. Starts the code 
        public static void main(String [ ] args){  // signature to start up java code
            
            Scanner myScanner; // decares variable of the scanner
            myScanner = new Scanner (System.in); //The scanner will get information from the following print out
            System.out.print("Enter an int giving a number of thousands:"); // printed statement for scanner
            int nInput= myScanner.nextInt(); // takes user input and declares it a variable
           
            double nTax = 0; // declares the starting tax as 0
            
            if (nInput<20){ // if the input number we get is less than 20, the tax is 5%
            nTax= .05;
            }
            if (nInput>=20 && nInput<40){  // if the input number we get is more than or equal to 20, or less than 40, the tax is 7%
            nTax = .07;
            }
            if (nInput>=40 && nInput<78){ // if the input number we get is more than or equal to 40, or less than 87, the tax is 12%
            nTax=.12;
            }
            if (nInput>=78){ // if the input number we get is more than or equal to 78 the tax is 14%
            nTax=.14;
            }
        
       
            else{
            System.out.println("You did not enter an int"); // this will print if a interger was not entered. 
                return; // and the process will terminate 
  }
  
           double nThousand= (int)nInput*10000; // multiply the input but 100
           double nTaxTotal= (int)nThousand*nTax; // mulitply the tax by the thousand double
           int x=(int)nTaxTotal; // gets rid of the 0's by casting to an int 
           
            
        
            System.out.println("The tax rate on "+nThousand+" is "+nTax+ " and the tax is "+ x); // prints final statement
            
}       
    
}

