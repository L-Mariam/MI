
public class CycleCalculatorTest
{
	   private final int BEGINNER_SPEED = 10;  
	   private final int INTERMEDIATE_SPEED = 15; 
	   private final int ADVANCED_SPEED = 20; 
	   
	   private final int LOWTEMP = 10;
	   private final int HIGHTEMP = 20;

	   
    // for checkpoint
   public double getDuration(int numMiles, String competency, 
                             int numYearsExperience, boolean cyclingAlone, 
                             int temp, int windSpeed, boolean isRaining)
   
   double speed = 0;

	   public double competency(String type, double speed) {
	   
	   if (type.equals("Beginner")) {
		   speed = BEGINNER_SPEED;}
	   else if (type.equals("Intermediate")) {
		   speed = INTERMEDIATE_SPEED;}
	   else if (type.equals("Advanced")) {
		   speed = ADVANCED_SPEED;} 
	   return speed;
	   }
	   
	   public double iscyclingAlone(double speed, boolean cyclingAlone) {
   
	         if (cyclingAlone) {
	        	speed = speed * 1.2; 
	         }
	         return speed;
	         
	   }
	   
	   public double numYearsExperience(double speed, double numYearsExperience) {
   
	   speed += (numYearsExperience * 0.2f);  
	   return speed;
	   }
	   
	   public double temp(double temp, double speed) {
   
  
	   if (temp > LOWTEMP)
		   speed = speed - (LOWTEMP - temp) * 0.1f;
	   if (temp < HIGHTEMP)
		   speed = speed - (temp - HIGHTEMP) * 0.1f; 
	   }


	   public double temp(double windSpeed, double speed) {

	   int windSets = windSpeed / 15;
	   speed = speed - (windSets * 1);
	   return speed;
	   }
	   
	   public double temp(double windSpeed, double speed) {

	   if (isRaining)
		   speed -= 2;
   
	   return numMiles / speed;   //Duration (hours) = distance (miles) / speed (mph) 

   }
   
   // advanced work: arrays
   public double getTotalDuration(double[] durations)
   {
	   // fill in!
	   double sum = 0;
	   for (int i = 0; i < durations.length; i++)
           sum += durations[i];
	   return sum;
   }
   
   public String getFormattedDuration(double time)  
   {
	   
	   int hr = (int)(Math.floor(time));
	   int mins = (int)(time%hr*60); 
	   String formattedTime = (hr + " hours and " + mins + " minutes");
	   return formattedTime;
   }
   
}


