import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		
		
		
		Hesap hesap = new Hesap ("Ahmet", 12345, 1000, "ahmetyank4242@gmail.com", "02423328715");
		Hesap hesap2 = new Hesap ("Ayse", 9876, 2000, "ayseyanikk1212@gmail.com", "02423328715");
		Hesap hesap3 = new Hesap ("Zeynep", 767676,5000);
		
		
		hesap.bilgileri_göster();
		
		System.out.println("*************************************");
		
		hesap2.bilgileri_göster();

		
	}		
			
			
		}
		

	

	
	
	
	
	

