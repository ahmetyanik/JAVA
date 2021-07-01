package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		
//		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
//		1. 50 den az - D     2. 50(dahil) ile 60 arası - C       3. 60(dahil) ile 80 arası - B.     4. 80(dahil) ustu- A
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Notunuzu giriniz: ");
		int point = scanner.nextInt();
		
		
		if(point>=0 && point<50) {
			point = 0;
		}else if(point>=50 && point<60){
			point = 50;
		}else if(point>=60 && point<80) {
			point=60;
		}else if(point>=80 && point<=100) {
			point=80;
		}
		
		
		switch(point) {
		
		case 0:
			System.out.println("D");
			break;
		case 50:
			System.out.println("C");
			break;
		case 60:
			System.out.println("B");
			break;
		case 80:
			System.out.println("D");
			break;
		default:
			System.out.println("Gecerli Not Giriniz!");
		
			
		
		}
		
		scanner.close();
	}

}
