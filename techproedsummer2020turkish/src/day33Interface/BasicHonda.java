package day33Interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba {

	
	
	public static void main(String[] args) {
		
		BasicHonda ba  = new  BasicHonda();
		ba.benzin();
		ba.direksiyon();
		ba.kapi();
		ba.klima();
		ba.koltuk();
		ba.move();
		
		

	}

	@Override
	public void kapi() {
		System.out.println("Kapisi var");
	}

	@Override
	public void direksiyon() {
		System.out.println("Direksiyon var");
	}

	@Override
	public void koltuk() {
		System.out.println("Koltuklari 4 adet");
	}

	@Override
	public void klima() {

		System.out.println("Analog klima");
	}

	@Override
	public void move() {
		System.out.println("Her türlü gider");
	}

}
