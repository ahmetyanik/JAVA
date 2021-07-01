package day18statickeyword;

public class Test05 {

	static int x = 10; //
	
	public static void main(String[] args) {
	
		Test05 t1 = new Test05();
		Test05 t2 = new Test05();
		
		t1.x = 20;
		
		System.out.print(t1.x+" ");
		System.out.println(t2.x);
	//20 20
	}

}
