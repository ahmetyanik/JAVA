package day15methodcreation;

public class Parametre02 {

	public static void main(String[] args) {
		
		
		durum("Ahmet Yanik",32,"Evli");
		System.out.println("**********");
		durum("Ayse Yanik",31,"Evli");
		System.out.println("**********");
		durum("Zeynep Duru Yanik",3,"Bekar");

	}
	
	public static void durum (String ad, int yas, String medeniHal) {
		
	
		System.out.println("Adiniz: "+ad+"\n"+"Yasiniz: "+yas+"\n" +"Evlilik durumunuz: "+medeniHal);
		
		
		
	}
	
	
}
