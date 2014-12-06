import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
            	", and "+c+" are in ascending order");
               	
  }
               	
              	public static int getInt(Scanner userInput){
              		Scanner scan = new Scanner (System.in);
              		System.out.print("Enter an int between 1 and 9: ");
              		while(!scan.hasNextInt()){
              			scan.next();
              			System.out.println("You did not enter an int; one more try!!");
              		}
              	int number = scan.nextInt();
              	
              	while( number > 9 || number < 1 ){
              		System.out.println("You did not enter an int; one more try!!");
              		number = scan.nextInt();
              	}
               	
            return number;
              	}
               	    
               
             public static int larger(int a, int b){
             	int largerInput;
             	
               	if (a>b){
               	largerInput = a;
               	return a;
               	}
               	return b;
                
               	}
               	
            public static int larger(int a, int b,int c){
             	int largerInput;
             	
               	if (a>b && a>c){
               	return a;
               	}
               	else if (b>c && b>a){
               	return b;
               	}   	
               	return c;
            }
               	
               	
               public static boolean ascending(int Hello1, int Hello2, int Hello3){
               	boolean ascending;
               	if (Hello1< Hello2 && Hello2 < Hello3){
               		ascending =true; 
               	}
               	else {
               		ascending = false;
               	}
               return ascending;
               }
}   	
               	
               	
    
