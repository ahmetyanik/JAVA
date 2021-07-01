import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idman programina hosgeldiniz...");
		
		String Idmanlar = "Gecerli Hareketler...\n"
						+"Burpee\n"
						+"Pushup\n"
						+"Situp\n"
						+"Squat";
		
		System.out.println(Idmanlar);
		
		System.out.println("Bir idman olusturun...");
		
		System.out.print("Burpee Sayisi: ");
		int burpee= scanner.nextInt();
		System.out.print("Pushup Sayisi: ");
		int pushup= scanner.nextInt();
		System.out.print("Situp Sayisi: ");
		int situp= scanner.nextInt();
		System.out.print("Squat Sayisi: ");
		int squat= scanner.nextInt();
		
		scanner.nextLine();
		
		idman idman = new idman (burpee, pushup, situp, squat);
		
		System.out.println("Idmaniniz basliyor...");
	
	
	while (idman.idmanBittiMi() == false) {
		
		
		System.out.print("Hareket Türü (Burpee, Pushup, Situp, Squat) : ");
		String tür = scanner.nextLine();
		System.out.print("Bu hareketten kac tane yapacaksiniz?: ");
		int sayi = scanner.nextInt();
		scanner.nextLine();
		idman.hareketYap(tür, sayi);
		
	}
		
	}
	
	

}
