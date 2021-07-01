package day06ifstatetement;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir tamsayı alın eğer tamsayı 3 ile bölünebiliyorsa ekrana “3’ün katı” 
		 * yazdırın. 3 ile bölünemiyorsa ekrana “3’ün katı değildir” yazdırın.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir tam sayi giriniz: ");
		
		int num = scanner.nextInt();
		
		if(num%3==0) {
			
			System.out.println(num+",3'ün katidir.");
		}else {
			
			System.out.println(num+",3'ün kati degildir.");
		}
		
		
		
		
	}

}
