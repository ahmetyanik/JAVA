import java.util.Scanner;

public class Deneme917 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen Sayinizi Giriniz: ");
		int sayi = scanner.nextInt();
		
		System.out.print("Basamak Sayisi Kactir?: ");
		int basamak = scanner.nextInt();
		
		
		int gecici_sayi= sayi;
		int toplam = 0;
		
		do {
			
			int basamaktaki_sayi = gecici_sayi%10;
			gecici_sayi /=10;
			
			toplam += Math.pow(basamaktaki_sayi, basamak);
		}
		
		while(gecici_sayi>0);
		
			if (sayi==toplam){
			
			System.out.println("Sayiniz bir Armstrong sayisidir...");
			}
			else
			{
			System.out.println("Sayiniz bir Armstrong sayisi degildir...");
			
			}
			
	}}	