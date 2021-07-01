package day18statickeyword;

public class Test03 {

		int x = 10;
	public static void main(String[] args) {
		
		Test03 t1 = new Test03();
		System.out.println(t1.x);

	}
	static {
		int x = 20;
		System.out.print(x+" ");
	}
}
