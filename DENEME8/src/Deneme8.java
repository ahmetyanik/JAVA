import java.util.Scanner;

public class Deneme8 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		
		System.out.print("Islem Seciniz: ");
		int islem = scanner.nextInt();
		
		switch (islem) {
		
			case 1:
				System.out.println("Birinci Islemi Sectiniz.");
				break;
				
			case 2:
				System.out.println("Ikinci Islemi Sectiniz.");
				break;
				
			case 3:
				System.out.println("Ücüncü Islemi Sectiniz.");
				break;
				
			case 4:
				System.out.println("Dördüncü Islemi Sectiniz.");
				break;
				
			default:
				System.out.println("Gecersiz Islem!");
				
				
		}
		
				
		
	}

}
