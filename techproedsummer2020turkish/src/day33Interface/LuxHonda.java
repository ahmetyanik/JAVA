package day33Interface;

public class LuxHonda extends Araba implements IcAraba,DisAraba{
	
	public static void main(String[] args) {
		
		LuxHonda luxHonda = new LuxHonda();
		
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
	
		System.out.println(IcAraba.price); //Interface adiyla hem IcAraba'da hem de DisAraba'da 
										   // yer alan price'i cagirdik
		
		luxHonda.doseme();
		luxHonda.isitma();
		
	}

	@Override
	public void move() {
		
		System.out.println("3 saniyede 100 km'lik hiza ulasir");
		
	}

	@Override
	public void kapi() {
		
		System.out.println("Parmak izi ayarli kapi");
				
	}

	@Override
	public void direksiyon() {
		
		System.out.println("Gercek deri direksiyon");
				
	}

	@Override
	public void koltuk() {
		
		System.out.println("Isitmali deri koltuk");
		
	}

	@Override
	public void klima() {
		
		System.out.println("Dijital klima");
		
	}

}
