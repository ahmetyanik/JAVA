package day14dowhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

//		Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden
//		başlayıp bitiş değerinde  biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir baskangic degeri giriniz: ");
		int start = scanner.nextInt();
		
		System.out.print("Bir bitis degeri giriniz: ");
		int end = scanner.nextInt();
		
		do {
			
			if(start%12==0) {
				
				System.out.print(start+" ");

			}
			start++;
		}while(start<end);
		

	}

}
