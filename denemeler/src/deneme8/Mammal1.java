package deneme8;

public class Mammal1 extends Animal1{
	
	int yas = 12;
	
	public void yemek() {
		
		System.out.println("Balinalar suda beslenir...");
	}

	public void yasi() {
		
		System.out.println("Bu balina "+ super.yas+" yasindadir.");
	}
	
	public static void main(String[] args) {

		
		Mammal1 balina = new Mammal1();
		
		balina.yasi();
		
		
	}

}
