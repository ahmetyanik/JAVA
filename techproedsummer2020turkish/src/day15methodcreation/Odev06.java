package day15methodcreation;

import java.util.Random;
import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {

		//do_while kullanarak bir oyun tasarlayın
		
		
		Random rnd = new Random();
		int x = rnd.nextInt(6);
		Scanner scanner = new Scanner(System.in);
		int sehir = x+1;
		

		
		int	Adana	= 0;
		int	Adıyaman = 1;
		int	Afyon =	2;
		int	Ağrı = 3;
		int	Amasya = 4;
		int	Ankara = 5;
		int	Antalya = 6;
		
		
		
		System.out.println("***********************");
		System.out.println("Adana 1\n" + 
				"Adıyaman 2\n" + 
				"Afyon 3\n" + 
				"Ağrı 4\n" + 
				"Amasya 5\n" + 
				"Ankara 6\n" + 
				"Antalya 7");
		System.out.println("***********************");
		System.out.println("3 hakkiniz bulunmaktadir. Sehirlerin yanindaki sayilarla tahmin ediniz");
		System.out.println("Bas harfim A ve ben bir sehirim tahmin et bakalim neresiyim: ");
		
		int tahmin;
		int tahminHakki =3;
		do {

			tahmin = scanner.nextInt();
			
			if(tahmin==sehir) {
			System.out.println("Tebrikler Dogru Tahmin");
			break;
			}
			if (tahminHakki==1) {
				
			System.out.println("Oyunu Kaybettiniz. Tahmin etmeniz gereken sehir: "+sehir+" idi.");
			break;
			}			
			tahminHakki--;
			
			if(tahmin!=sehir) {
				
				System.out.println("Sectiginiz sehir "+tahmin+" fakat yanlis tahmin! Kalan tahmin hakkiniz: "+tahminHakki);
				System.out.println("Lütfen bir secim daha yapiniz");
			}
			

			
		}while(!(tahmin==sehir));
			
		
		

		
		

	}

}
