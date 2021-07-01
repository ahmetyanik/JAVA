package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		
		//Date Manipulation (Date üzerinde degisiklikler yapmak)
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date); //Bugünün tarihi
		System.out.println(date.plusDays(342)); //342 gün sonraki günün tarihi ==>Gün fazla olunca otomatik olarak
											  //ay veya yil da degisir
		
		System.out.println(date.plusMonths(2));//suanki tarihe 2 ay ekler
		
		System.out.println(date.plusYears(2)); // suanki yila 2 yil ekledik
		
		System.out.println(date.plusWeeks(2)); // hafta ekleme
		
		System.out.println(date.minusDays(3)); //3 gün geri gider
		
		System.out.println(date.minusWeeks(1)); //1 hafta geri gider
		
		System.out.println(date.minusMonths(1)); // 1 ay geri gider
		
		System.out.println(date.minusYears(4)); //4 yil geri gider	

	}

}
