package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen kenarlari giriniz: ");
		
		int kenar1 = scanner.nextInt();
		int kenar2 = scanner.nextInt();
		
		System.out.println("Dikt�rtgenin alani: "+ (kenar1*kenar2));
		System.out.println("Dikt�rtgenin alani: "+ 2*(kenar1+kenar2));
		
		
		
	}

}
