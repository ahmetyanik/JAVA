package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// Time Manipulation (Zamani degistirecegiz)
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		System.out.println(time.plusHours(6));
		System.out.println(time.plusMinutes(5));
		System.out.println(time.plusSeconds(20));
		
		System.out.println(time.minusHours(3));
		System.out.println(time.minusMinutes(46));
		System.out.println(time.minusSeconds(53));
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		
		

	}

}
