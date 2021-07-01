package abstractclass;

public class Runner {

	public static void main(String[] args) {
		
		Kare kare1 = new Kare("Kare",4);
		
		kare1.alan();
		
		Daire daire1 = new Daire("Daire", 3);
		
		daire1.alan();
		
		Sekil sekil;
		
		sekil = new Kare("Kare2",6);
		
		sekil.alan();
		
		kare1.cevre();
		
		
		

	}

}
