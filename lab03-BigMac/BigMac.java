// Alana Corey
// Lab 3 
// 9-10-14

 // to use scanner, we need to import it to the complier
        import java.util.Scanner;
        

public class BigMac {
    public static void main(String[] args){
        // start to every code
        
       
        Scanner myScanner;
        //declare like interger
        myScanner = new Scanner( System.in );
        System.out.print(
            "Enter the number of Big Macs(an interger > 0): ");
            // telling the code to print everything as an interger greater than 0
            int nBigMacs = myScanner.nextInt();
            // accepting an input 
            
            System.out.print("Enter the cost per Big Mac as "+
            " a double (in the form xx.xx): ");
            // Printing out the cost of big mac
            double bigMac$ = myScanner.nextDouble();
            System.out.print(
                "Enter the percent tax as a whole number (xx): ");
               double taxRate = myScanner.nextDouble();
               // creating a double for tax rates of the scanner
               taxRate=taxRate/100;
               // proportion
               
               //printing out the output
               double cost$=2.22;
               int dollars=7;
            
              int dimes;
              int pennies; // storing digits 
               //Cost with the use of currency // to use scanner, we need to import it to the complier
    
            cost$ = nBigMacs*bigMac$* (1+taxRate);
            dollars=(int)cost$;
            dimes=(int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of "+nBigMacs
            +" BigMacs, at $"+bigMac$ +" per BigMac, with a" +
            " sales tax of "+ (int)(taxRate*100) + "% is  $" 
            +dollars+'.'+dimes+pennies);
               
    }
}