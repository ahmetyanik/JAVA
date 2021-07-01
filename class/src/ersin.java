import java.util.Scanner;

public class ersin {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lutfen adinizi ve soyadinizi giriniz");
		String adSoyad = scanner.nextLine();
		System.out.println(adSoyad);
		
		System.out.print("lutfen yasinizi giriniz");
		int yas = scanner.nextInt();
		scanner.nextLine();
		System.out.println(yas);
		
		System.out.println("lutfen adresinizi giriniz.");
		String adres = scanner.nextLine();
		System.out.println(adres);
		
		System.out.print("Istanbul`da mi yasiyorsunuz? True/False");
		boolean yasam = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println(yasam);
		
		System.out.print("baba adinizi giriniz");
		String babaAdi = scanner.nextLine();
		
		System.out.println(babaAdi);
}
}