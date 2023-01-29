
public class CycleCalculator
{
	/* constants,  which  are  properties  whose  values  do  not 
change.  These  are  typically  declared,  and  values  assigned,  at  the  top  of  a  class.  In  Java  we  would 
write: 
private final int BEGINNER_SPEED = 10; 
final is used to denote  that  the property value will never change, showing that  the property is a 
constant.  You’ll notice that the property name was written in uppercase; this is common practice in 
many  programming  languages  where  constants  are  written  in  full  uppercase  with  words  separated 
by an underscore. 
*/
	   private final int BEGINNER_SPEED = 10;  
	   private final int INTERMEDIATE_SPEED = 15; 
	   private final int ADVANCED_SPEED = 20; 
	   
	   private final int LOWTEMP = 10;
	   private final int HIGHTEMP = 20;

	   
    // for checkpoint
   public double getDuration(int numMiles, String competency, 
                             int numYearsExperience, boolean cyclingAlone, 
                             int temp, int windSpeed, boolean isRaining)
   
   { 
	   double speed = 0;

	   if (competency.equals("Beginner")) {
		   speed = BEGINNER_SPEED;}
	   else if (competency.equals("Intermediate")) {
		   speed = INTERMEDIATE_SPEED;}
	   else if (competency.equals("Advanced")) {
		   speed = ADVANCED_SPEED;}
   
	   if (!cyclingAlone) speed = speed * 1.2;
   
	   speed += (numYearsExperience * 0.2f);
   
  
	   if (temp > LOWTEMP)
		   speed = speed - (LOWTEMP - temp) * 0.1f;
	   if (temp < HIGHTEMP)
		   speed = speed - (temp - HIGHTEMP) * 0.1f;
   
	   int windSets = windSpeed / 15;
	   speed = speed - (windSets * 1);
   
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


