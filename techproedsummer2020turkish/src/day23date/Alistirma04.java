package day23date;

import java.util.Scanner;

public class Alistirma04 {

	public static void main(String[] args) {
		// bir stirng alıyoruz bu stingin içinde * karakteri varsa *'ile beraber 
		//sağındaki ve solundaki birer karakteri silip yeni stringi yazdırıyoruz
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir yazi yaziniz: ");
		String str = scanner.nextLine();
		
		if(str.contains("*")) {
			
			int x= str.indexOf("*");
			System.out.println(str.substring(0, x-1) + str.substring(x+2, str.length()));
			
		}
			
	}

}
