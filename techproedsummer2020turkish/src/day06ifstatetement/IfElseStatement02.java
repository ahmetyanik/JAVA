package day06ifstatetement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen sifrenizi giriniz: ");
		String password = scanner.nextLine();
			
		
		if(password.equals("Java2020")) {
			
			System.out.println("Hosgeldiniz");
		}else {
			System.out.println("Hatali sifre");
		}
		

	}

}
