package deneme01;

public class Thy extends Türkiye{
	
	String yemek = "Sicak yemek hizmetimiz vardir";
	
	
	public void hizmetler() {
		
		Türkiye  türkiye = new Türkiye();
		
		System.out.println("Türkiye Havacilik Hizmetleri");
		System.out.println(türkiye.cay);
		System.out.println(türkiye.kek);
		System.out.println(hediye+" Tl hediye ceki verilmektedir.");
		System.out.println(yemek);
		
	}

	public static void main(String[] args) {
		
		
		Dünya thy = new Thy();
		
		thy.hizmetler();
		

	}

}
