// metod overloading
public class Örnek {	

	public static void skorHesapla(String name, int score) {
		System.out.println(name+ "isimli oyuncunun puani:" + score);
	}
	
	public static void skorHesapla(int score) {
		System.out.println("isimsiz oyuncunun puani:" + score);
	}
	
	public static void skorHesapla(String name) {
		System.out.println(name+ "isimli oyuncunun puani:" + 0);
	}
	
	public static void main(String[] args) {
		skorHesapla("Murat ", 3000);
		skorHesapla(1000);
		skorHesapla("Ahmet ");
	}


}
