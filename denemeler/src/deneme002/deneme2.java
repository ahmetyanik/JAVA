package deneme002;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		
		/*Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve başlangıç harﬁnden 
		başlayıp bitiş harﬁnde  biten tüm harﬂeri büyük harf olarak ekrana yazdırın.*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic harfinizi giriniz: ");
		char start = scanner.next().toUpperCase().charAt(0);
		
		System.out.print("Lütfen bitis harfinizi giriniz: ");
		char end = scanner.next().toUpperCase().charAt(0);	
		
	
		
		for(char i = start; i<=end; i++) {
			
			System.out.print(i+" ");
			
		}
		
		
		
		
		
		
	}}
	
	
		