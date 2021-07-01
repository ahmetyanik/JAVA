package Day03;

import java.util.Scanner;

public class Alistirma01 {

	public static void main(String[] args) {
		// ekrana adinizi ve soyadinizi yaziniz
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adiniz: ");
		String str1 = scanner.nextLine();
		
		System.out.print("Soyadiniz: ");
		String str2 = scanner.nextLine();
		
		System.out.println(str1+" "+str2);

	}

}
