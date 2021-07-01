package day13whiledowhileloops;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
//		Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını 
//		ekrana yazdırın. Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir yazi giriniz:");
		String str = scanner.nextLine();
		
		int length = str.length();
		
		if (str.length()%2!=0) {
			
			length = length-1;
			
		}else
			length = length;
		
		int i = 0;
		
		while(i<=length-1) {
			
			
			i++;
		}System.out.println(str.substring(0, length/2));	
		
		scanner.close();
			
		}
		

	}


