package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirmek
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // 
		
		System.out.println(dtf.format(date));
		
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // 
		
		System.out.println(dtf1.format(date));
		
		//DIKKAT: Ay icin M'leri mutlaka büyük harf yazmaliyiz
		
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // 
		
		System.out.println(dtf2.format(date));
		
		
		//Time formatini degistirmek
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss"); 
		//DIKKAT: HH kullanilirsa 24 saatlik cikti verir
		
		System.out.println(dtf3.format(time));
		
		//Baska ülkenin local zamanini almak
		
		System.out.println(time.now(ZoneId.of("America/Sao_Paulo")));
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
