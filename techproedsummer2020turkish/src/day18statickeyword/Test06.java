package day18statickeyword;

public class Test06 {

	int x = 10;
	
	public static void main(String[] args) {
		
		Test06 t1 = new Test06();
		Test06 t2 = new Test06();
		
		t1.x = 20;
		
		System.out.print(t1.x+" "); // 20 10
		System.out.println(t2.x);

	}

}
