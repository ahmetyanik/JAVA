package day10stringmethods;

import java.util.Scanner;

public class StringOdev {

	public static void main(String[] args) {
        // Kullanicidan ismini girmesini isteyin.
        // Isminin son harfini ekrana yazdirin.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Adiniz: ");
		String ad = scanner.nextLine();
		
		int length = ad.length();
		
		ad.charAt(length-1);
		
		System.out.println(ad.charAt(length-1));
	
		scanner.close();
	}

	
}
