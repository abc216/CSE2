public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }



public static int join(int a, int b){
     a = Math.abs(a);
     while (a > 0){
         
         b = addDigit(b,a%10);
         a = a/10;
     }
     return b;
}

public static int addDigit(int a, int b){
     
     boolean negA = false;
     boolean negB = false;
     if(a < 0){
         negA = true;
         a = -a;
     }
      if(b < 0){
         negB= true;
         b = -b;
     }
     int temp = a;
     int counter = 0;
     while(temp > 1){
          temp /=10;
          counter++;
     }
    
   int multiplier = (int)Math.pow(10,counter);
     if(Math.abs(b)<=9 && Math.abs(b)>=0 ){
         if (b == 0){
             b = 10;
         }
         a = a + b*multiplier;
         
     }
     if(negA){
         a = -a;
     }
     if(negB){
         a = -a;
     }
     return a;
    
}

}// end of 