package deneme06;

public class Avrupa extends Dünya {
	
	String kek = "Kek hizmetleri vardir";
	
	
	public void hizmetler() {
		
		System.out.println(cay);
		System.out.println(kek);
		
	}

	public static void main(String[] args) {
		
		
		Avrupa avrupa = new Avrupa();
		
		avrupa.hizmetler();
		

	}

}
