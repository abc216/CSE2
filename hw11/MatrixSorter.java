/* Alana Corey
HW 11
12/3/14
Part 2

The method takes in a 3D array up with 100 spaces. It goes through rows and numbers and sets a 
random number to each of the 100 spots. The second method displays the array full of random numbers.
The third method runs through the array and sorts the number based on if the number before is
larger.

*/


public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][]; // declares new array
    mat3d=buildMat3d(); // creates matrix
    show(mat3d); // calls on method
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d)); // calls on method
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]); // calls on method
    show(mat3d); // calls on method
   }
}


public static int[][][] builtMat3d(){ //opens method
    int[][][] matrix = new int[100][100][100] // fills arrays with 100 spaces
    for(int row = 1; row < 4; row++){ // goes through the rows
        for(int j = 1; j < row; j ++){ //  goes through the lines 
            matrix[row][i][0] = rando(); // sets a random number to each spot
        }
    
    return matrix;
}

public static void show(int[][][] x){
    for(int i = 0; i < x.length; i++){ // goes through the slabs
        for(int j = 0; j < x.length; j++){ // goes through the rows
            for(int k = 0; k < x.length; k++){ // goes through the coloumns
                System.out.print(x[i][j][k]); // prints value
    }
    System.out.println(""); // prints space
}
System.out.println(""); // prints space
}
}


public static int[][][] sort(int[][][] x){ // opens method
    for(int i = 0; i < x.length; i++){ // goes through slabs 
        for(int j = 0; j < x.length; j++){ // goes through rows
            for(int k = 0; k < x.length; k++){ // goes through coloumns 
                if(x[i][j][k] > x[i][j][k+1]) // if number is bigger than number after it, it swaps
                temp = x[i][j][k]; // sets temp to number
                x[i][j][k] = x[i][j][k+1]; // if new number is bigger than old
                x[i][j][k+1] = temp; // swap it
    }
    
}

}
}



public static int rando(){
      Random randomGenerator = new Random();// randomizes number
      return randomGenerator.nextInt(100); // returns random number
    }
    
}
  