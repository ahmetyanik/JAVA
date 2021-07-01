package day06ifstatetement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen en giriniz: ");
		double en = scanner.nextDouble();
		System.out.print("Lütfen boy giriniz: ");
		double boy = scanner.nextDouble();
		
		
		
		if(en==boy) {
			
			System.out.println("Bu bir karedir");
		}else {
			
			System.out.println("Bu bir dikdörtgendir");
			
		}		

	}

}
