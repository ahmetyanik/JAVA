package abstractclass1;

public class Runner {

	public static void main(String[] args) {
		
		Kare kare1 = new Kare("karecik",7);
		
		kare1.alan();
		
		Daire daire1 = new Daire("dairecik", 3);
		
		daire1.alan();
		
		kare1.cevre();
		
		kare1.objeIsmi();
		
		daire1.objeIsmi();
		
		daire1.cevre();
		
		Dikdörtgen dk = new Dikdörtgen("dt",7,9);
		
		dk.alan();
		
		Dikdörtgen obj = new Dikdörtgen("dg",3,5);
		
		obj.alan();
		
		

	}

}
