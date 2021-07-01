package day06ifstatetement;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu 
		 * birbirine eşit ise ekrana  “Eşkenar üçgen” yazdırın. Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		 */

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen birinci kenari giriniz: ");
		int num1 = scanner.nextInt();
		System.out.print("Lütfen ikinci kenari giriniz: ");
		int num2 = scanner.nextInt();
		System.out.print("Lütfen ücüncü kenari giriniz: ");
		int num3 = scanner.nextInt();
		
		
		if((num1 == num2) && (num1==num3)) {
			
			System.out.println("Eskenar bir ücgendir");
		}else {
			System.out.println("Eskenar bir ücgen degildir.");
		}
	}

}
