package day11stringmethods;

import java.util.Scanner;

public class Odev06 {


	public static void main(String[] args) {
		
		/*Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve başlangıç harﬁnden 
		başlayıp bitiş harﬁnde  biten tüm harﬂeri büyük harf olarak ekrana yazdırın.*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic harfinizi giriniz: ");
		int start = scanner.next().charAt(0);
		
		System.out.print("Lütfen bitis harfinizi giriniz: ");
		int end = scanner.next().charAt(0);		
		
		
		for(int i= start; i<=end;i++) {
			
			char x = (char) i;
			String s = Character.toString(x);
			String z = s.toUpperCase();
			
			System.out.print(z);
		}
	}}







