package day14dowhileloop;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
	
//		Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, ekrana 
//		o ana kadar girmiş olduğu  tüm sayıların toplamını yazdırınız. 
//		Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		
		Scanner scanner = new Scanner(System.in);

		int num;
		int toplam = 0;
		
		do {
			
			System.out.print("Sayi giriniz: ");
			num = scanner.nextInt();	
			
			toplam += num;						
			
		}while(!(num==0));
		
		System.out.println("Toplam: "+toplam);
		
		
		
	}

}
