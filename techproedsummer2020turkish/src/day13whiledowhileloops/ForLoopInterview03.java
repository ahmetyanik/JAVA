package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		
		//bir sayinin tersini alin daha sonra bu sayiya iki ekleyin
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi: ");
		String num = scanner.nextLine();
		
		int length = num.length();
		String ters = "5";
		
		for(int i= length-1; i>=0; i--) {
			ters = ters + num.charAt(i)+""; //char'i stringe cevirmek icin sonuna +"" eklenebilir.(basit bir yöntem)		
			
				
		}
			
	
		
		int tersInt = Integer.valueOf(ters);
		tersInt = tersInt+2;
		System.out.println(tersInt);
		

	}

}
