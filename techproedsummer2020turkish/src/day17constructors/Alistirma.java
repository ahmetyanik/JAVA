package day17constructors;

public class Alistirma {
	
	static int num1;
	int num2;
	
	Alistirma(int i){
		
		num1 +=i;
		num2 +=i;
	}

	public static void toplama() {
		Alistirma obj2 = new Alistirma(4);
		System.out.println(num1+obj2.num2);
	}
	
	public static void main(String[] args) {
		
		toplama();
		Alistirma2.carpma();
		num1 ++;
		System.out.println(num1);
		
		Alistirma obj2 = new Alistirma(4);
		System.out.println(obj2.num2);
		
		
		
		System.out.println("Static: "+(num1));
		num1 = num1+2;
		System.out.println("Static: "+(num1));
		System.out.println("instance: "+(obj2.num2));
		obj2.num2 = obj2.num2+2;
		System.out.println("instance: "+(obj2.num2));
		System.out.println(obj2.num2);
		
		
		
		
	}

}
