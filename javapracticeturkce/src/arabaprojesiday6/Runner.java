package arabaprojesiday6;

public class Runner {

	public static void main(String[] args) {
	
//		reference type          object type
		Car araba1        =     new Honda();
		
	
		
		Car araba2        =     new Honda("Jazz", 2020);
		
		System.out.println(araba2.arabaMarkasi());
		System.out.println(araba2.arabaModeli());
		System.out.println(araba2.arabaYear());
		
		
		

	}

}
