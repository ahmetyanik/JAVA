package day13whiledowhileloops;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
	
//		Kullanıcıdan bir String alın ve bu String’in icinde “a” harﬁ varsa “a” harﬁnin 
//		ilk görünümünün  indexini ekrana yazdırın. “a” harﬁ yoksa ekrana “a harﬁ yok” yazdırın.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir yazi giriniz: ");
		String yazi = scanner.nextLine();
		
		if(yazi.contains("a")) {
			
			System.out.println(yazi.indexOf("a"));
		}else
			System.out.println("a harfi yok");
			
			
			
		scanner.close();	
		}
		
		
		

	}


