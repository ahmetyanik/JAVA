package day11stringmethods;

public class ForLoopFaktöriyelInterview {

	public static void main(String[] args) {
		
		long product = 1;
		
		for(int i=1;i<=9;i++) {
			product*=i;
		}System.out.println("9!: "+product);
	
		
		String a= "1234";
		int b = Integer.parseInt(a);
		
		System.out.println(b-12);
	}

}
