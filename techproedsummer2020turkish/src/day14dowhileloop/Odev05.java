package day14dowhileloop;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
//		Kullanıcıya bir String girmesini söyleyin ve bu String’in ilk harfi ile 
//		son harfi aynı ise ekrana  “Simetrik” yazdırın. Aynı değilse tekrar bir String girmesini isteyin.
		
		Scanner scanner = new Scanner(System.in);
		
		String str ="";
		
		
		do {
			
			System.out.print("Bir yazi yaziniz: ");
			str = scanner.nextLine();		
			
		}
		
		while((str.charAt(0)!=str.charAt(str.length()-1)));		
		
		System.out.println("Simetrik");

	}

}
