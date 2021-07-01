package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		
		/* 4)Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının
		 *  hacmini hesaplayan bir program yazınız.  Not: Dikdörtgenler Prizmasının Hacmi:  En x Boy x Yükseklik 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen eni giriniz: ");
		int en = scanner.nextInt();
		System.out.print("Lütfen boyu giriniz: ");
		int boy = scanner.nextInt();
		System.out.print("Lütfen yüksekligi giriniz: ");
		int yükseklik = scanner.nextInt();
		
		System.out.println("Dikdörtgenler Prizmasinin Hacmi: "+ (en*boy*yükseklik));
		
		
	}

}
