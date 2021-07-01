package day15methodcreation;

public class ParametreMantigi {

	public static void main(String[] args) {
		
		selam("ahmet"); // 3. parametreli methodun sekli
		
		System.out.println(toplama(12,16));

	}
	
	
	public static void selam(String isim) {// 1. metodu parametreli kullanabilmek icin parametrenin type'ini
										   // ve adini girmek gerekiyor
		
		System.out.println("Selam "+isim); // 2. bu kisimda parametre ciktiya nasil eklemlenecekse o sekilde kullaniliyor
		
	}
	
	public static int toplama(int a, int b) {
		
			return a+ b;
	}

}
