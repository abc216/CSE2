import java.util.Scanner;
public class lab11{
    public static void main(String []  arg){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter yo 10 ints biatch ");
        int[] array = new int[10];
        for(int i=0; i< array.length;i++){
            array[i] = getInt(scan);
            System.out.print(" ");
        }
        System.out.println("");
        
        int max = array[0];
        for(int i=0; i< array.length;i++){
            if(array[i]> max)
            max = array[i];
        }
        
        int min = array[0];
        for(int i=0; i< array.length;i++){
            if(array[i]< min)
            min = array[i];
        }
        
        int sum = 0;
        for(int i=0; i< array.length;i++){
            sum += array[i];
        }
        
        int[] reverseArray = new int[10];
        for(int i=0; i< array.length;i++){
            reverseArray[9-i] = array[i];
        }
        
        System.out.println("The minimum value is: "+ min);
        System.out.println("The maximum value is: "+ max);
        System.out.println("The sum is: "+ sum);
        
        for(int i=0; i< array.length;i++){
            System.out.println("" + array[i] + " "+ reverseArray[i]);
        }
        
        
        
        
    }
    
    	public static int getInt(Scanner userInput){
              		Scanner scan = new Scanner (System.in);

              		while(!scan.hasNextInt()){
              			scan.next();
              			System.out.println("You did not enter an int; one more try!!");
              		}
              	int number = scan.nextInt();
               	
            return number;
              	}
    
}