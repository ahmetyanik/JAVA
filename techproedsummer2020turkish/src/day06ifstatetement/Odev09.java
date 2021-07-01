package day06ifstatetement;

import java.util.Scanner;

public class Odev09 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine 
		 * eşit ise ekrana  “Eşkenar üçgen” yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen”  
		 * yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın” 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci Kenari Giriniz: ");
		int first = scanner.nextInt();
		System.out.print("Ikinci Kenari Giriniz: ");
		int second = scanner.nextInt();
		System.out.print("Ücüncü Kenari Giriniz: ");
		int third = scanner.nextInt();
		
		if(first==second && first == third) {
			
			System.out.println("Ücgen bir eskenar ücgendir.");
			
		}else if((first == second && second!=third)||(first == third && second!=third)||(first != second && second==third)){
			
			System.out.println("Ücgen bir ikizkenar ücgendir.");
		}else {
			
			System.out.println("Ücgen cesitkenar ücgendir.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
