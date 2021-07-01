package day06ifstatetement;

import java.util.Scanner;

public class Odev10 {

	public static void main(String[] args) {
		/*Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın. 1. 50 den az - D    
		 *  2. 50(dahil) ile 60 arası - C       3. 60(dahil) ile 80 arası - B.     4. 80(dahil) ustu- A
		 */

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen notunuzu giriniz: ");
		double not = scanner.nextDouble();
		
		if(not>100) {
			
			System.out.println("Hatali Giris Yaptiniz.");
		}else if (not>=80) {
			
			System.out.println("A");
		}else if (not>=60) {
			
			System.out.println("B");
		}else if (not>=50) {
			
			System.out.println("C");
		}else {
			
			System.out.println("D");
		}
		
		
	}

}
