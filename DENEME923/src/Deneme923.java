import java.util.Scanner;

public class Deneme923 {

	public static void fakt�riyel() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("L�tfen sayi giriniz: ");	
	int sayi = scanner.nextInt();
	
	int fakt�riyel = 1;
	
	for (int i= 1; i<=sayi;i++)  {
		
		fakt�riyel *= i;		
	}
	System.out.println("Fakt�riyel: "+fakt�riyel);	
	
	}
	
	public static void main(String[] args) {
		
	fakt�riyel();
	fakt�riyel();

	}
	
}
