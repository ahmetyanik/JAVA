package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		//while===> iken demektir
		//while I go to school ===> ben okula giderken
		
		
		int num = 0;
		
		while(num<4) {
			System.out.println("Ali");
			num++;
			
		}
		
		int num2 = 1;
		while(num2<11) {
			System.out.println(num2);
			num2 ++;
		}
		
		int num3 = 1;
		while(num3<21) {
			if(num3%2==0)
			System.out.print(num3);
			num3 ++;
		}
		System.out.println();
		int num4 = 5;
		while(num4<121) {
			if(num4%3==0) {
				System.out.print(num4+" ");
		}num4 ++;
		
	}
	}
}
