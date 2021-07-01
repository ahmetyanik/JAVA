package day13whiledowhileloops;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
//		Kullanıcıdan bir String alın ve bu String’in ilk harﬁ ile son harﬁnin 
//		yerlerini değiştirerek  ekrana yazdırın. Ornegin; Kullanıcı “Java” girerse 
//		ekrana “aavJ” yazdıracaksınız.

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir yazi giriniz: ");
		String str = scanner.nextLine();
		
		
		int length = str.length();
		String yeniStr= "";
		int i =1;
		
		while(i<length-1) {
			
			yeniStr = yeniStr + str.charAt(i);
			
			i++;					
		}
		
		char ilk = str.charAt(0); 
		char son = str.charAt(length-1);
		
		System.out.println(son+yeniStr+ilk);

		scanner.close();
	}

}
