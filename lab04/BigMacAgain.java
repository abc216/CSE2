//lab 03
//Alana Corey


// uses the scanner to enter the number of big macs. It prints the total cost of meals and rejects big mac numbers that are not bigger than 0. 
// to use scanner, we need to import it to the complier
        import java.util.Scanner;
        

public class BigMacAgain {
    public static void main(String[] args){
        // start to every code
        
         Scanner myScanner;
        //declare like interger
        myScanner = new Scanner( System.in ); //we are going to be inputing in a new scanner
        System.out.print("Enter the number of Big Macs: "); 
            // prints out the statement 
            int nBigMac= 1;
         
            if (myScanner.hasNextInt()){
            nBigMac = myScanner.nextInt(); // takes answer of statement and declares it int nBigMac
            
            if (nBigMac>0){

                
            double nPrice = 2.22; // varible for price of big mac
            double nTotalPrice = nBigMac*nPrice;    //total cost of macs and price
            
            nTotalPrice = nTotalPrice*100;
            nTotalPrice = (int) nTotalPrice;
            nTotalPrice= (double) nTotalPrice;
            nTotalPrice/=100;

        
            System.out.println("You ordered "+nBigMac+ " for a cost of : "+ nTotalPrice);
            
            
            
        
      System.out.print("Do you want an order of fries? (y,Y,N,n)");

     String x ;
      x=myScanner.next();
    
      
      if (x.equals ("y") || x.equals ("Y")){
          double nFries=2.15;// how much fries cost
          double nTotalOrder= nFries+nTotalPrice;
          nTotalOrder= nTotalOrder*100;
          nTotalOrder = (int) nTotalOrder;
          nTotalOrder= (double) nTotalOrder;
          nTotalOrder/=100;
            
          System.out.println("You ordered fries at a cost of: 2.15");
          System.out.println("Your order total is: "+nTotalOrder);
      }
     
          
    else if (x.equals ("n") || x.equals("N")){
        
        nTotalPrice = nTotalPrice*100;
        nTotalPrice = (int) nTotalPrice;
        nTotalPrice= (double) nTotalPrice;
        nTotalPrice/=100;
         System.out.println("Your order total is: "+nTotalPrice);
     
    }
    else{
                System.out.println("You did not enter an answer(Y/N/y/n)"); // this will print
                return; // and the process will terminate 
            }
            }
            
    else{
        System.out.println("You did not enter an interger");
    }
            }
  
    else{
            System.out.println("You did not enter an int"); // this will print
                return; // and the process will terminate 
            }
        
        
            
   
    } 
    // end of main string
} 
// end fo public class