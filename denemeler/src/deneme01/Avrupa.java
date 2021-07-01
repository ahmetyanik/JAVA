package deneme01;

public class Avrupa extends Dünya {
	
	String kek = "Kek hizmeti bulunmaktadir";
	
	
	public void hizmetler() {		
		
		System.out.println("Avrupa Havacilik Hizmetleri");
		System.out.println(cay);
		System.out.println(kek);
		
	}

	public static void main(String[] args) {
		
		Avrupa avrupa1 = new Avrupa();
		
		avrupa1.hizmetler();
		

	}

}
