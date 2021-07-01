import java.util.Scanner;

public class Deneme916 {
	public static void main(String[]args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("**********************");
			System.out.println("1. Islem Bakiye Ögrenme");
			System.out.println("2. Islem Para Cekme");
			System.out.println("3. Islem Para Yatirma");
			System.out.println("Cikmak icin q'ya basiniz...");
			System.out.println("**********************");
			
			
			int bakiye = 1000;
		
			
					
			while (true) {
				



				System.out.print("Lütfen Islem Seciniz: ");
				
				int islem = scanner.nextInt();

			
				
				if (islem==1) {
					System.out.println("Bakiyeniz: "+bakiye);
					
					
				}
				else if(islem==2) {
					System.out.println("Lütfen Cekmek Istediginiz Miktari Giriniz: ");
					int miktar = scanner.nextInt();
					
					if (bakiye< miktar) {
						System.out.println("Bakiye Yetersiz!...");
					}
					else {
					scanner.nextLine();
					bakiye -= miktar;
					
					}}
				
				else if (islem==3){
					System.out.println("Lütfen Yatirmak Istediginiz Miktari Giriniz: ");
					int miktar2 = scanner.nextInt();
					bakiye += miktar2;
					
				}
				
				
				else if(islem==9) {
					System.out.println("Güle güle...");
					break;
				}
				
				else {
					System.out.println("Hatali Islem...");				
					
				}
					
							
				}
		}}}
		
		
		
		
		
	


