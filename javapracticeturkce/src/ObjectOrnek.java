import java.util.Scanner;

public class ObjectOrnek {

	public static void main(String[] args) {
		
	System.out.print("Elmasin orta nokta sayisini giriniz: ");
	Scanner scanner = new Scanner(System.in);
	int orta = scanner.nextInt();
	int i, j;
	
	
	for(i=0;i<=orta;i++ ) {
		
		for(j=1;j<=orta-i;j++) {
			
			System.out.print(" ");
		}
		
		for(j=1;j<=2*i-1;j++) {
			
			System.out.print("*");
			
		}
		
		System.out.println();
	}
	
	for(i=orta-1;i>=1;i--) {
		
		for(j=1;j<=orta-i;j++) {
			
			System.out.print(" ");
		}
		
		for(j=1;j<=2*i-1;j++) {
			
			System.out.print("*");
		}
		
		System.out.println();
	}		
		
	}

}
