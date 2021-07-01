import java.util.Scanner;

public class Deneme {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci sayiyi giriniz: ");
		double birinci = scanner.nextDouble();
				
		System.out.print("Ikinci sayiyi giriniz: ");
		double ikinci = scanner.nextDouble();
		
		double gecici_sayi;
		
		System.out.println("Birinci Sayi: "+ birinci+" Ikinci Sayi: "+ ikinci);
		
		gecici_sayi=birinci;
		birinci=ikinci;
		ikinci=gecici_sayi;
		
		System.out.println("Birinci Sayi: "+ birinci+" Ikinci Sayi: "+ ikinci);
		
		
		
		
		
		
	}
	
}
