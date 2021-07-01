package denemeler;

import java.util.Scanner;

public class deneme02 {
	

	public static void main(String[] args) {
		
		System.out.println("Lütfen sayilari giriniz: ");
		Scanner scanner = new Scanner(System.in);
		
		int toplam = 0;
		int sayi;
		
		for(int i=1;i<7;i++) {
			
			System.out.println("Sayi "+i+" giriniz: ");
			
		sayi=scanner.nextInt();
		toplam+=sayi;
				
			
		}
		
		System.out.println("Sayilarin Toplami: "+toplam);	

	}

}
