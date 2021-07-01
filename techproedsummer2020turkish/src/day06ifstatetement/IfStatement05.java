package day06ifstatetement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		// Kullanicidan bir dikdortgenin en ve boyunu alin.
		// En ve boy esit ise ekrana "Bu bir karedir" yazdirin
		// En ve boy farkli ise ekrana "Bu bir dikdortgendir" yazdirin		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen en giriniz: ");
		double en = scanner.nextDouble();
		System.out.print("Lütfen boy giriniz: ");
		double boy = scanner.nextDouble();
		
		if (en==boy) {
			
			
			System.out.println("Bu bir karedir.");
		}
		if(en != boy) {
			
			System.out.println("Bu bir dikdörtgendir");
		}
		
	}

}
