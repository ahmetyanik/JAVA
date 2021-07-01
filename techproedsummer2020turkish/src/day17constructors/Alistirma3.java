package day17constructors;

public class Alistirma3 {

	public static void main(String[] args) {
	
		new Alistirma4(12);
		Alistirma4 obj = new Alistirma4(50);
		Alistirma4 obj1 = new Alistirma4(50);
		
		
		System.out.println(obj.x+","+Alistirma4.y);
		obj.x =60;
		Alistirma4.y ++;
		obj.x ++;
		System.out.println(obj.x+","+Alistirma4.y);
		obj.x = obj.x+3;
		obj.x ++;
		System.out.println(obj.x+","+Alistirma4.y);
		System.out.println(obj1.x+","+obj.y);

	}

}
