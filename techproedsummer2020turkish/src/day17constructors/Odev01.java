package day17constructors;

public class Odev01 {
	
		
		int x = 5;
		
		Odev01(){
			
			System.out.println("-x"+x);
		}
		Odev01(int x){
			this();
			System.out.println("-x"+x);
	}

	public static void main(String[] args) {
		Odev01 mc1 = new Odev01(4);
		Odev01 mc2 = new Odev01();

	}

}
