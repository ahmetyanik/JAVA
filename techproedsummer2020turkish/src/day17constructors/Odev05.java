package day17constructors;

public class Odev05 {

	static int x;
	int y;
	Odev05(){
		x +=2;
		y++;
	}
	static int getSquare() {
		return x*x;
	}
	
	public static void main(String[] args) {
		Odev05 sm1 = new Odev05();
		System.out.println(sm1.x+" ,"+sm1.y);
		Odev05 sm2 = new Odev05();
		System.out.println(sm1.x+" ,"+sm1.y);
		int z = sm1.getSquare();
		System.out.println(sm1.x+" ,"+sm1.y);
		System.out.println("-x"+z+"-y"+sm2.y);

	}

}
