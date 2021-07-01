import java.util.Scanner;

public class Deneme921 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****Faiz Hesaplama Sistemi*****");		
		
		System.out.print("Lütfen Yatirmak Istediginiz Tutari Giriniz: ");
		double anapara = scanner.nextInt();		
		
		System.out.print("Lütfen Yatirmak Istediginiz Yil Süresini Giriniz: ");
		int yil = scanner.nextInt();
		
		double toplampara=anapara;	
		
		for (int i = 1;i<=yil;i++) {
	

			toplampara = toplampara + toplampara*6/100;

			
			System.out.println(i+". yilin sonunda toplam paraniz: "+ (int)toplampara);
			
		}
	}
}
