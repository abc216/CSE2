// Alana Corey
// lab 07




import java.util.Scanner;

public class LoopTheLoop {
    public static void main (String [] args){
    
    int nStars = 10;
    String aSCIICharacter= "*";
    for (nStars=0; nStars<=10; nStars++){
        System.out.print("*");
         }
         
         
        
        for (int i= 0 ; i<nStars; i++)
        {
        for (int x=0; x<i; x++)
        {
            System.out.print("*");
        }
            System.out.println("");
        }
        
        Scanner myScanner;  // decares variable of the scanner
        myScanner= new Scanner(System.in); 
        System.out.println("Enter an int between 1-15");
        int nFirst = myScanner.nextInt();
        
    
        for (int a= 0 ; a<=nFirst; a++)
        {
        for (int b=0; b<a; b++)
        {
            System.out.print("*");
        }
            System.out.println("");
        }
        
        
         
    
    
    }
}