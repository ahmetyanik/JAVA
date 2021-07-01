package abs;

public abstract class Ucak {
	
	abstract void kapi();
	
	abstract void kanat();
	
	abstract void motor();
	
	void yemekServisi() {
		
		System.out.println("Ucaklarda sandvic verilmektedir...");
		
	}
	
	void internet() {
		
		System.out.println("Ucaklarda internet bulunmaz...");
	}

}
