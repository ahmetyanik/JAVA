package day17constructors;

public class Constructors04 {
	
	int num1 = 12;
	static int num2 = 22;

	public static void main(String[] args) {
		
//		num1++; //altini kirmizi cizer sebebi main methodun static olmasi yani static method-
				//larin icinde sadece static elemanlar kullanilabilir. num1 static olmadigindan
				// main methodun icinde kullanilamaz
		num2++; //num 2 static oldugundan main methodun icinde kullanmamiz problem olmuyor

		Constructors04 ob = new Constructors04();
		System.out.println(ob.num1);
		
	}

}
