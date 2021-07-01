package day13whiledowhileloops;

import java.util.Scanner;

public class AyniSoruWhileile {

	public static void main(String[] args) {
		// Kullanicidan bir String alin ve bu string'i ekrana tersten yazdirin
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir cümle veya kelime giriniz: ");
		
		String str = scanner.nextLine();
		
		int length = str.length()-1;
		
		while(length>=0) {
			
			System.out.print(str.charAt(length));
			length--;
		}

		scanner.close();
	}

}
