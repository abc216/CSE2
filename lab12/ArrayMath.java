public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }


public static double[] addArrays(double[] a,double[] b){
   double[] min;
   double[] max;
   
   
   if (a.length > b.length){
       max = a;
       min = b;
   }  
   else{
       max = b;
       min = a;
   }
   double[] array = new double[max.length];
   
   for(int i = 0; i < max.length - 1; i++){
       if (i <= min.length-1){
           array[i] = min[i] + max[i];
       }
       else{
           array[i] = max[i];       
       }
       }
   
   
   return array;
   
   }
    
public static boolean equals(double[] a,double[] b){
    boolean flag = false;
    if(a.length == b.length){
        flag = true;
        for(int i = 0; i < a.length-1;i++){
            if(a[i] != b[i]) flag = false;
        }
    }
    
    return flag;
    
    
}
    
}