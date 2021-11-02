package day19;

import java.util.TimeZone;

public class CalendarEx3 {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id:availableIDs)
			System.out.println(id);
	}
}
