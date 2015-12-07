package euler;

/* Lovely solution by Malay from
 * https://projecteuler.net/thread=19;page=7 
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Problem19 {
	
	public static int numberSundays(){
		Calendar cal = Calendar.getInstance();
		
		int sundays = 0;
		
		for (int year=1901; year <= 2000; year++){
			for (int month=1; month<=12; month++){
				cal.set(GregorianCalendar.YEAR, year);
				cal.set(GregorianCalendar.MONTH, month);
				cal.set(GregorianCalendar.DATE, 1);
				
				if(cal.get(Calendar.DAY_OF_WEEK)==7){
					sundays++;
				}
			}
		}
		return sundays;
	}
}