import java.util.Scanner;

public class Deneme911 {
	public static void main(String[]args) {
		
		System.out.println("***********************************");		
		System.out.println("Islem Seciniz:");
		System.out.println("Toplama:1");
		System.out.println("Cikarma:2");
		System.out.println("Carpma :3");
		System.out.println("Bölme  :4");
		System.out.println("***********************************");	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci sayinizi giriniz: ");
		double birinci_sayi = scanner.nextDouble();		
		
		System.out.print("Ikinci sayinizi giriniz : ");
		double ikinci_sayi = scanner.nextDouble();
		

		
		System.out.print("Bir islem seciniz: ");
		int islem = scanner.nextInt();
		
		if ((islem == 1)||(islem ==2)||(islem==3)||(islem==4)){
		}
		else {
			System.out.println("Hatali bir islem girdiniz!");
			
			
		}
				
			
		
		
		switch(islem) {
		
			case 1:
					
				System.out.println("Sayilarin Toplami: "+ (birinci_sayi+ikinci_sayi));
				
				break;
				
				
			case 2:
				
				System.out.println("Sayilarin Farki: "+ (birinci_sayi-ikinci_sayi));
				
				break;
				
			case 3:
				
				System.out.println("Sayilarin Carpimi: "+ (birinci_sayi*ikinci_sayi));
				break;
				
				
			case 4:
				
				System.out.println("Sayilarin Bölümü: "+ (birinci_sayi/ikinci_sayi));
				break;
				
					
		
		}
		
		
	}

}
