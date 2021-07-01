package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Bir charachter girin: ");
		char harf = scanner.next().charAt(0); // Kullanicidan char almak icin next().charAt(0) kullanilir.
		
		if ((harf<=122 && harf>=97)||(harf<=90 && harf>=65)) {
			
			System.out.println("Bu bir harftir.");
			
		}else {
			
			System.out.println("Bu bir harf degildir.");
		}
		
		

	}

}
