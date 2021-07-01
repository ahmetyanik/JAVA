package day15methodcreation;

public class ParametreliYasKontrolMethodu {

	public static void main(String[] args) {
		
		yasKontrol("Ahmet Yanik",32);
		yasKontrol("Zeynep Duru Yanik",3);
		yasKontrol("Ayse Yanik",31);

	}

	public static void yasKontrol(String adSoyad, int yas) {
		
		if (yas<18) {
			
			System.out.println("Sayin "+adSoyad+" yasiniz 18'den kücük oldugu icin iceri giremezsiniz!");
			System.out.println("********************************************");
			
		}else {
			
			System.out.println("Sayin "+ adSoyad+" kulübümüze hosgeldiniz...");
			System.out.println("********************************************");
		}
	}
	
	
	
}
