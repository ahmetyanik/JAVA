package day17constructors;

public class Constructors01 {
	
	String isim = "Ali Can";
	int yas = 33;

	
	//Method ile main method ayni classta ise methodu sadece ismini yazarak
	//kullanabilirsiniz (durum1)
	public static void main(String[] args) {
		
		buyume(33); //durum1
		isimDegistir("Ayse Han");//durum1
		

	}
	
	public static void buyume(int yas) {
		yas++;
		System.out.println(yas);
	}
	
	public static void isimDegistir(String isim) {
		System.out.println(isim);
	}

}
