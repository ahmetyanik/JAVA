package day10stringmethods;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {

		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harﬁni büyük harf olarak ekrana yazdırın.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ülkenizin adini giriniz: ");
		String country = scanner.next();
		
		String neu = country.substring(0,2).toUpperCase()+country.substring(2);
		
		System.out.println(neu);
		
		scanner.close();
	}

}
