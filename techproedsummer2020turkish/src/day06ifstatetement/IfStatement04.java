package day06ifstatetement;

public class IfStatement04 {

	public static void main(String[] args) {

		//bir tane String variable olusturun ve kücük günlerle bir deger atayin
		//eger atanan deger hafta ici günlerinden birinin ilk güni ise ekrana hafta ici yazdirin
		// eger atanan deger hafta sonu günlerinden birinin ilk güni ise ekrana haftasonu yazdirin
		
		String gün = "sali";
		
		if (gün.equals("pazartesi") || gün.equals("sali") || gün.equals("çarsamba") || gün.equals("persembe") || gün.equals("cuma")) {
			
			
			System.out.println(gün+" haftaici günüdür.");
		}
		
		if (gün.equals("cumartesi") || gün.equals("pazar")) {
			
			
			System.out.println(gün+" günü haftasonudur.");
		
		
		}
	}

}
