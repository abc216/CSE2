public class Final{

  public static void main(String[ ] args) {
      
      for(int i=0; i<10; i++){
          if(i<=4){
              for (int j=0; j<i+1; j++){
                  System.out.print(i);
              }
              System.out.println();
          }
          if(i>=5){
              for (int j=0; j<(10-i); j++){
                    System.out.print(i);
              }
              System.out.println();
          }
          
      }
      
      
  } // ends main method
}// ends class