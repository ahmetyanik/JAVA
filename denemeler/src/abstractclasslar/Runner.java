package abstractclasslar;

public class Runner {

	public static void main(String[] args) {

		
		Oda1 oda1 = new Oda1();
		
		oda1.pencere();
		oda1.tuvalet();
		oda1.kapi();
		oda1.internet(3);
		oda1.tv();
		
		System.out.println("*****************");
		
		Oda2 oda2 = new Oda2();
		
		oda2.pencere();
		oda2.tuvalet();
		oda2.kapi();
		oda2.internet(2);
		oda1.tv();
		
		
		
	}

}
