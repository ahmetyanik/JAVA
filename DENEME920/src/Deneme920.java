import java.util.Scanner;

public class Deneme920 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);

		int giris_hakki = 3;
		
		String ad = "ahmet";
		String parola = "4242";

		
		while (true) {
			
			System.out.print("Adiniz: ");
			String adi = scanner.nextLine();
			
			System.out.print("Parolaniz: ");
			String parolasi = scanner.nextLine();
			
			
			if (ad.equals(adi) && parola.equals(parolasi)) {
				
				System.out.println("Sisteme Hosgeldiniz"+" Sayin "+ad);
				break;
			}
				
			else if (ad.equals(adi) && !parola.equals(parolasi));
				System.out.println("Parola veya Ad Hatali");
				
				giris_hakki --;
				
				if (giris_hakki<=0) {
					
				System.out.println("Giris Hakkiniz Bulunmamaktadir...");
					break;
				
		}
			

	}}}
				
		
				
				
		
				
	


