
import java.util.Scanner;

public class safg{
    public static void main(String args[]){
    
        Scanner myScanner;
        myScanner= new Scanner(System.in);  //The scanner will get information from the following print out
        System.out.println("enter an int");
        int n= myScanner.nextInt(); //number system receives from user
        a = sumsq();
        
        System.out.printlnn("The sum of 1+2*2+3*3+.... n*n for n="+n+"is"+a);
    }
    
    public static int sumsq(Scanner x){
        do{
            int a =x.hasNextInt;
            a= Math.sqrt(x);
            return a;
            }
            while(true);
        
    }
    
}