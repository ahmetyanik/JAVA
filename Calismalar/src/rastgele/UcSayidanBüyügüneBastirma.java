package rastgele;

import java.util.Scanner;

public class UcSayidanBüyügüneBastirma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen ilk sayiyi giriniz: ");
		int ilk = scanner.nextInt();
		System.out.print("Lütfen ikinci sayiyi giriniz: ");
		int ikinci = scanner.nextInt();
		System.out.print("Lütfen ücüncü sayiyi giriniz: ");
		int ücüncü = scanner.nextInt();
		
		if (ilk>ikinci && ilk>ücüncü) {
			
			System.out.println("En büyük sayi "+ilk+"'dir.");			
			
		}else if (ilk<ikinci && ikinci>ücüncü){
			
			System.out.println("En büyük sayi "+ikinci+"'dir.");
			
		}else {
			
			System.out.println("En büyük sayi "+ücüncü+"'dir");
		}
		
		

	}

}
