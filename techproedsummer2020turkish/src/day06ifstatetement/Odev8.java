package day06ifstatetement;

import java.util.Scanner;

public class Odev8 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir character alın eğer character bir 
		 * harf ise ekrana “Harf” yazdırın.  Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir harf giriniz: ");
		char harf = scanner.next().charAt(0);
		
		if((harf=='a')||(harf=='b')||(harf=='c')||(harf=='d')||(harf=='e')||(harf=='f')||(harf=='g') ) {
			System.out.println("Harf");
		}else {
			System.out.println("Harf degil.");
		}
		

	}

}
