package day08ternaryoperator;

import java.util.Scanner;

public class OdevTenaryOperator4 {

	public static void main(String[] args) {

		/*Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		 * En ve boy eşit ise ekrana “Kare” farklı ise ekrana “Dikdörtgen” yazdırın.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Eni giriniz: ");
		int en = scanner.nextInt();
		System.out.print("Boyu giriniz: ");
		int boy = scanner.nextInt();
		
		
		String result = en == boy ? "Kare" : "Dikdörtgen";
		
		System.out.println(result);
		
		scanner.close();
		
	}

}
