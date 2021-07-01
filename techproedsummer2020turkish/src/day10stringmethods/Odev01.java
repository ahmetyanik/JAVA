package day10stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
//		Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, 
//		dördüncü ve sonuncu  rakamlarını ekrana yazdırın
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kredi karti numaranizi giriniz: ");
		String num = scanner.nextLine();
				
		System.out.println("Kartinizin ücüncü numarasi: "+num.charAt(2));
		System.out.println("Kartinizin dördüncü numarasi: "+num.charAt(3));
		System.out.println("Kartinizin sonuncu numarasi: "+num.charAt(num.length()-1));
		

		scanner.close();
	}

}
