package day10stringmethods;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
//		Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, 
//		Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ülkenizin adini yaziniz: ");
		String country = scanner.next();
	
		
		switch (country) {
		
		case "Amerika":
			System.out.println("USA");
			break;
			
		case "Ingiltere":
			System.out.println("UK");
			break;
			
		case "Almanya":
			System.out.println("DE");
			break;
			
		default :
			System.out.println("NA");
		
		
		}
		
	scanner.close();	
		

	}

}
