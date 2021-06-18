import java.util.Scanner;
public class KFS_MilitaryHour_Main 
{
        public static void main(String[] args) 
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Write the first time in the military format: "); // takes user input for the first time  
            int startTime = in.nextInt();
                
            System.out.print("Write the second time in the military format: "); // takes the user input for the second time 
            int endTime = in.nextInt();
            
            int startMinutes = minutesSinceMidnight(startTime);
            int endMinutes = minutesSinceMidnight(endTime);
    
            int dif = endMinutes - startMinutes;
    
            int hour = dif / 60;
            int min = dif % 60;
    
            System.out.println("Hours difference: " + hour + " ; Minutes difference: " + min);
        }
        public static int minutesSinceMidnight(int milTime) 
        {
            double time = milTime / 100d;
    
            int hours = (int) Math.floor(time);
            int minutes = milTime % 100;
    
            System.out.println(hours + ":" + minutes);
    
            return (hours * 60) + minutes;
        }
}
