package day14dowhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
	
//		Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa 
//		ekrana “a harfi var” yazdırın.  “a” harfi yoksa tekrar bir String girmesini isteyin.
		
		Scanner scanner = new Scanner(System.in);
	
		String str = "";
		
		do {
			
			System.out.print("Bir yazi giriniz: ");
			str = scanner.nextLine();
			
				
			
		}while(!(str.contains("a")));
		
		System.out.println("a harfi var");
		

	}

}
