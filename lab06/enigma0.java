/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class enigma0{
  public static void main(String args []){
    
    Scanner scan=new Scanner(System.in);
    
      System.out.print("Enter an int- ");
    
      int n;
    
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
       n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 25: 
        System.out.println("sum is 25");
        System.out.println("Again, you entered "+n);
        break;
      default:
        System.out.println("To repeat, you entered "+n);
        break;
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 
 
 You don't need case 25, so I just put it as case 24. I fixed the n being in the
 statement of n within the if statement and put it outside. 
 */
