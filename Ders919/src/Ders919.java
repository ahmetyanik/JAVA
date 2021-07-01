// OOP VE CLASSLAR
//Fields
//Methods

public class Ders919 {
	public static void main(String[] args) {
		Car2 car2 = new Car2();
		
		car2.setColor("Gümüs");
		car2.setModel("Renault Megane");
		car2.setEngine(1.6);
		car2.setDoors(4);
		
		
		
		
		
		System.out.println("Aracin rengi: "+ car2.getColor());
		System.out.println("Aracin modeli: "+ car2.getModel());
		System.out.println("Aracin motor hacmi: "+ car2.getEngine());
		System.out.println("Aracin kapisi: "+ car2.getDoors());
		car2.start();
		car2.stop();
		
		
		
		
		/*System.out.println("Aracin modeli: "+ car2.model);
		System.out.println("Aracin motoru: "+ car2.engine);
		System.out.println("Aracin kapi sayisi: "+ car2.doors); */
		
		
		
		
	}
	
	
	
	
	
	
	

}
