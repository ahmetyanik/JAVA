package abstractclasslar;

public abstract class Abstract1 {
	
	abstract void kapi();
	
	abstract void pencere();
	
	abstract void tuvalet();
	
	int internet(int saat) {
		
		System.out.println(saat*5+" euro ödeme yapmaniz gerekmektedir");
		return saat*5;
		
		
	}
	
	void tv() {
		
		System.out.println("Herhangi bir ücret ödemeniz gerekmemektedir...");
		
	}

}
