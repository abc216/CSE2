//lab 2
// Alana Corey
// 9/5/14
// CSE 2


//The program is a cyclometer. A cyclometer measures speed, distance, and more. 
// This program prints MINUTES for each trip, COUNTS for each trip, MILES in each trip, and TWO trip distances combined. 

public class Cyclometer {

public static void main(String[] args) {
    int secsTrip1=480;
    int secsTrip2=3220;
    int countsTrip1=1561;
    int countsTrip2=9037;
    double wheelDiameter=27.0; // The diameter of the cyclometer wheel
    double PI=3.14159;// Pi
    int feetPerMile=5280; // How many feet are in a mile
    int inchesPerFoot=12; // How many inches are in a foot
    int secondsPerMinute=60; // How many seconds there are per minute
    double distanceTrip1, distanceTrip2,totalDistance; // This is the last thing the cyclometer does, and this is the two trip distances combined
    
    System.out.println("Trip 1 took "+
    secsTrip1/secondsPerMinute+" minutes and had" +
    countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
    secsTrip2/secondsPerMinute+" minutes and had " +
    countsTrip2+" counts.");
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip2+distanceTrip2;

    //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was"+totalDistance+" miles");

} 
} 