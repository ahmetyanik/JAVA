import java.util.Scanner;

public class Deneme9 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci sayiyi Giriniz: ");
		int sayi1 = scanner.nextInt();
		
		System.out.print("Ikinci Sayiyi Giriniz: ");
		int sayi2 = scanner.nextInt();
		
		System.out.print("Ücüncü Sayiyi Giriniz: ");
		int sayi3 = scanner.nextInt();
		
		
		if ((sayi1>=sayi2) && (sayi1>=sayi3)) {
			
			System.out.println("En büyük sayi: "+sayi1);			
			
		}
		
		else if ((sayi2>=sayi1) && (sayi2>=sayi3)) {
			System.out.println("En büyük sayi: "+sayi2);			
			
			}
		
		else if ((sayi3>=sayi2) && (sayi3>=sayi1)) {
			System.out.println("En büyük sayi: "+sayi3);	
		
		}}}


