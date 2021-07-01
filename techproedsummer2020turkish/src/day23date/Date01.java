package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		
		//Bugünün tarihini ekrana yazdiralim
		
		System.out.println(LocalDate.now());
		
		//Bugünün saatini ekrana yazdiralim
		System.out.println(LocalTime.now());
		
		//Bugünün hem tarihi hem de saati yazdiralim
		System.out.println(LocalDateTime.now());// 2020-05-20T17:02:31.568 Buradaki "T" taih ile zamani 
												//ayirmak icin konuluyor
		

	}

}
