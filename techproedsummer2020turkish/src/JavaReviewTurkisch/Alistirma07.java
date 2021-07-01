package JavaReviewTurkisch;

import java.util.Scanner;

public class Alistirma07 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Lütfen eni giriniz: ");
		double en = scanner.nextDouble();
		System.out.println("Lütfen boyu giriniz: ");
		double boy = scanner.nextDouble();
		
		
		double cevre = 2*(boy+en);
		double alan = en * boy;
		
		System.out.println("Alan: "+alan);
		System.out.println("Cevre: "+cevre);	
		

	}

}
