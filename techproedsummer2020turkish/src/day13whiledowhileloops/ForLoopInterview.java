package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
		// Kullanicidan bir String alin ve bu string'i ekrana tersten yazdirin
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir cümle veya kelime giriniz: ");
		
		String str = scanner.nextLine();
		
		for(int i = str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
			
			
		}
		scanner.close();
	}

}
