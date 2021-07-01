package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		//Kullanicidan alinan stringin bas harfi büyük harf olmasini isteme
		//eger büyük harf degilse uyari verme
		
		Scanner scanner = new Scanner(System.in);
		String str ="";
		
		do {
			
			System.out.print("Adiniz: ");
			str = scanner.nextLine();
			
			if(str.charAt(0)>='A' && str.charAt(0)<='Z') {
				System.out.println("Dogru giris yaptiniz");
			}else {
				System.out.println("Ilk harfi büyük harf olarak giriniz");
			}
		}while(!(str.charAt(0)>='A' && str.charAt(0)<='Z'));
		
		

	}

}
