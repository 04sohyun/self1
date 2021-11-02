package day19;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		
		//À±³â
		GregorianCalendar gc = new GregorianCalendar();
		Date d = gc.getTime();
		if(gc.isLeapYear(2000)) {
			System.out.println("À±³â");
		}
	}
}
