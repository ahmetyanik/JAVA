package deneme002;

import java.util.Scanner;



public class deneme0001 {public static void main(String[] args) {

	// Saati saniyeye, mili km'ye, kilogrami grama ceviren 
	//bir method yaziniz. bu methodu main methodun disinda 
	//olusturup main methodun icinden cagiriniz	
			
			
		dönüstürücü();
			
			
			
		}
		
public static void dönüstürücü() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("saat, mil yada kilogram dönüstürünüz: ");
	String birim = scanner.nextLine();
	
	switch(birim) {
	
	case "saat" :
		
		System.out.print("Kac saat?: ");
		int saat = scanner.nextInt();
		System.out.println(saat+" saat "+saat*60*60+" saniyedir");
		break;
		
	case "mil" :
		
		System.out.print("Kac mil?: ");
		double mil = scanner.nextDouble();
		System.out.println(mil+" mil "+mil*1.6+" kilometredir.");
		break;
	
	case "kilogram" :
		
		System.out.print("Kac kg?: ");
		double kg = scanner.nextDouble();
		System.out.println(kg+" kg "+kg*1000+" gramdir.");
		break;
		
	
	
	
	}
	
	
}	
		
		
		
		
		
	}