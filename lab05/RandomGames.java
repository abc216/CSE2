
    import java.util.Scanner;

    public class RandomGames{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        String letter = myScanner.next();
        

        char letterChar;
        switch (letter){
            case 'R' + "":
            case 'r' + "": 
                int nRou=(int)(Math.random()*38)+1;
                System.out.println("Roulette: " + nRou);
                return;
            case 'C' + "": 
            case 'c' + "":
               int nCraps1= (int) (Math.random()*6)+1;
               int nCraps2= (int) (Math.random()*6)+1;
              int nTotal= nCraps1+nCraps2;
             
               System.out.println(nCraps1+" + "+ nCraps2+" = "+nTotal);
               return;
            case 'P' + "":
            case 'p' + "":
                int card = (int) (Math.random ()*13)+1;
                if (card>=10){
                    System.out.print(card);
                }
                if (card==11){
                      System.out.print("Jack");
                }
                 if (card==12){
                      System.out.print("Queen");
                }
                 if (card==13){
                      System.out.print("King");
                }
                
                int nSuit = (int) (Math.random ()*4)+1;
    
                System.out.print( " of ");
                 if (nSuit==4){
                       System.out.print("Hearts");
                     }
                 if (nSuit==3){
                     System.out.print("Diamonds");
                      }
                if (nSuit==2){
                     System.out.print("Spades");
                     }
                if (nSuit==1){
                     System.out.print("Clubs");
                     }
                     return;
        }
         
        
          if (letter.length() > 1){  // if the length of the string is not equal to one
                  System.out.println("You did not enter a single letter");//prints the statement
                } else { // else
                System.out.println("You did not enter a R, r, C, c, or P, p");//prints the statement
                  }

    }
}