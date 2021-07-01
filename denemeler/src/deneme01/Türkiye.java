package deneme01;

public class Türkiye extends Avrupa{
	
	int hediye = 50;
	
	public void hizmetler() {
		
		
		
		System.out.println("Türkiye Havacilik Hizmetleri");
		System.out.println(cay);
		System.out.println(kek);
		System.out.println(hediye+" Tl hediye ceki verilmektedir.");
		
	}
	

	public static void main(String[] args) {
		
		
		Türkiye  türkiye = new Thy();
		
		türkiye.hizmetler();

	}

}
