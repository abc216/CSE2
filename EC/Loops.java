public class Loops{

  public static void main(String[ ] args) {
      
      for(int i=0; i<10; i++){ // control the sequence of printing from 0  to 9
          
          if (i<=4){
          for (int j=0; j<i+1; j++){ // print the rows
           
            System.out.print(i); // print the numbers
          
      }// ends inner for loop
      
      System.out.println(); // prints the spacings 
          }// ends if statement
        
          if(i>=5){
              for (int j=0; j<(10-i); j++){
                  System.out.print(i);
              }
              System.out.println();
          }
       
      }// ends outer for loop
      
  } // ends main method
}// ends class