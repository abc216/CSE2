public class lab13{
    public static void main(String []  arg){
        arrayMaker();
    }// closes main metheod
    
 public static void arrayMaker(){
     int[] row1 = new int[5];
     int[] row2 = new int[8];
     int[] row3 = new int[11];
     int[] row4 = new int[14];
     int[] row5 = new int[17];
     
     int[][] fullArray = {row1,row2,row3,row4,row5};
     
     for(int i = 0; i < fullArray.length; i++){
         for(int j = 0; j < fullArray[i].length;j++){
             int random = (int)(Math.random() * 49);
             fullArray[i][j] = random;
         }
     }
     
     printArray(fullArray);
     fullArray = sortArray(fullArray);
     System.out.println("");
     printArray(fullArray);
 }
 
 public static void printArray(int[][] array){
      for(int i = 0; i < array.length; i++){
         for(int j = 0; j < array[i].length;j++){
             System.out.print("" + array[i][j] + " ");
         }
         System.out.println("");
     }
 }
     
 public static int[][] sortArray(int[][] array){
 
 for(int i = 0; i < array.length ; i++){
   array[i] = sortSingleArray(array[i]);
 }
 return array;
 } 
 
 public static int[] sortSingleArray(int[] array){
  for (int i = 0; i < array.length - 1; i ++ )  
     {
          for (int j = i + 1; j < array.length; j ++ )
          {
               if( array[ i ] > array[ j ] )         //sorting into descending order
               {
                    int temp = array[ i ];   //swapping
                       array[ i ] = array[ j ];
                       array[ j ] = temp; 
                }           
          }
     }
     return array;
}
 
     
 
    
    
}
