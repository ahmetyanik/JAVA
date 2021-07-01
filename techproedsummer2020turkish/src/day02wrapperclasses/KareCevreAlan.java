package day02wrapperclasses;

import java.util.Scanner;

public class KareCevreAlan {

	public static void main(String[] args) {
	
		//karenin bir kenar uzunlugunu giriniz cevre ve alanini hesaplayalim
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kenar giriniz: ");
		int a = scanner.nextInt();
		
		System.out.println("Karenin cevresi: "+ (4*a));
		System.out.println("Karenin alani: "+ (a*a));

	}

}
