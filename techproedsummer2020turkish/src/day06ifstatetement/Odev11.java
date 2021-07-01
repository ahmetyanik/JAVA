package day06ifstatetement;

import java.util.Scanner;

public class Odev11 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum” yazdırın. 
		 *  Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın. Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir yil giriniz: ");
		int year = scanner.nextInt();
		
		
		if(year%1000==0) {
			
			System.out.println("Milenyum");
			
		}else if (year%100==0) {
			
			System.out.println("Yüzyil");
		}else if (year%10==0) {
			
			System.out.println("Onyil");
		}else {
			
			System.out.println("Normal Yil");
		}
			
		
		
		
		
		
		
		
	}

}
