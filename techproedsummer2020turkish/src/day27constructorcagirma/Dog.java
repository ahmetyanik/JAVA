package day27constructorcagirma;

public class Dog extends Mammal {

	public boolean sadik = true;
	
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		

	}
	
	public void isBark() {
		System.out.println("Köpekler havlar");
	}
	
	Dog(){
		System.out.println("Dog parametresiz constructor");
	}
	
	

}
