package day08ternaryoperator;

import java.util.Scanner;

public class OdevTenaryOperator3 {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir tamsayi giriniz: ");
		int num = scanner.nextInt();
		
		int result = num>0 ? num : (num*-1);
		System.out.println(num+"'in mutlak degeri "+result+"'dir");
		
		scanner.close();

	}

}
