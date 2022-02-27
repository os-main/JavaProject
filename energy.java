/**
 * @author: Uthman Ahmed
 * Unit 2
 *calculates the average number of calories a person can burn, based on their weight, with the listed activities.
 **/
public class M2Assignment {
	public static void main(String[] args) {
	int runM = 10;
	// variable for Running MET
	int ballM = 8;
	// variable for Basketball MET
	int slpM = 1;
	// variable for Sleeping MET
      // I used int becuase the values are constant
	double weight = 150;
    double kilos = weight / 2.20462262 ;
    // Variable to change weight in pounds to kilograms
    double number = 0.0175;
   //I use double to show the decimal.
    runM = runM * 30;
    ballM = ballM *30;
    slpM = slpM * 360;
    /*The MET of each activity is multiplied by the number 
    of minutes the person did it for*/
    double cpmRunning = number*runM*kilos;
    double cpmBalling = number*ballM*kilos;
    double cpmSleeping = number*slpM*kilos;
   // Burned calories are calculated for each category. 
    double totalCalories = cpmRunning + cpmBalling + cpmSleeping;
    // This Calculates the totalCalories burned per minute
    System.out.printf(totalCalories + "  Calories Burned");
    // This displays the output
	}
}
