
    import java.util.Scanner;

    public class RandomGames{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card");
        String letter = myScanner.nextString();
        

        char letterChar;
        switch (letter){
            case 'R':
            case 'r': 
                int nRou=(int)(Math.random()*38)+1;
                System.out.println("Roulette: " + nRou);
                return;
            case 'C': 
            case 'c':
               int nCraps1= (int) (Math.random()*6)+1;
               int nCraps2= (int) (Math.random()*6)+1;
              int nTotal= nCraps1+nCraps2;
             
               System.out.println(nCraps1+" + "+ nCraps2+" = "+nTotal);
               return;
            case 'P':
            case 'p':
                break;
        }
        
      
        /*
        case 5: case 6: 
         
         if ( input.equals ('P') || input.equals ('p')){
             if 'input'(1> && <13 || 0> && <12){
        
            int nSuit = (int) (Math.Random ()*4)+1;
            
            if (nSuit=4){
                nPick = Hearts
                
            }
            if (nSuit=3){
                nPick = Diamonds
                
            }
            if (nSuit=2){
                nPick = Spades
                
            }
            if (nSuit=1){
                nPick = Clover 
                
            }
    
             
        System.out.println("Pick a Card: "+ nSuit+" "+nPick);
        return;
         }
         }
         
         else{
             System.out.println(String input+ "does not equal 'R', 'r', 'C', 'c', 'P', or 'p'");
                return;
         }*/
    }
}