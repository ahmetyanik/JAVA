package day15methodcreation;

public class Parametre03 {

	public static void main(String[] args) {
		
		araba("Ford","Fiesta",1.6,2015,5,"Hatchback");
		araba("Ford","Focus",1.6,2011,5,"Hatchback");
		araba("Fiat","Doblo",1.2,2013,5,"Kamyonet");
		araba("Ford","Transit",1.4);
		
	}
	
	public static void araba(String marka, String model, double motor, int yil, int kapi, String tip) {
		
		System.out.println("Arac Bilgileri:");
		System.out.println("Marka         : "+marka);
		System.out.println("Model         : "+model);
		System.out.println("Motor Hacmi   : "+motor);
		System.out.println("Üretim Yili   : "+ yil);
		System.out.println("Kapi Sayisi   : "+ kapi);
		System.out.println("Aracin tipi   : "+tip);
		System.out.println("*********************");
		
		
	}
	
	public static void araba(String marka, String model, double motor) {
		
		System.out.println("Arac Bilgileri:");
		System.out.println("Marka         : "+marka);
		System.out.println("Model         : "+model);
		System.out.println("Motor Hacmi   : "+motor);
		System.out.println("*********************");
		
		
	}
	

}
