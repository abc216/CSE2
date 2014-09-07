// Alana Corey
// hw02

public class Arithmetic{

  public static void main(String[ ] args) {

// input variables for walmart
//how many socks
int nSock=3;
//cost per sock
double sockCost$=2.58;

//how many drinking glasses
int nGlasses=6;
//cost per glass
double glassCost$=2.29;

//how many envelope boxes
int nEnvelope=1;
//cost per box
double envelopeCost$=3.25;

//tax on all that is bought
double taxPercent$=.06;
double totalTax$=1.48;

//before tax
double totalSockCost$=7.74;
double totalGlassCost$=13.74;
double totalEnvelopeCost$=3.25;
// before purchase total of all items
double totalCost$=24.73;

//tax
double sockTax$=.46;
double glassTax$=.82;
double envelopeTax$=.195;

//total cost with tax
double totalSockCostTax$=8.20;
double totalGlassCostTax$=14.56;
double totalEnvelopeCostTax$=3.45;
//total purchase cost of all items
double totalCostTax$=26.21;



      
    System.out.println( "Item is a Sock " + "Numbers of pairs is " + nSock + " " + "Cost of a pair is " + sockCost$);
    System.out.println( "Item is a Drinking Glass " + "There are " +nGlasses + " " + "glasses "+ "and they cost " + glassCost$ + " " + "each " );
    System.out.println( "Item is a Envelope Box " + "There is " + nEnvelope + " " + "box "+ "and it costs " + " " + envelopeCost$);
    
    System.out.println( "Total sock cost " + totalSockCost$ + " and tax " + sockTax$);
    System.out.println( "Total drinking Glasses cost  " + totalGlassCost$ + " and tax " + glassTax$);
    System.out.println( "Total envelope Box cost " + totalEnvelopeCost$ + " and tax " + envelopeTax$);   
        
    System.out.println( "The total cost before tax is " + totalCost$ + " with a tax of " + totalTax$ + " totalling to " +  totalCostTax$);    
    
  }
    
}