package day12scopewhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {

//		Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve başlangıç 
//		harﬁnden başlayıp bitiş harﬁnde  biten tüm harﬂeri büyük harf 
//		olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your first charachter: ");
		char first = scanner.next().toUpperCase().charAt(0);
		
		System.out.print("Please enter your the last charachter: ");
		char last = scanner.next().toUpperCase().charAt(0);
		
		char num = first;
		
		
		while (num<=last) {
			
			System.out.print(Character.toString(num)+" ");
			num++;		
			
		}scanner.close();
	}

}
