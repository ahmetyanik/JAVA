import java.util.Scanner;

public class Deneme7 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Notunuzu Giriniz: ");
		int not = scanner.nextInt();
		
		if (not >=90) {
			System.out.println("Notunuz:AA");
					
		}
		else if (not >=85) {
			System.out.println("Notunuz:BA");
		}
		
		else if (not >=80) {
			System.out.println("Notunuz:BB");
		}
		
		else if (not >=75) {
			System.out.println("Notunuz:CB");
		}
		
		else if (not >=70) {
			System.out.println("Notunuz:CC");
		}
		
		else if (not >=65) {
			System.out.println("Notunuz:DD");
		
		}
		else if (not >=60) {
			System.out.println("Notunuz:FD");
		}
		
		else {
			System.out.println("Kaldiniz...");
		}
	}

}
