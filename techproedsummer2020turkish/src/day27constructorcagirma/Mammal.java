package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;
	
	
	public static void main(String[] args) {
		
		Mammal mammal = new Mammal();
		

	}
	
	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	
	Mammal(){
		super(); //parenttaki parametresiz constructori cagir
				 // super() keywordünü kullanmasaniz da olur ama bazilari kullanir sasirmayin
				 // super() kullanilacaksa mutlaka ilk satirda olmalidir
				 // super() ve this() ayni constructor'in icinde ayni anda kullanilamaz
				 // cünkü ikisinin de ilk satirda olma zorunlulugu vardir
				 // this() ayni class icindeki parametresiz constructori cagirmak icin kullanilir
		System.out.println("Mammal parametresiz constructor");
	}
	


}
